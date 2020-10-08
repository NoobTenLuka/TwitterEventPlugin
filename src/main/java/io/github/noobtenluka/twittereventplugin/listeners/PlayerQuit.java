package io.github.noobtenluka.twittereventplugin.listeners;

import io.github.noobtenluka.twittereventplugin.util.SendTweet;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import twitter4j.TwitterException;

public class PlayerQuit implements Listener {

    @EventHandler
    public void handlePlayerQuit(PlayerQuitEvent event) {
        try {
            SendTweet.sendTweet("Player " + event.getPlayer().getName() + " left the Minecraft Server.");
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

}
