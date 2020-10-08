#!/bin/sh

export twitter4j.debug=true
export twitter4j.oauth.consumerKey=*************************
export twitter4j.oauth.consumerSecret=**************************************************
export twitter4j.oauth.accessToken=*******************-******************************
export twitter4j.oauth.accessTokenSecret=*********************************************

java -Xms#G -Xmx#G -XX:+UseG1GC -jar spigot.jar nogui
