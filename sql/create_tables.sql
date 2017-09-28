
CREATE TABLE `user` (
  `username` varchar(256) NOT NULL,
  `email` varchar(256) NOT NULL,
  `enabled` tinyint(1) DEFAULT NULL,
  `created_at` date DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB;

CREATE TABLE `authorities` (
  `username` varchar(256) NOT NULL,
  `authority` varchar(256) NOT NULL,
  PRIMARY KEY (`username`,`authority`)
) ENGINE=InnoDB;

insert into user (username, password, email) values ('brian', 'brian', 'bsbam25@gmail.com');

insert into authorities (username, authority) values ('brian', 'ROLE_USER');