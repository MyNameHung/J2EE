CREATE DATABASE  IF NOT EXISTS `db_cnpt` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_cnpt`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: db_cnpt
-- ------------------------------------------------------
-- Server version	5.6.20

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
-- Table structure for table `tb_baiviet`
--

DROP TABLE IF EXISTS `tb_baiviet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_baiviet` (
  `ma_baiviet` int(11) NOT NULL AUTO_INCREMENT,
  `tieude` varchar(30) NOT NULL,
  `noidung` text NOT NULL,
  `mota_baiviet` text,
  `hinhanh` text,
  `ma_sub` int(11) DEFAULT NULL,
  `ma_kh` int(11) NOT NULL,
  PRIMARY KEY (`ma_baiviet`),
  KEY `ma_kh` (`ma_kh`),
  KEY `ma_sub` (`ma_sub`),
  CONSTRAINT `tb_baiviet_ibfk_1` FOREIGN KEY (`ma_kh`) REFERENCES `tb_khachhang` (`ma_kh`),
  CONSTRAINT `tb_baiviet_ibfk_2` FOREIGN KEY (`ma_sub`) REFERENCES `tb_sub` (`ma_sub`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_baiviet`
--

LOCK TABLES `tb_baiviet` WRITE;
/*!40000 ALTER TABLE `tb_baiviet` DISABLE KEYS */;
INSERT INTO `tb_baiviet` VALUES (1,'baiviet 1','noidung',NULL,'hinhanh',1,1);
/*!40000 ALTER TABLE `tb_baiviet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_baohanh`
--

DROP TABLE IF EXISTS `tb_baohanh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_baohanh` (
  `ma_baohanh` int(11) NOT NULL AUTO_INCREMENT,
  `ma_sp` int(11) NOT NULL,
  `ngaybaohanh` date NOT NULL,
  `phibaohanh` mediumtext NOT NULL,
  PRIMARY KEY (`ma_baohanh`),
  KEY `ma_sp` (`ma_sp`),
  CONSTRAINT `tb_baohanh_ibfk_1` FOREIGN KEY (`ma_sp`) REFERENCES `tb_sanpham` (`ma_sp`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_baohanh`
--

LOCK TABLES `tb_baohanh` WRITE;
/*!40000 ALTER TABLE `tb_baohanh` DISABLE KEYS */;
INSERT INTO `tb_baohanh` VALUES (1,1,'2015-02-02','1000');
/*!40000 ALTER TABLE `tb_baohanh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_category`
--

DROP TABLE IF EXISTS `tb_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_category` (
  `ma_category` int(11) NOT NULL AUTO_INCREMENT,
  `ten_category` varchar(30) DEFAULT NULL,
  `mota_category` text,
  PRIMARY KEY (`ma_category`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_category`
--

LOCK TABLES `tb_category` WRITE;
/*!40000 ALTER TABLE `tb_category` DISABLE KEYS */;
INSERT INTO `tb_category` VALUES (1,'Dien tu','mo ta'),(2,'Dien tu','mo ta'),(3,'Dien tu','mo ta'),(4,'Dien tu','mo ta'),(5,'Die abc','mo ta');
/*!40000 ALTER TABLE `tb_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_cthoadon`
--

DROP TABLE IF EXISTS `tb_cthoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_cthoadon` (
  `Ma_cthd` int(11) NOT NULL AUTO_INCREMENT,
  `ma_sp` int(11) NOT NULL,
  `soluong` int(11) DEFAULT '1',
  `gia` mediumtext NOT NULL,
  `ma_hoadon` int(11) NOT NULL,
  PRIMARY KEY (`Ma_cthd`),
  KEY `ma_hoadon` (`ma_hoadon`),
  KEY `ma_sp` (`ma_sp`),
  CONSTRAINT `tb_cthoadon_ibfk_1` FOREIGN KEY (`ma_hoadon`) REFERENCES `tb_hoadon` (`Ma_Hoadon`),
  CONSTRAINT `tb_cthoadon_ibfk_2` FOREIGN KEY (`ma_sp`) REFERENCES `tb_sanpham` (`ma_sp`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cthoadon`
--

LOCK TABLES `tb_cthoadon` WRITE;
/*!40000 ALTER TABLE `tb_cthoadon` DISABLE KEYS */;
INSERT INTO `tb_cthoadon` VALUES (1,1,10,'17000',1);
/*!40000 ALTER TABLE `tb_cthoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_hangsx`
--

DROP TABLE IF EXISTS `tb_hangsx`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_hangsx` (
  `ma_hangsx` int(11) NOT NULL AUTO_INCREMENT,
  `tenhangsx` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ma_hangsx`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_hangsx`
--

LOCK TABLES `tb_hangsx` WRITE;
/*!40000 ALTER TABLE `tb_hangsx` DISABLE KEYS */;
INSERT INTO `tb_hangsx` VALUES (1,'Hoa phat');
/*!40000 ALTER TABLE `tb_hangsx` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_hoadon`
--

DROP TABLE IF EXISTS `tb_hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_hoadon` (
  `Ma_Hoadon` int(11) NOT NULL AUTO_INCREMENT,
  `ma_kh` int(11) NOT NULL,
  `Ngaydathang` datetime NOT NULL,
  `NgayGiaoHang` datetime NOT NULL,
  `Tinhtrang` tinyint(1) DEFAULT '1',
  `Tonggiatri` mediumtext,
  PRIMARY KEY (`Ma_Hoadon`),
  KEY `ma_kh` (`ma_kh`),
  CONSTRAINT `tb_hoadon_ibfk_1` FOREIGN KEY (`ma_kh`) REFERENCES `tb_khachhang` (`ma_kh`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_hoadon`
--

LOCK TABLES `tb_hoadon` WRITE;
/*!40000 ALTER TABLE `tb_hoadon` DISABLE KEYS */;
INSERT INTO `tb_hoadon` VALUES (1,1,'2012-02-04 00:00:00','2012-02-05 00:00:00',0,'10000');
/*!40000 ALTER TABLE `tb_hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_khachhang`
--

DROP TABLE IF EXISTS `tb_khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_khachhang` (
  `ma_kh` int(11) NOT NULL AUTO_INCREMENT,
  `taikhoan` varchar(30) NOT NULL,
  `matkhau` varchar(30) NOT NULL,
  `ten_kh` varchar(30) DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `gioitinh` int(11) DEFAULT '0',
  `nghenghiep` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `DienThoai` mediumtext NOT NULL,
  `quantri` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`ma_kh`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_khachhang`
--

LOCK TABLES `tb_khachhang` WRITE;
/*!40000 ALTER TABLE `tb_khachhang` DISABLE KEYS */;
INSERT INTO `tb_khachhang` VALUES (1,'taikhoan1','matkhau','hung','1993-09-02',1,'sinh vien','fsfsdf@gmail','35325645',1);
/*!40000 ALTER TABLE `tb_khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_nganhcn`
--

DROP TABLE IF EXISTS `tb_nganhcn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_nganhcn` (
  `ma_nganh` int(11) NOT NULL AUTO_INCREMENT,
  `tennganh` varchar(30) NOT NULL,
  `mota_nganhcn` text,
  PRIMARY KEY (`ma_nganh`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_nganhcn`
--

LOCK TABLES `tb_nganhcn` WRITE;
/*!40000 ALTER TABLE `tb_nganhcn` DISABLE KEYS */;
INSERT INTO `tb_nganhcn` VALUES (1,'dien tu gia dung','thong thuong');
/*!40000 ALTER TABLE `tb_nganhcn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_nguoinhan`
--

DROP TABLE IF EXISTS `tb_nguoinhan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_nguoinhan` (
  `ma_nguoinhan` int(11) NOT NULL AUTO_INCREMENT,
  `ma_hoadon` int(11) NOT NULL,
  `tennguoinhan` varchar(30) NOT NULL,
  `tentinh` varchar(30) NOT NULL,
  `DiaChi` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ma_nguoinhan`),
  KEY `ma_hoadon` (`ma_hoadon`),
  CONSTRAINT `tb_nguoinhan_ibfk_1` FOREIGN KEY (`ma_hoadon`) REFERENCES `tb_hoadon` (`Ma_Hoadon`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_nguoinhan`
--

LOCK TABLES `tb_nguoinhan` WRITE;
/*!40000 ALTER TABLE `tb_nguoinhan` DISABLE KEYS */;
INSERT INTO `tb_nguoinhan` VALUES (1,1,'nguoinhan 1','daklak','mdrak - daklak');
/*!40000 ALTER TABLE `tb_nguoinhan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_phanhoi`
--

DROP TABLE IF EXISTS `tb_phanhoi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_phanhoi` (
  `ma_phanhoi` int(11) NOT NULL AUTO_INCREMENT,
  `ma_kh` int(11) NOT NULL,
  `noidung` text,
  `ma_sp` int(11) NOT NULL,
  PRIMARY KEY (`ma_phanhoi`),
  KEY `ma_kh` (`ma_kh`),
  KEY `ma_sp` (`ma_sp`),
  CONSTRAINT `tb_phanhoi_ibfk_1` FOREIGN KEY (`ma_kh`) REFERENCES `tb_khachhang` (`ma_kh`),
  CONSTRAINT `tb_phanhoi_ibfk_2` FOREIGN KEY (`ma_sp`) REFERENCES `tb_sanpham` (`ma_sp`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_phanhoi`
--

LOCK TABLES `tb_phanhoi` WRITE;
/*!40000 ALTER TABLE `tb_phanhoi` DISABLE KEYS */;
INSERT INTO `tb_phanhoi` VALUES (1,1,'san pham deu',1);
/*!40000 ALTER TABLE `tb_phanhoi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_phutro`
--

DROP TABLE IF EXISTS `tb_phutro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_phutro` (
  `ma_phutro` int(11) NOT NULL AUTO_INCREMENT,
  `ma_sp` int(11) NOT NULL,
  `ma_nganh` int(11) NOT NULL,
  `ungdung` text,
  PRIMARY KEY (`ma_phutro`),
  KEY `ma_sp` (`ma_sp`),
  KEY `ma_nganh` (`ma_nganh`),
  CONSTRAINT `tb_phutro_ibfk_1` FOREIGN KEY (`ma_sp`) REFERENCES `tb_sanpham` (`ma_sp`),
  CONSTRAINT `tb_phutro_ibfk_2` FOREIGN KEY (`ma_nganh`) REFERENCES `tb_nganhcn` (`ma_nganh`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_phutro`
--

LOCK TABLES `tb_phutro` WRITE;
/*!40000 ALTER TABLE `tb_phutro` DISABLE KEYS */;
INSERT INTO `tb_phutro` VALUES (1,1,1,'ung dung');
/*!40000 ALTER TABLE `tb_phutro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_sanpham`
--

DROP TABLE IF EXISTS `tb_sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_sanpham` (
  `ma_sp` int(11) NOT NULL AUTO_INCREMENT,
  `tensp` varchar(30) NOT NULL,
  `ngaynhap` datetime NOT NULL,
  `gianhap` mediumtext NOT NULL,
  `giaxuat` mediumtext NOT NULL,
  `soluongnhap` int(11) DEFAULT '1',
  `tinhtrang` tinyint(1) DEFAULT '1',
  `noibat` tinyint(1) DEFAULT '0',
  `kichthuoc` float DEFAULT NULL,
  `trongluong` float DEFAULT NULL,
  `loai` varchar(30) DEFAULT NULL,
  `mota_sp` text,
  `cachtinhgia` varchar(20) DEFAULT NULL,
  `anh_sp` text,
  `ma_hangsx` int(11) NOT NULL,
  `thoigianbaohanh` date NOT NULL,
  `ma_sub` int(11) NOT NULL,
  PRIMARY KEY (`ma_sp`),
  KEY `ma_sub` (`ma_sub`),
  KEY `ma_hangsx` (`ma_hangsx`),
  CONSTRAINT `FK_at29msw34w344k9wkm3n1on0x` FOREIGN KEY (`ma_sp`) REFERENCES `tb_hangsx` (`ma_hangsx`),
  CONSTRAINT `tb_sanpham_ibfk_1` FOREIGN KEY (`ma_sub`) REFERENCES `tb_sub` (`ma_sub`),
  CONSTRAINT `tb_sanpham_ibfk_2` FOREIGN KEY (`ma_hangsx`) REFERENCES `tb_hangsx` (`ma_hangsx`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_sanpham`
--

LOCK TABLES `tb_sanpham` WRITE;
/*!40000 ALTER TABLE `tb_sanpham` DISABLE KEYS */;
INSERT INTO `tb_sanpham` VALUES (1,'san pham 1','1993-03-03 00:00:00','1000','1000',10,1,1,10.4,10.3,'thong thuong','mota','don','anh',1,'2015-01-01',1);
/*!40000 ALTER TABLE `tb_sanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_slider`
--

DROP TABLE IF EXISTS `tb_slider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_slider` (
  `ma_slider` int(11) NOT NULL AUTO_INCREMENT,
  `anh_slider` text,
  `mota_slider` text,
  PRIMARY KEY (`ma_slider`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_slider`
--

LOCK TABLES `tb_slider` WRITE;
/*!40000 ALTER TABLE `tb_slider` DISABLE KEYS */;
INSERT INTO `tb_slider` VALUES (1,'anh','mota');
/*!40000 ALTER TABLE `tb_slider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_sub`
--

DROP TABLE IF EXISTS `tb_sub`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_sub` (
  `ma_sub` int(11) NOT NULL AUTO_INCREMENT,
  `ten_sub` varchar(30) DEFAULT NULL,
  `ma_category` int(11) NOT NULL,
  `mota_sub` text,
  PRIMARY KEY (`ma_sub`),
  KEY `ma_category` (`ma_category`),
  CONSTRAINT `tb_sub_ibfk_1` FOREIGN KEY (`ma_category`) REFERENCES `tb_category` (`ma_category`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_sub`
--

LOCK TABLES `tb_sub` WRITE;
/*!40000 ALTER TABLE `tb_sub` DISABLE KEYS */;
INSERT INTO `tb_sub` VALUES (1,'sub1',1,'mota');
/*!40000 ALTER TABLE `tb_sub` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_cnpt'
--

--
-- Dumping routines for database 'db_cnpt'
--
/*!50003 DROP FUNCTION IF EXISTS `insert_category` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`hung`@`%` FUNCTION `insert_category`(
_ten varchar(30),
_mota text
) RETURNS int(11)
BEGIN

declare valid_name boolean;
declare exit handler for  sqlexception return -1;

set valid_name  = (select count(_ten) from tb_category where ten = _ten) > 0;

if valid_name = true then return -2; end if;
if length(_ten) < 3 then return -3; end if;

insert into tb_category values(
null,
_ten,
_mota
);

return (select Last_insert_id() );

RETURN -1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `category_get_all` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`hung`@`%` PROCEDURE `category_get_all`()
BEGIN

select * from tb_category where 1 ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `category_get_all_post` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`hung`@`%` PROCEDURE `category_get_all_post`(id_category int ,amount int )
BEGIN

-- Lấy tất cả bài viết của sub
select * from tb_baiviet where 
ma_sub in 
-- Lấy tất cả  sub thuộc category.
(select ma_sub from tb_sub where ma_category = id_category);


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `category_get_product` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`hung`@`%` PROCEDURE `category_get_product`(page_index int , amount int)
BEGIN
declare end_page_index int;
set end_page_index = (page_index + amount);
-- Lấy amount sản phẩm từ trang page_index
select * from tb_sanpham where 1 limit page_index ,end_page_index;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `category_get_product_featured` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`hung`@`%` PROCEDURE `category_get_product_featured`(amount int)
BEGIN

-- Lấy amount sản phẩm nổi bật
select * from tb_sanpham where noibat = 1 order by ngaynhap desc
limit 0,amount;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `category_get_product_filter` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`hung`@`%` PROCEDURE `category_get_product_filter`(
_hangsx VARCHAR(255) ,
_nganhcn varchar(255),
_giaban1 long,
_giaban2 long
)
BEGIN

-- declare condition_hangsx bool
-- Lấy tất cả sản phẩm thuộc hãng, phụ trợ cho ngành, có giá
select * from tb_sanpham,tb_phutro where 
find_in_set(ma_hangsx,_hangsx)
and 
find_in_set(ma_nganh,_nganhcn)
and 
-- bán từ giá 1 -> giá 2
_giaban1 < giaxuat
and 
_giaban2 > giaxuat;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `category_get_product_new` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`hung`@`%` PROCEDURE `category_get_product_new`(id_category int,amount int)
BEGIN

-- Lấy tất cả sub của category
create temporary table tmp_sub engine=memory 
(select ma_sub from tb_sub where ma_category = id_category);

-- Lấy amount sản phẩm mới nhất của các sub trong bảng trên
select * from tb_sanpham where
ma_sub in (select ma_sub from tmp_sub);


drop temporary table  if exists tmp_sub;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `category_sort` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`hung`@`%` PROCEDURE `category_sort`(
id_category int,
level_sort int
)
BEGIN

case level_sort
-- sắp xếp mới nhât
when 1 then 
	select * from tb_sanpham where 
	ma_category = id_category
	order by ngaynhap desc;
-- sắp xếp nổi bật 
when 2 then
	select * from tb_sanpham where 
	ma_category = id_category
	and noibat = 1
	order by ngaynhap desc;
-- sắp xếp a-z
when 3 then
	select * from tb_sanpham where 
	ma_category = id_category
	order by upper(tensp) asc;
-- sắp xếp z - a
when 4 then
	select * from tb_sanpham where 
	ma_category = id_category
	order by upper(tensp) desc;
-- sắp xếp giá tăng
when 5 then
	select * from tb_sanpham where 
	ma_category = id_category
	order by giaxuat asc;
-- sắp xếp giá giảm
when 6 then
	select * from tb_sanpham where 
	ma_category = id_category
	order by giaxuat desc;
end case;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-06-14 10:27:13
