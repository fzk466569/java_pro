/*
Navicat MySQL Data Transfer

Source Server         : 111111111
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : webshop

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-10-21 11:15:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for fzk_admin
-- ----------------------------
DROP TABLE IF EXISTS `fzk_admin`;
CREATE TABLE `fzk_admin` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fzk_admin
-- ----------------------------
INSERT INTO `fzk_admin` VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Table structure for fzk_cart
-- ----------------------------
DROP TABLE IF EXISTS `fzk_cart`;
CREATE TABLE `fzk_cart` (
  `cart_id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) NOT NULL,
  `product_id` int(10) NOT NULL,
  `product_num` int(10) NOT NULL,
  PRIMARY KEY (`cart_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fzk_cart
-- ----------------------------
INSERT INTO `fzk_cart` VALUES ('1', '2', '34', '2');

-- ----------------------------
-- Table structure for fzk_order
-- ----------------------------
DROP TABLE IF EXISTS `fzk_order`;
CREATE TABLE `fzk_order` (
  `order_id` int(10) NOT NULL,
  `order_dataid` bigint(20) NOT NULL,
  `product_id` int(10) NOT NULL,
  `product_name` varchar(50) NOT NULL,
  `product_maney` decimal(10,1) NOT NULL,
  `product_num` int(5) NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fzk_order
-- ----------------------------

-- ----------------------------
-- Table structure for fzk_product
-- ----------------------------
DROP TABLE IF EXISTS `fzk_product`;
CREATE TABLE `fzk_product` (
  `product_id` int(5) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(50) NOT NULL,
  `product_text` text NOT NULL,
  `product_keys` varchar(50) NOT NULL,
  `product_logo` varchar(100) DEFAULT NULL,
  `product_price` decimal(10,1) NOT NULL,
  `product_stock` int(3) NOT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fzk_product
-- ----------------------------
INSERT INTO `fzk_product` VALUES ('29', '123', '12312312', '3123123123', '/upload/1476963319360.jpg', '312.0', '123123');
INSERT INTO `fzk_product` VALUES ('35', '123', '3123', '213', '/upload/1477018168239.jpg', '123.0', '12312');
INSERT INTO `fzk_product` VALUES ('34', '椅子', '12', '好椅子', '/upload/1477017888110.jpg', '100.0', '1212');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `createdate` float(20,0) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tel` varchar(20) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=MyISAM AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'zhangsan', '11', '0', '', '');
INSERT INTO `users` VALUES ('2', '2', '2', '0', '', '');
INSERT INTO `users` VALUES ('4', 'fzk', 'fzk', '0', '', '');
INSERT INTO `users` VALUES ('3', 'wo', 'wo', '0', '', '');
INSERT INTO `users` VALUES ('5', '333', '333', '0', '', '');
INSERT INTO `users` VALUES ('11', '2', '3', '1476857823232', '5', '6');
INSERT INTO `users` VALUES ('10', '1', '2', '1476857692160', '4', '5');
INSERT INTO `users` VALUES ('8', '1', '2', '1476857692160', '4', '5');
INSERT INTO `users` VALUES ('9', '1', '2', '1476857692160', '4', '5');
INSERT INTO `users` VALUES ('14', '1', '1', '1476935155712', '1', '1');
INSERT INTO `users` VALUES ('15', '1', '2', '1476935155712', '1', '1');
INSERT INTO `users` VALUES ('20', 'liuchen', '123', '1476954685440', '1@1.com', '18435155555');
INSERT INTO `users` VALUES ('23', '111', '111', '1477017468928', '111', '111');
INSERT INTO `users` VALUES ('24', 'fzk666', '123', '1477017731072', '1205436843@qq.com', '123');
INSERT INTO `users` VALUES ('25', 'tianjia', '111', '1477017993216', '1205436843@qq.com', '123');
INSERT INTO `users` VALUES ('26', 'tianjia', '111', '1477017993216', '1205436843@qq.com', '123');
