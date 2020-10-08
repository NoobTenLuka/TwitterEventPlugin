#!/bin/sh

twitter4j.debug=true
twitter4j.oauth.consumerKey=*************************
twitter4j.oauth.consumerSecret=**************************************************
twitter4j.oauth.accessToken=*******************-******************************
twitter4j.oauth.accessTokenSecret=*********************************************

java -Xms#G -Xmx#G -XX:+UseG1GC -jar spigot.jar nogui
