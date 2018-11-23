/*
Navicat MySQL Data Transfer

Source Server         : .
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : andon

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-11-11 17:40:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sysworkshift`
-- ----------------------------
DROP TABLE IF EXISTS `sysworkshift`;
CREATE TABLE `sysworkshift` (
  `shiftId` int(50) NOT NULL AUTO_INCREMENT,
  `shiftName` varchar(50) DEFAULT NULL,
  `shiftStartTime` varchar(50) DEFAULT NULL,
  `shiftEndTime` varchar(50) DEFAULT NULL,
  `shopId` int(50) DEFAULT NULL,
  `linerId` int(50) DEFAULT NULL,
  `placeId` int(50) DEFAULT NULL,
  PRIMARY KEY (`shiftId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysworkshift
-- ----------------------------
INSERT INTO `sysworkshift` VALUES ('1', '早班', '08:00', '12:00', '1', '2', '3');
INSERT INTO `sysworkshift` VALUES ('4', '晚班', '18:30', '20:30', '2', '3', '2');
INSERT INTO `sysworkshift` VALUES ('10', 'sad', 'asdf', 'fdsaf', '2', '3', '2');
INSERT INTO `sysworkshift` VALUES ('13', '全天', '07:30', '18:00', '3', '3', '2');
INSERT INTO `sysworkshift` VALUES ('14', '32', '11/14/2018 06:10', '05:00', '1', '1', '1');
INSERT INTO `sysworkshift` VALUES ('15', '胜多负少', '06:19', '07:27', '1', '1', '1');
