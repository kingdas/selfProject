/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : andon3

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-11-21 14:39:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sysalarmreason`
-- ----------------------------
DROP TABLE IF EXISTS `sysalarmreason`;
CREATE TABLE `sysalarmreason` (
  `reasonId` int(50) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) DEFAULT NULL,
  `typeId` int(50) DEFAULT NULL,
  PRIMARY KEY (`reasonId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysalarmreason
-- ----------------------------
INSERT INTO `sysalarmreason` VALUES ('1', '工艺', '3');
INSERT INTO `sysalarmreason` VALUES ('6', '设备', '1');
INSERT INTO `sysalarmreason` VALUES ('12', '质量', '2');
INSERT INTO `sysalarmreason` VALUES ('14', '给他而言', '1');
INSERT INTO `sysalarmreason` VALUES ('15', '原物奉还', '2');

-- ----------------------------
-- Table structure for `sysholiday`
-- ----------------------------
DROP TABLE IF EXISTS `sysholiday`;
CREATE TABLE `sysholiday` (
  `holidayId` int(50) NOT NULL AUTO_INCREMENT,
  `holidatName` varchar(50) DEFAULT NULL,
  `holidayStartTime` varchar(50) DEFAULT NULL,
  `holidayEndTime` varchar(50) DEFAULT NULL,
  `shopId` int(50) DEFAULT NULL,
  `linerId` int(50) DEFAULT NULL,
  `placeId` int(50) DEFAULT NULL,
  `shitfId` int(50) DEFAULT NULL,
  PRIMARY KEY (`holidayId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysholiday
-- ----------------------------

-- ----------------------------
-- Table structure for `sysitem`
-- ----------------------------
DROP TABLE IF EXISTS `sysitem`;
CREATE TABLE `sysitem` (
  `itemId` int(50) NOT NULL AUTO_INCREMENT,
  `itemCode` varchar(50) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `crustSource` varchar(50) DEFAULT NULL,
  `program` varchar(50) DEFAULT NULL,
  `oem` varchar(50) DEFAULT NULL,
  `carModel` varchar(50) DEFAULT NULL,
  `component` varchar(50) DEFAULT NULL,
  `hideRatio` varchar(10) DEFAULT NULL,
  `scrap` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`itemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysitem
-- ----------------------------

-- ----------------------------
-- Table structure for `sysuser`
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser` (
  `userId` int(50) NOT NULL AUTO_INCREMENT,
  `userCode` varchar(50) DEFAULT NULL,
  `userPassword` varchar(50) DEFAULT NULL,
  `userName` varchar(50) DEFAULT NULL,
  `userJob` varchar(50) DEFAULT NULL,
  `userEmail` varchar(50) DEFAULT NULL,
  `userMobile` varchar(50) DEFAULT NULL,
  `userWxnd` varchar(50) DEFAULT NULL,
  `userGroup` varchar(50) DEFAULT NULL,
  `userRole` varchar(50) DEFAULT NULL,
  `isLoginer` varchar(50) DEFAULT NULL,
  `isLockPlace` varchar(50) DEFAULT NULL,
  `lockPlaceId` varchar(50) DEFAULT NULL,
  `createUser` varchar(50) DEFAULT NULL,
  `createTime` varchar(50) DEFAULT NULL,
  `lastUpdateUser` varchar(50) DEFAULT NULL,
  `lastUpdateTime` varchar(50) DEFAULT NULL,
  `lastLoginTime` varchar(50) DEFAULT NULL,
  `lastLoginoutTime` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysuser
-- ----------------------------

-- ----------------------------
-- Table structure for `sysworkliner`
-- ----------------------------
DROP TABLE IF EXISTS `sysworkliner`;
CREATE TABLE `sysworkliner` (
  `linerId` int(50) NOT NULL AUTO_INCREMENT,
  `linerName` varchar(50) DEFAULT NULL,
  `linerAdmin` varchar(50) DEFAULT NULL,
  `shopId` int(50) DEFAULT NULL,
  PRIMARY KEY (`linerId`)
) ENGINE=InnoDB AUTO_INCREMENT=323 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysworkliner
-- ----------------------------
INSERT INTO `sysworkliner` VALUES ('222', 'sdf ', 'fd', '1');
INSERT INTO `sysworkliner` VALUES ('321', 'weq', 'qweqw', '2');
INSERT INTO `sysworkliner` VALUES ('322', 'd第一 ', '帝释天', '2');

-- ----------------------------
-- Table structure for `sysworkplace`
-- ----------------------------
DROP TABLE IF EXISTS `sysworkplace`;
CREATE TABLE `sysworkplace` (
  `placeId` int(50) NOT NULL AUTO_INCREMENT,
  `placeName` varchar(50) DEFAULT NULL,
  `placeAdmin` varchar(50) DEFAULT NULL,
  `shopId` int(50) DEFAULT NULL,
  `linerId` int(50) DEFAULT NULL,
  `opid` int(50) DEFAULT NULL,
  PRIMARY KEY (`placeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysworkplace
-- ----------------------------

-- ----------------------------
-- Table structure for `sysworkrest`
-- ----------------------------
DROP TABLE IF EXISTS `sysworkrest`;
CREATE TABLE `sysworkrest` (
  `restId` int(50) NOT NULL AUTO_INCREMENT,
  `restName` varchar(50) DEFAULT NULL,
  `restStartTime` varchar(50) DEFAULT NULL,
  `restEndTime` varchar(50) DEFAULT NULL,
  `shopId` int(50) DEFAULT NULL,
  `linerId` int(50) DEFAULT NULL,
  `placeId` int(50) DEFAULT NULL,
  `shiftId` int(50) DEFAULT NULL,
  PRIMARY KEY (`restId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysworkrest
-- ----------------------------
INSERT INTO `sysworkrest` VALUES ('1', '123', null, null, '3', '2', '1', '1');
INSERT INTO `sysworkrest` VALUES ('2', '123', null, null, '3', '2', '1', '1');
INSERT INTO `sysworkrest` VALUES ('4', '1234', null, null, '1', '2', '1', '1');
INSERT INTO `sysworkrest` VALUES ('7', '12', null, null, '1', '1', '1', '1');
INSERT INTO `sysworkrest` VALUES ('8', '12', '10:20', '11:00', '1', '1', '1', '1');

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

-- ----------------------------
-- Table structure for `sysworkshop`
-- ----------------------------
DROP TABLE IF EXISTS `sysworkshop`;
CREATE TABLE `sysworkshop` (
  `shopId` int(50) NOT NULL AUTO_INCREMENT,
  `shopName` varchar(50) DEFAULT NULL,
  `shopAdmin` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`shopId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysworkshop
-- ----------------------------
