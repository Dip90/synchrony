DROP TABLE IF EXISTS USERS;
 
CREATE TABLE USERS (
  user_id INT AUTO_INCREMENT  PRIMARY KEY,
  user_name VARCHAR(20) NOT NULL,
  user_password VARCHAR(100) NOT NULL
);