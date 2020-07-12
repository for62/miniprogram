/*
Navicat MySQL Data Transfer

Source Server         : jenbal
Source Server Version : 50549
Source Host           : 127.0.0.1:3306
Source Database       : db_qqmusic

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2020-07-12 13:52:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `c3p0testtable`
-- ----------------------------
DROP TABLE IF EXISTS `c3p0testtable`;
CREATE TABLE `c3p0testtable` (
  `a` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of c3p0testtable
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_list`
-- ----------------------------
DROP TABLE IF EXISTS `tb_list`;
CREATE TABLE `tb_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `geming` varchar(80) DEFAULT NULL,
  `geshou` varchar(80) DEFAULT NULL,
  `time` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_list
-- ----------------------------
INSERT INTO `tb_list` VALUES ('1', '这是年 啊', '叶炫清', '05:33');

-- ----------------------------
-- Table structure for `tb_pl`
-- ----------------------------
DROP TABLE IF EXISTS `tb_pl`;
CREATE TABLE `tb_pl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `geming` varchar(25) DEFAULT NULL,
  `plren` varchar(25) DEFAULT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `pinglun` varchar(4000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_pl
-- ----------------------------
INSERT INTO `tb_pl` VALUES ('2', '都不会变', '你猜啊', '2020-07-12 12:35:09', '大幅度会很反感');
INSERT INTO `tb_pl` VALUES ('3', '都不会变 ', '你猜啊', '2020-07-12 12:36:35', '而是人的');
INSERT INTO `tb_pl` VALUES ('4', '都不会变 ', '你猜啊', '2020-07-12 12:37:06', '和东方红佛挡杀佛');
INSERT INTO `tb_pl` VALUES ('5', '都不会变 ', '你猜啊', '2020-07-12 12:37:19', '');
INSERT INTO `tb_pl` VALUES ('6', '都不会变 ', '你猜啊', '2020-07-12 12:37:31', '防火防盗结合题');
INSERT INTO `tb_pl` VALUES ('7', '七月七日晴 ', '你猜啊', '2020-07-12 12:42:20', 'dhshgdfjh');
INSERT INTO `tb_pl` VALUES ('8', '七月七日晴 ', '你猜啊', '2020-07-12 13:00:24', '发给你借古讽今法根据');
INSERT INTO `tb_pl` VALUES ('9', '爱情速递', '你猜啊', '2020-07-12 13:03:03', '关掉然后过分的话');

-- ----------------------------
-- Table structure for `tb_xd`
-- ----------------------------
DROP TABLE IF EXISTS `tb_xd`;
CREATE TABLE `tb_xd` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `geming` varchar(255) DEFAULT NULL,
  `geshou` varchar(255) DEFAULT NULL,
  `time` date DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_xd
-- ----------------------------
INSERT INTO `tb_xd` VALUES ('1', '都不会变 ', '叶炫清 ', '2020-07-08', 'image/xindie_p1.jpg', '内地');
INSERT INTO `tb_xd` VALUES ('2', '七月七日晴 ', '孙子涵 ', '2020-07-08', 'image/xindie_p2.jpg', '内地');
INSERT INTO `tb_xd` VALUES ('3', '爱情速递', '宣璐 / 曹煜晨', '2020-07-08', 'image/xindie_p3.jpg', '内地');
INSERT INTO `tb_xd` VALUES ('4', '胭脂录', '洛天依', '2020-07-08', 'image/xindie_p4.jpg', '内地');
INSERT INTO `tb_xd` VALUES ('5', '春水谣', '宋玥', '2020-07-08', 'image/xindie_p5.jpg', '内地');
INSERT INTO `tb_xd` VALUES ('6', '忆童谣', '王乐汀', '2020-07-08', 'image/xindie_p7.jpg', '内地');
INSERT INTO `tb_xd` VALUES ('7', '平凡的骄傲', '新生主义', '2020-07-08', 'image/xindie_p6.jpg', '内地');
INSERT INTO `tb_xd` VALUES ('8', '躲不过你怀抱', '蕙小菓', '2020-07-08', 'image/xindie_p8.jpg', '内地');
INSERT INTO `tb_xd` VALUES ('9', '别怀疑', '青琰', '2020-07-08', 'image/xindie_p9.jpg', '内地');
INSERT INTO `tb_xd` VALUES ('10', '请别记得我的好', '圣姬 / 壹声壹社', '2020-07-08', 'image/xindie_p10.jpg', '内地');
INSERT INTO `tb_xd` VALUES ('11', 'Be Alive', '毕书尽', '2020-07-08', 'image/xindie_gangtai1.jpg', '港台');
INSERT INTO `tb_xd` VALUES ('12', 'Negative', '许廷铿', '2020-07-08', 'image/xindie_gangtai2.jpg', '港台');
INSERT INTO `tb_xd` VALUES ('13', '回家的路', '白安', '2020-07-08', 'image/xindie_gangtai3.jpg', '港台');
INSERT INTO `tb_xd` VALUES ('14', '五月天 突然好想见到你', '五月天', '2020-07-08', 'image/xindie_gangtai4.jpg', '港台');
INSERT INTO `tb_xd` VALUES ('15', '我不想长大', '夏霏', '2020-07-08', 'image/xindie_gangtai5.jpg', '港台');
INSERT INTO `tb_xd` VALUES ('16', 'See You Next Time', 'AGA', '2020-07-08', 'image/xindie_gangtai6.jpg', '港台');
INSERT INTO `tb_xd` VALUES ('17', 'Hiding In My Island', '黄右年 / 卫柔伊', '2020-07-08', 'image/xindie_gangtai7.jpg', '港台');
INSERT INTO `tb_xd` VALUES ('18', 'Lost Forever', 'Robynn Yip', '2020-07-08', 'image/xindie_gangtai8.jpg', '港台');
INSERT INTO `tb_xd` VALUES ('19', '梦飞翔', '谢东闵 / 戴祖仪', '2020-07-08', 'image/xindie_gangtai9.jpg', '港台');
INSERT INTO `tb_xd` VALUES ('20', 'Mojito', '周杰伦', '2020-07-08', 'image/xindie_gangtai10.jpg', '港台');
