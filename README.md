# Hotel-booking application
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
          date DATETIME  NOT NULL,
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
````  
              
       
    
          