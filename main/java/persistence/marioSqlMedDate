-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: mario
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
                         `order_nr` int NOT NULL AUTO_INCREMENT,
                         `pizza_id` int NOT NULL,
                         `amount` int NOT NULL,
                         `pickup_time` int NOT NULL,
                         `order_time` timestamp(2) NOT NULL,
                         `date` date DEFAULT NULL,
                         `custemor_name` varchar(45) NOT NULL,
                         `phone` varchar(45) NOT NULL,
                         `remove` tinyint NOT NULL,
                         PRIMARY KEY (`order_nr`),
                         KEY `pizza_no_idx` (`pizza_id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (23,2,4,1200,'2020-12-17 23:26:17.00','2020-12-20','Søren','456',0),(24,3,5,1300,'2020-12-17 23:26:17.00','2020-12-18','Søren','456',0),(25,3,32,1100,'2020-12-17 23:26:17.00','2020-12-18','Søren','456',0),(26,4,1,1000,'2020-12-17 23:26:17.00','2020-12-18','Søren','456',0),(27,4,2,1400,'2020-12-16 23:26:17.00','2020-12-17','Søren','456',0),(28,3,4,1300,'2020-12-16 23:26:17.00','2020-12-17','Søren','456',0),(29,1,6,1000,'2020-12-16 23:26:17.00','2020-12-17','Søren','456',0),(30,2,4,900,'2020-12-18 11:20:28.00','2020-12-18','THor','654',0);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pizza`
--

DROP TABLE IF EXISTS `pizza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pizza` (
                         `pizza_id` int NOT NULL AUTO_INCREMENT,
                         `pizza_no` int NOT NULL,
                         `name` varchar(45) NOT NULL,
                         `ingredients` varchar(45) NOT NULL,
                         `price` int NOT NULL,
                         PRIMARY KEY (`pizza_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pizza`
--

LOCK TABLES `pizza` WRITE;
/*!40000 ALTER TABLE `pizza` DISABLE KEYS */;
INSERT INTO `pizza` VALUES (1,1,'Vesuvio','ost, skinke og tomat',70),(2,2,'Amerikaner','ost, kebab og løg',80),(3,3,'Diavola','Ost, Chillie, pepperonie oghvildløg ',75),(4,4,'Hawai','ost,  skinke og annanas',100),(5,5,'Rønne','ost, tomat, skinke, champingon',100),(6,6,'Halse','Rejer, hvidløg, ost og tomat',100);
/*!40000 ALTER TABLE `pizza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statistik`
--

DROP TABLE IF EXISTS `statistik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `statistik` (
                             `pizza_id` int NOT NULL,
                             `amount` int DEFAULT NULL,
                             `income` int DEFAULT NULL,
                             PRIMARY KEY (`pizza_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statistik`
--

LOCK TABLES `statistik` WRITE;
/*!40000 ALTER TABLE `statistik` DISABLE KEYS */;
/*!40000 ALTER TABLE `statistik` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-21 11:15:56