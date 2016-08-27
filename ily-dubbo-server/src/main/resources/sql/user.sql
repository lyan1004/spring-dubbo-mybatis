/*  
Navicat MySQL Data Transfer  
  
Source Server         : 127.0.0.1  
Source Server Version : 50627  
Source Host           : localhost:3306  
Source Database       : ily  
  
Target Server Type    : MYSQL  
Target Server Version : 50627  
File Encoding         : 65001  
  
Date: 2015-11-13 11:19:18  
*/  
  
SET FOREIGN_KEY_CHECKS=0;  
  
-- ----------------------------  
-- Table structure for user  
-- ----------------------------  
DROP TABLE IF EXISTS `user`;  
CREATE TABLE `user` (  
  `id` int(11) NOT NULL,  
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `age` int(11) DEFAULT NULL,  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci; 