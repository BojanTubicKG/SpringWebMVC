-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: web_prodavnica
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `prodaja`
--

DROP TABLE IF EXISTS `prodaja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prodaja` (
  `prodaja_id` int(11) NOT NULL AUTO_INCREMENT,
  `kolicina` int(11) NOT NULL,
  `kupci_id` int(11) NOT NULL,
  `proizvodi_id` int(11) NOT NULL,
  `vreme` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`prodaja_id`),
  KEY `fk_1_idx` (`proizvodi_id`),
  KEY `fk_2_idx` (`kupci_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prodaja`
--

LOCK TABLES `prodaja` WRITE;
/*!40000 ALTER TABLE `prodaja` DISABLE KEYS */;
INSERT INTO `prodaja` VALUES (1,3,1,2,'2016-05-11 13:28:08'),(2,12,3,5,'2016-05-11 13:29:09'),(3,12,4,5,'2016-05-11 13:50:22'),(4,56,2,4,'2016-05-11 14:14:55'),(5,1,1,3,'2016-05-11 14:27:00'),(6,1,1,3,'2016-05-11 14:31:21'),(7,1,3,3,'2016-05-11 15:18:31'),(8,2,1,3,'2016-05-11 15:23:46'),(9,2,1,3,'2016-05-11 15:32:26'),(10,4,1,3,'2016-05-11 15:42:18'),(11,0,0,0,'2016-05-11 15:42:22'),(12,4,3,4,'2016-05-11 17:05:25'),(13,5,11,4,'2016-05-11 17:25:50'),(14,5,11,4,'2016-05-11 17:26:35'),(15,5,2,5,'2016-05-11 17:29:24'),(16,0,0,0,'2016-05-11 17:33:42'),(17,0,0,0,'2016-05-11 17:33:44'),(18,0,0,0,'2016-05-11 17:33:45'),(19,0,0,0,'2016-05-11 17:34:13'),(20,5,1,4,'2016-05-12 09:32:04'),(21,3,5,5,'2016-05-12 09:51:54'),(22,0,0,0,'2016-05-12 09:54:35');
/*!40000 ALTER TABLE `prodaja` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-12  9:58:07