# Hotel-booking application
## Prerequisites
You will need the following things properly installed on your computer:

* [Maven](https://maven.apache.org/)
* [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [MySQL](https://www.mysql.com)

Before using app you must create database on MySQL server. 
To create db use next commands:
````
$ CREATE DATABASE hotel_booking;
````
````
$ use hotel_booking;
````
````
$ CREATE TABLE users (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR (255) NOT NULL,
    email VARCHAR (255) NOT NULL
    );
````
````
$ CREATE TABLE rooms (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    room_number INT NOT NULL,
    room_price FLOAT NOT NULL,
    category VARCHAR (255) NOT NULL,
    description VARCHAR (255) NOT NULL
    );  
````
````
$ CREATE TABLE booking (
      id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
      final_price FLOAT NOT NULL,
      date VARCHAR (255) NOT NULL,
      user_id INT NOT NULL,
      FOREIGN KEY (user_id) REFERENCES users(id) 
      );
````
````
$ CREATE TABLE orders (
   id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
   booking_id INT NOT NULL,
   room_id INT NOT NULL,
   FOREIGN KEY (booking_id) REFERENCES booking(id),
   FOREIGN KEY (room_id) REFERENCES rooms(id),
   breakfast boolean not null default 0,
   cleaning boolean not null default 0
   );
````
To fill db use next commands:
````
$ INSERT INTO `users` VALUES 
    (5,'Anton','anton@done.com'),
    (6,'Oleg','oleg@done.com'),
    (7,'Artur','artur@done.com'),
    (8,'Katya','kate@done.com');
````
````
$ INSERT INTO `rooms` VALUES 
    (3,101,50,'1 person','1 bad ; TV; SP4;'),
    (4,102,100,'2 persons','1 bad ; TV; SP4;'),
    (5,103,150,'2 persons','2 bad ; TV; SP4;'),
    (6,201,200,'lux','2 bad ; TV; SP4;'),
    (7,202,350,'lux','2 bad ; 2TV; SP4;'),
    (8,204,500,'presedent lux','4 bad; 2 bathrooms; 3 TV;'),
    (9,301,100,'1 person','1 bad ; TV; SP4;'),
    (10,302,250,'presedent lux','2 bad ; TV; SP4;');
````
````
$ INSERT INTO `booking` VALUES (1,0,5,'12.12.2012');
````
````
$ INSERT INTO `orders` VALUES (1,1,3,1,0);
````

Before running app you should configure file src/main/resources/application.properties

## Run app
To run app use next command:
````
$ mvn spring-boot:run
              
       
    
          