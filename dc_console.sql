/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : dc_console

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-06-18 18:02:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_admin
-- ----------------------------
DROP TABLE IF EXISTS `sys_admin`;
CREATE TABLE `sys_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vc_username` varchar(60) NOT NULL COMMENT '用户名',
  `vc_password` varchar(60) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_admin
-- ----------------------------
INSERT INTO `sys_admin` VALUES ('1', 'admin', '123456');
INSERT INTO `sys_admin` VALUES ('2', 'he0001', '123');
INSERT INTO `sys_admin` VALUES ('3', 'he0002', null);
INSERT INTO `sys_admin` VALUES ('4', 'he0003', null);
INSERT INTO `sys_admin` VALUES ('5', 'he0004', null);
INSERT INTO `sys_admin` VALUES ('6', 'he005', null);
INSERT INTO `sys_admin` VALUES ('7', 'he006', null);
INSERT INTO `sys_admin` VALUES ('8', 'he007', null);
INSERT INTO `sys_admin` VALUES ('9', 'he008', null);
INSERT INTO `sys_admin` VALUES ('10', 'he009', null);
INSERT INTO `sys_admin` VALUES ('11', 'he010', null);
INSERT INTO `sys_admin` VALUES ('12', 'he011', null);
INSERT INTO `sys_admin` VALUES ('13', 'he012', null);

-- ----------------------------
-- Table structure for sys_admin_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_admin_role`;
CREATE TABLE `sys_admin_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_admin_id` int(11) DEFAULT NULL COMMENT '用户id',
  `fk_role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_admin_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_button
-- ----------------------------
DROP TABLE IF EXISTS `sys_button`;
CREATE TABLE `sys_button` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vc_btname` varchar(255) NOT NULL COMMENT '按钮名称',
  `vc_btcode` varchar(255) DEFAULT NULL COMMENT '按钮的id',
  `fk_menu_id` varchar(255) DEFAULT NULL COMMENT '所属菜单id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_button
-- ----------------------------

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vc_menuname` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `nb_pid` int(11) DEFAULT NULL COMMENT '上级id',
  `vc_url` varchar(255) DEFAULT NULL COMMENT '链接地址',
  `vc_icon` varchar(255) DEFAULT NULL COMMENT '图标',
  `nb_order` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vc_rolename` varchar(255) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_button
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_button`;
CREATE TABLE `sys_role_button` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_role_id` int(11) DEFAULT NULL,
  `fk_button_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_button
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_role_id` int(11) DEFAULT NULL,
  `fk_menu_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
