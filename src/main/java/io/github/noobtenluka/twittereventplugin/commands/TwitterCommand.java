package io.github.noobtenluka.twittereventplugin.commands;

import io.github.noobtenluka.twittereventplugin.util.SendTweet;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import twitter4j.TwitterException;

public class TwitterCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("twitter.tweet")) {
            sender.sendMessage("§cYou do not have the right permissions to use this command!");
            return false;
        }

        if (args.length < 1) {
            sender.sendMessage("§cPlease use §6/tweet [tweet]§c!");
            return false;
        }

        String textToTweet;

        if (sender instanceof Player) {
            textToTweet = "Player " + sender.getName() + " wanted you to know: " + String.join(" ", args);
        } else {
            textToTweet = String.join(" ", args);
        }

        if (textToTweet.length() > 280) {
            sender.sendMessage("§cYour message is too long. Please shorten it.");
            return false;
        }

        try {
            SendTweet.sendTweet(textToTweet);
            sender.sendMessage("§aYou tweeted out: §b" + textToTweet);
        } catch (TwitterException e) {
            sender.sendMessage("§cSomething went wrong! Please try again. If you're the owner please check the logs");
            e.printStackTrace();
        }

        return false;
    }
}
