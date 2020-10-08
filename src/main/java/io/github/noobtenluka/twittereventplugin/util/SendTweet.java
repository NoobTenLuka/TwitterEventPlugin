package io.github.noobtenluka.twittereventplugin.util;

import org.bukkit.Bukkit;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class SendTweet {
    public static void sendTweet(String tweet) throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();

        Status status = twitter.updateStatus(tweet);
        Bukkit.getLogger().info("Successfully updated the status to [" + status.getText() + "].");
    }
}
