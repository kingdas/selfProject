/*
Navicat MySQL Data Transfer

Source Server         : jins
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : jinsmes

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-11-16 20:59:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sysworkliner`
-- ----------------------------
DROP TABLE IF EXISTS `sysworkliner`;
CREATE TABLE `sysworkliner` (
  `LinerId` int(50) NOT NULL AUTO_INCREMENT,
  `LinerName` varchar(50) DEFAULT NULL,
  `LinerAdmin` varchar(50) DEFAULT NULL,
  `ShopId` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`LinerId`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysworkliner
-- ----------------------------
INSERT INTO `sysworkliner` VALUES ('1', '2', '赵某', '1');
INSERT INTO `sysworkliner` VALUES ('2', '1', '李某', '2');
INSERT INTO `sysworkliner` VALUES ('3', '3', '王某', '3');
INSERT INTO `sysworkliner` VALUES ('4', '3', 'cheng', '2');
INSERT INTO `sysworkliner` VALUES ('5', '1', 'li', '3');
INSERT INTO `sysworkliner` VALUES ('6', '2', 'zhao', '2');
INSERT INTO `sysworkliner` VALUES ('7', '1', 'qing', '1');
INSERT INTO `sysworkliner` VALUES ('9', '2', 'savd ', '2');
INSERT INTO `sysworkliner` VALUES ('10', '3', 'asdf', '1');
INSERT INTO `sysworkliner` VALUES ('11', '2', 'asdf', '2');
INSERT INTO `sysworkliner` VALUES ('12', '1', 'wer', '1');
INSERT INTO `sysworkliner` VALUES ('13', '3', 'hkjh', '2');
INSERT INTO `sysworkliner` VALUES ('14', '2', 'bvmnb', '1');
INSERT INTO `sysworkliner` VALUES ('15', '3', 'vbnd', '2');
INSERT INTO `sysworkliner` VALUES ('16', '2', 'iukhg', '1');
INSERT INTO `sysworkliner` VALUES ('17', '2', 'tyjj', '2');
INSERT INTO `sysworkliner` VALUES ('18', '1', 'sdf', '1');
INSERT INTO `sysworkliner` VALUES ('19', '3', ',mnm,z', '3');
INSERT INTO `sysworkliner` VALUES ('20', '1', 'rgdsgf', '2');
INSERT INTO `sysworkliner` VALUES ('21', '2', 'yy', '2');
INSERT INTO `sysworkliner` VALUES ('22', '2', 'asf', '2');
INSERT INTO `sysworkliner` VALUES ('24', '3', 'wan', '3');
