@echo off
set twitter4j.debug=true
set twitter4j.oauth.consumerKey=*************************
set twitter4j.oauth.consumerSecret=**************************************************
set twitter4j.oauth.accessToken=*******************-******************************
set twitter4j.oauth.accessTokenSecret=*********************************************
java -Xms#G -Xmx#G -XX:+UseG1GC -jar spigot.jar nogui
pause