package io.github.noobtenluka.twittereventplugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class PlayerQuit implements Listener {

    @EventHandler
    public void handlePlayerQuit(PlayerQuitEvent event) {
        Twitter twitter = TwitterFactory.getSingleton();

        try {
            Status status = twitter.updateStatus("Player " + event.getPlayer().getName() + " left the Minecraft Server.");
            Bukkit.getLogger().info("Successfully updated the status to [" + status.getText() + "].");
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

}
