CREATE USER 'ess_sub_admin'@'localhost' IDENTIFIED BY 'adminion';
GRANT ALL PRIVILEGES ON * . * TO 'ess_sub_admin'@'localhost';

CREATE DATABASE IF NOT EXISTS `ess_sub_database`;
USE `ess_sub_database`;

DROP TABLE IF EXISTS `student`;
DROP TABLE IF EXISTS `essays`;
DROP TABLE IF EXISTS `essays_students`;

CREATE TABLE `student` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `first_name` varchar(45) DEFAULT NULL,
 `last_name` varchar(45) DEFAULT NULL,
 `user_name` varchar(45) UNIQUE NOT NULL,
 `password` varchar(45) NOT NULL,
 `email` varchar(45) DEFAULT NULL,
 `act_date` date DEFAULT NULL,
 `dept` varchar(45) DEFAULT NULL,
 `st_desc` varchar(500) DEFAULT NULL,
 `semester` int(45) DEFAULT NULL,
 `passed` int(45) DEFAULT NULL,
 `s_type` boolean DEFAULT FALSE,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `essays`(
	`id` int(11) NOT NULL AUTO_INCREMENT,
    `es_title` varchar(45) NOT NULL,
    `pub_date` date DEFAULT NULL,
    `requirements` varchar(300) NOT NULL,
    `es_desc` varchar(1000) NOT NULL,
    `keywords` varchar(100) NOT NULL,
    `es_type` boolean DEFAULT FALSE,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `essays_student` (
`essays_id` int(11) NOT NULL,
`student_id` int(11) NOT NULL,

PRIMARY KEY (`essays_id`,`student_id`),

KEY `FK_STUDENT_idx` (`student_id`),

CONSTRAINT `FK_ESSAYS_05` FOREIGN KEY (`essays_id`)
REFERENCES `essays` (`id`)
ON DELETE NO ACTION ON UPDATE NO ACTION,

CONSTRAINT `FK_STUDENT` FOREIGN KEY (`student_id`)
REFERENCES `student` (`id`)
ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SELECT * FROM `student`;
SELECT * FROM `essays`;
SELECT * FROM `essays_student`;