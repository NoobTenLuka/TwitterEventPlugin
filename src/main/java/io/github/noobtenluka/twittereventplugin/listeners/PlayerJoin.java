package io.github.noobtenluka.twittereventplugin.listeners;

import io.github.noobtenluka.twittereventplugin.util.SendTweet;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import twitter4j.TwitterException;

public class PlayerJoin implements Listener {

    @EventHandler
    public void handlePlayerJoin(PlayerJoinEvent event) {
        try {
            SendTweet.sendTweet("Player " + event.getPlayer().getName() + " joined the Minecraft Server.");
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

}
