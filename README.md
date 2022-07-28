# SFUBUY
This is a second-hand goods shopping website frame.
## Description
This is a basic second-hand book transaction website, it has user login system and welcome pages, we use  relevant image like books to show our purpose. Our website links to a database of manager and user account.

## Installation 
##### Environment: 
  - Install Java IDE (Eclipse the best)
  - Install Tomcat 8.5
  - Install JDK 1.8.0
  - Install MYSQL (newest version)
  - Install Navicat (not required, but can easily manage the database)
## Runing setup
1.	Setup environment
2.	Install the sql server, if you already have sql server installed, jump to the last step. Then input ‘net start mysql’. (Remember to edit the c3p0-config.xml under project\src for your own sql server host and password)
3.	Set the preferences of IDE. For Eclipse, in preferences/java/installed JREs, add JDK1.8 as new JRE, and apply it. In preferences/server/runtime environments, add tomcat8.5, and change its JRE to JDK1.8.
4.	Import the project as existing project, right click it, in properties/java build path/libraries, make sure that Tomcat and JDK1.8 are both added, if not add them (click add lib, server runtime for tomcat and user library for JDK1.8). Then click add JREs, add all package under project\WebContent\WEB-INF\lib direction. 
5.	Strat the tomcat server. For Eclipse, there will be a button for server, and tomcat will be shown on it, click it and initialize the server.
6.	Run the project. For Eclipse, click run/run on server, then the website will be shown on the IDE. Or you can access it with URL, like ‘http://localhost:8080’.

## Data Base Management:
1.	Open Navicat, add new link, input host and password, test if it can link to the sql server (remember to net start sql first)
2.	In the new link, click run sql, and chose the shop.sql, then you can edit the database through the Navicat. Reminder, for security, we can only create manager account thought database, so that it limits the normal user.



