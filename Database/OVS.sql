/*
SQLyog Community v9.30 
MySQL - 5.6.25-log : Database - onlinevotesys
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`onlinevotesys` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `onlinevotesys`;

/*Table structure for table `v_parties` */

DROP TABLE IF EXISTS `v_parties`;

CREATE TABLE `v_parties` (
  `ID` bigint(20) NOT NULL,
  `name` varchar(225) DEFAULT NULL,
  `createdBy` varchar(225) DEFAULT NULL,
  `modifiedBy` varchar(225) DEFAULT NULL,
  `createdDatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedDatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `v_parties` */

insert  into `v_parties`(`ID`,`name`,`createdBy`,`modifiedBy`,`createdDatetime`,`modifiedDatetime`) values (1,'Democrats','Hariom@gmail.com','Hariom@gmail.com','2019-02-08 17:06:44','2019-02-08 17:06:44'),(2,'Republicans','Hariom@gmail.com','Hariom@gmail.com','2019-02-08 17:07:17','2019-02-08 17:07:17'),(3,'Independents','Hariom@gmail.com','Hariom@gmail.com','2019-02-08 17:07:48','2019-02-08 17:07:48');

/*Table structure for table `v_user` */

DROP TABLE IF EXISTS `v_user`;

CREATE TABLE `v_user` (
  `ID` bigint(20) NOT NULL,
  `firstName` varchar(225) DEFAULT NULL,
  `lastName` varchar(225) DEFAULT NULL,
  `login` varchar(225) DEFAULT NULL,
  `password` varchar(225) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `mobileNo` varchar(225) DEFAULT NULL,
  `roleId` bigint(20) DEFAULT NULL,
  `gender` varchar(225) DEFAULT NULL,
  `voterId` varchar(225) DEFAULT NULL,
  `createdBy` varchar(225) DEFAULT NULL,
  `modifiedBy` varchar(225) DEFAULT NULL,
  `createdDatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedDatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `v_user` */

insert  into `v_user`(`ID`,`firstName`,`lastName`,`login`,`password`,`dob`,`mobileNo`,`roleId`,`gender`,`voterId`,`createdBy`,`modifiedBy`,`createdDatetime`,`modifiedDatetime`) values (1,'Hammett','Cross','Hariom@gmail.com','123','1997-10-06','9165415598',1,NULL,'4414552','root','root','2019-02-08 17:05:51','2019-02-08 12:25:44'),(2,'Lucas','Woodward','Shubham@gmail.com',NULL,'1998-10-06','9926884703',2,NULL,'5522552','root','root','2019-02-08 17:32:48','2019-02-08 17:32:48');

/*Table structure for table `v_vote` */

DROP TABLE IF EXISTS `v_vote`;

CREATE TABLE `v_vote` (
  `ID` bigint(20) NOT NULL,
  `partyId` bigint(20) DEFAULT NULL,
  `partyName` varchar(225) DEFAULT NULL,
  `voterId` varchar(225) DEFAULT NULL,
  `createdBy` varchar(225) DEFAULT NULL,
  `modifiedBy` varchar(225) DEFAULT NULL,
  `createdDatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedDatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `v_vote` */

insert  into `v_vote`(`ID`,`partyId`,`partyName`,`voterId`,`createdBy`,`modifiedBy`,`createdDatetime`,`modifiedDatetime`) values (1,1,'Democrats','5522552','Shubham@gmail.com','Shubham@gmail.com','2019-02-08 18:41:47','2019-02-08 18:41:20');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
