/*
Navicat MySQL Data Transfer

Source Server         : externalLink
Source Server Version : 50527
Source Host           : 192.168.1.8:3306
Source Database       : big

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-11-16 17:37:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `groups`
-- ----------------------------
DROP TABLE IF EXISTS `groups`;
CREATE TABLE `groups` (
  `groupId` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户组',
  `groupName` varchar(50) DEFAULT NULL COMMENT '用户组名',
  `describeGroup` varchar(50) DEFAULT NULL COMMENT '对组的一段描述',
  PRIMARY KEY (`groupId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of groups
-- ----------------------------
INSERT INTO `groups` VALUES ('2', '技术2组', '技术');
INSERT INTO `groups` VALUES ('3', '技术3组', '技术');
INSERT INTO `groups` VALUES ('4', '设计1组', '设计');
INSERT INTO `groups` VALUES ('5', '设计2组', '设计');
INSERT INTO `groups` VALUES ('6', '设计3组', '设计');
INSERT INTO `groups` VALUES ('7', '设计4组', '设计');
INSERT INTO `groups` VALUES ('8', '营销1组', '营销');
INSERT INTO `groups` VALUES ('9', '营销2组', '营销');
INSERT INTO `groups` VALUES ('10', '营销3组', '营销');
INSERT INTO `groups` VALUES ('11', '营销4组', '营销');
INSERT INTO `groups` VALUES ('16', '都是', '对方是否');
INSERT INTO `groups` VALUES ('17', '多岁的', 'dsfsfs');
INSERT INTO `groups` VALUES ('18', '规范', '规范');
INSERT INTO `groups` VALUES ('19', 'fgfgf', ' 规范');
INSERT INTO `groups` VALUES ('20', '大概', '的观点');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `miaosu` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('11', '经理', '营销2组');
INSERT INTO `role` VALUES ('15', '影响', '影响');
INSERT INTO `role` VALUES ('16', '影响', '影响');
INSERT INTO `role` VALUES ('17', '影响', '影响');
INSERT INTO `role` VALUES ('18', '影响', '影响');
INSERT INTO `role` VALUES ('23', '影响', '影响');
INSERT INTO `role` VALUES ('25', '为  ', '去');
INSERT INTO `role` VALUES ('26', '电风扇', '对方是否');
INSERT INTO `role` VALUES ('27', '放', '闪电');
INSERT INTO `role` VALUES ('28', '惹我', '影');

-- ----------------------------
-- Table structure for `sysholiday`
-- ----------------------------
DROP TABLE IF EXISTS `sysholiday`;
CREATE TABLE `sysholiday` (
  `holidayId` int(50) NOT NULL AUTO_INCREMENT COMMENT 'auto-increment',
  `holidayName` varchar(50) DEFAULT NULL,
  `holidayStartTime` datetime DEFAULT NULL,
  `holidayEndTime` datetime DEFAULT NULL,
  `shopId` varchar(50) DEFAULT NULL,
  `linerId` varchar(50) DEFAULT NULL,
  `placeId` varchar(50) DEFAULT NULL,
  `shiftId` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`holidayId`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysholiday
-- ----------------------------
INSERT INTO `sysholiday` VALUES ('1', '大萨达', '2018-11-15 13:45:26', '2018-11-24 00:00:00', '1', '1', '1', '1');
INSERT INTO `sysholiday` VALUES ('2', '午班', '2018-11-22 00:00:00', '2018-12-01 00:00:00', '1', '1', '1', '2');
INSERT INTO `sysholiday` VALUES ('3', '午班', '2018-11-01 00:00:00', '2018-11-02 00:00:00', '1', '1', '1', '2');
INSERT INTO `sysholiday` VALUES ('4', '萨达打', '2018-10-29 00:00:00', '2018-11-16 00:00:00', '1', '1', '1', '1');
INSERT INTO `sysholiday` VALUES ('31', '萨达', null, null, '1', '1', '1', '1');

-- ----------------------------
-- Table structure for `sysitem`
-- ----------------------------
DROP TABLE IF EXISTS `sysitem`;
CREATE TABLE `sysitem` (
  `itemId` int(50) NOT NULL AUTO_INCREMENT COMMENT '产品ID',
  `itemCode` varchar(50) NOT NULL COMMENT '产品编码',
  `description` varchar(50) NOT NULL COMMENT '产品描述',
  `crustSource` varchar(50) DEFAULT NULL COMMENT '来源',
  `program` varchar(50) DEFAULT NULL COMMENT '程序',
  `oem` varchar(50) DEFAULT NULL COMMENT '品牌',
  `carModel` varchar(50) DEFAULT NULL COMMENT '车型',
  `component` varchar(50) DEFAULT NULL COMMENT '组件',
  `hideRatio` varchar(50) DEFAULT NULL COMMENT '覆盖率',
  `scrap` varchar(50) DEFAULT NULL COMMENT '报废率',
  PRIMARY KEY (`itemId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysitem
-- ----------------------------
INSERT INTO `sysitem` VALUES ('1', '01', 'li;bh', 'k,j', '5', '4', '4', '2', '2', '2');
INSERT INTO `sysitem` VALUES ('2', '02', 'kln', 'kl;', '2', '4', '2', '2', '2', '4');
INSERT INTO `sysitem` VALUES ('3', '03', '产品描述4', '来源3', '3', '2', '2', '3', '95.6%', '5.6%');
INSERT INTO `sysitem` VALUES ('4', '04', '34', '1', '23', '23', '32', '32', '23', '23');

-- ----------------------------
-- Table structure for `sysitemct`
-- ----------------------------
DROP TABLE IF EXISTS `sysitemct`;
CREATE TABLE `sysitemct` (
  `cdId` int(50) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `itemId` int(50) NOT NULL COMMENT '产品ID',
  `opId` int(50) NOT NULL COMMENT '工序ID',
  `ctValue` varchar(50) NOT NULL COMMENT '生产周期',
  `area` varchar(50) DEFAULT NULL COMMENT '面积',
  `pieces` varchar(50) DEFAULT NULL COMMENT '裁片数',
  PRIMARY KEY (`cdId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysitemct
-- ----------------------------
INSERT INTO `sysitemct` VALUES ('2', '1', '1', '9', '24', '76');
INSERT INTO `sysitemct` VALUES ('5', '2', '6', '5', '4', '42');
INSERT INTO `sysitemct` VALUES ('8', '2', '9', '88', '5', '6');

-- ----------------------------
-- Table structure for `sysuser`
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser` (
  `userId` int(50) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `userCode` varchar(50) NOT NULL COMMENT '用户名',
  `userPassword` varchar(50) NOT NULL COMMENT '密码',
  `userName` varchar(50) DEFAULT NULL COMMENT '姓名',
  `userJob` varchar(50) DEFAULT NULL COMMENT '职务',
  `userEmail` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `userMobile` varchar(50) DEFAULT NULL COMMENT '手机',
  `userWXNO` varchar(50) DEFAULT NULL COMMENT '微信号',
  `userGroup` int(10) DEFAULT NULL COMMENT '用户组',
  `userRole` varchar(50) DEFAULT NULL COMMENT '用户角色（一个用户对应一个角色）',
  `isLoginer` int(2) DEFAULT NULL COMMENT '是否允许登录（1为允许，0为不允许）',
  `isLockPlace` int(2) DEFAULT NULL COMMENT '是否绑定工位（1为是，0为否）',
  `lockPlaceId` varchar(50) DEFAULT NULL COMMENT '绑定工位ID号',
  `createUser` varchar(50) DEFAULT NULL COMMENT '创建人',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `lastUpdateUser` varchar(50) DEFAULT NULL COMMENT '最后更新人',
  `lastUpdateTime` datetime DEFAULT NULL COMMENT '最后更新时间',
  `lastLoginTime` datetime DEFAULT NULL COMMENT '最后登录时间',
  `lastLogouTime` datetime DEFAULT NULL COMMENT '最后登出时间',
  PRIMARY KEY (`userId`),
  KEY `group` (`userGroup`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysuser
-- ----------------------------
INSERT INTO `sysuser` VALUES ('1', 'liubei', 'liubei', '刘备', '经理', '123.@qq.com', '123', '123', '1', '经理', '1', '1', '1', '刘备', '2018-10-30 18:13:56', '刘备', '2018-10-30 18:14:14', '2018-10-30 18:14:20', '2018-10-30 18:14:24');
INSERT INTO `sysuser` VALUES ('2', 'guanyu', 'guanyu', '关羽', '技术', '563@qq.com', '644', '841', '1', '技术', '0', '1', '1', '刘备', '2018-11-14 19:21:44', '刘备', '2018-11-14 19:21:57', '2018-11-14 19:22:01', '2018-11-29 19:22:10');
INSERT INTO `sysuser` VALUES ('3', 'zhangfei', 'zhangfei', '张飞', '技术', '564@qq.com', '453', '743', '1', '技术', '0', '1', '1', '刘备', '2018-11-20 19:23:51', '刘备', '2018-12-06 19:24:01', '2018-11-27 19:24:08', '2018-11-22 19:24:16');

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysworkliner
-- ----------------------------
INSERT INTO `sysworkliner` VALUES ('1', '2', '两', '1');
INSERT INTO `sysworkliner` VALUES ('2', '1', '三点', '2');
INSERT INTO `sysworkliner` VALUES ('3', '3', '当时', '3');
INSERT INTO `sysworkliner` VALUES ('4', 'fds', 'dsd', '1');
INSERT INTO `sysworkliner` VALUES ('5', '1', 'fsd', '2');
INSERT INTO `sysworkliner` VALUES ('6', '2', 'ds', '2');
INSERT INTO `sysworkliner` VALUES ('7', '32', 'we', '2');
INSERT INTO `sysworkliner` VALUES ('8', '1', 'ew', '2');
INSERT INTO `sysworkliner` VALUES ('9', '1', 'wq', '3');
INSERT INTO `sysworkliner` VALUES ('10', '1', 'da', '3');

-- ----------------------------
-- Table structure for `sysworkoperation`
-- ----------------------------
DROP TABLE IF EXISTS `sysworkoperation`;
CREATE TABLE `sysworkoperation` (
  `opId` int(30) NOT NULL AUTO_INCREMENT COMMENT '工序ID',
  `opName` varchar(50) NOT NULL COMMENT '工序名称',
  `describeOp` varchar(50) DEFAULT NULL COMMENT '工序描述',
  PRIMARY KEY (`opId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysworkoperation
-- ----------------------------
INSERT INTO `sysworkoperation` VALUES ('1', '加热工序', '技术');
INSERT INTO `sysworkoperation` VALUES ('3', '加热工序', '技术');
INSERT INTO `sysworkoperation` VALUES ('5', '裁剪工序', '生产');
INSERT INTO `sysworkoperation` VALUES ('6', '裁剪工序', '生产');

-- ----------------------------
-- Table structure for `sysworkshift`
-- ----------------------------
DROP TABLE IF EXISTS `sysworkshift`;
CREATE TABLE `sysworkshift` (
  `shiftid` int(50) NOT NULL AUTO_INCREMENT,
  `shiftname` varchar(50) NOT NULL,
  `shiftstarttime` varchar(50) NOT NULL,
  `shiftendtime` varchar(50) NOT NULL,
  `shopid` int(50) NOT NULL,
  `linerid` int(50) NOT NULL,
  `placeid` int(50) NOT NULL,
  PRIMARY KEY (`shiftid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysworkshift
-- ----------------------------
INSERT INTO `sysworkshift` VALUES ('2', 'dou', '13:57:42', '16:57:44', '1', '1', '1');
INSERT INTO `sysworkshift` VALUES ('4', 'sdf', '13:58:26', '16:58:30', '1', '1', '4');
INSERT INTO `sysworkshift` VALUES ('5', 're', '18:24:00', '18:25:00', '1', '1', '1');
INSERT INTO `sysworkshift` VALUES ('7', '21', '18:24:00', '18:26:00', '21', '12', '21');
INSERT INTO `sysworkshift` VALUES ('8', '21', '18:24:00', '18:25:00', '21', '21', '1');
INSERT INTO `sysworkshift` VALUES ('10', '1', '20:02:00', '20:04:00', '1', '1', '1');
INSERT INTO `sysworkshift` VALUES ('11', '1', '14:23:00', '14:24:00', '1', '1', '1');
INSERT INTO `sysworkshift` VALUES ('12', '2', '14:24:00', '14:25:00', '2', '2', '2');
INSERT INTO `sysworkshift` VALUES ('13', '2', '14:24:00', '14:40:27', '3', '3', '3');
INSERT INTO `sysworkshift` VALUES ('14', '1', '14:25:00', '14:26:23', '1', '1', '1');
INSERT INTO `sysworkshift` VALUES ('15', '2', '14:25:00', '14:27:00', '2', '1', '2');

-- ----------------------------
-- Table structure for `sysworkshop`
-- ----------------------------
DROP TABLE IF EXISTS `sysworkshop`;
CREATE TABLE `sysworkshop` (
  `shopId` int(11) NOT NULL AUTO_INCREMENT,
  `shopName` varchar(50) DEFAULT NULL,
  `shopAdmin` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`shopId`)
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of sysworkshop
-- ----------------------------
INSERT INTO `sysworkshop` VALUES ('1', 'swd0000', 'asd1118');
INSERT INTO `sysworkshop` VALUES ('2', 'sdf', 'ed ');
INSERT INTO `sysworkshop` VALUES ('9', 'cfcb', 'bhfg');
INSERT INTO `sysworkshop` VALUES ('10', 'fuye', 'wdhd');
INSERT INTO `sysworkshop` VALUES ('11', 'fdsf', 'fsfeg');
INSERT INTO `sysworkshop` VALUES ('12', 'fhbdf', 'hf');
INSERT INTO `sysworkshop` VALUES ('14', 'ujkyjyu', 'yut');
INSERT INTO `sysworkshop` VALUES ('15', 'yuthu', 'iiyjhg');
INSERT INTO `sysworkshop` VALUES ('16', 'hgn', 'uyt');
INSERT INTO `sysworkshop` VALUES ('17', 'df', 'fcx');
INSERT INTO `sysworkshop` VALUES ('100', 'sgf', 'cgds');
INSERT INTO `sysworkshop` VALUES ('101', 'geed', 'ad');
INSERT INTO `sysworkshop` VALUES ('108', 'tftv', 'hb');
INSERT INTO `sysworkshop` VALUES ('110', 'fdts', 'sds');
INSERT INTO `sysworkshop` VALUES ('112', 'fgd', 'ge');
INSERT INTO `sysworkshop` VALUES ('113', 'er', 'efd');

-- ----------------------------
-- Table structure for `萨达`
-- ----------------------------
DROP TABLE IF EXISTS `萨达`;
CREATE TABLE `萨达` (
  `id` int(11) NOT NULL,
  `dsa` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 萨达
-- ----------------------------
