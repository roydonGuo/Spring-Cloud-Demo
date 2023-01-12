/*
 Navicat Premium Data Transfer

 Source Server         : yicheng
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : cloud-user

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 12/01/2023 19:16:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收件人',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 109 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'roydon', '河南省商丘市');
INSERT INTO `tb_user` VALUES (3, '张三', '陕西省西安市');
INSERT INTO `tb_user` VALUES (4, '李四', '湖北省十堰市');
INSERT INTO `tb_user` VALUES (5, '王五', '天津市');
INSERT INTO `tb_user` VALUES (6, '赵六', '辽宁省沈阳市大东区');
INSERT INTO `tb_user` VALUES (7, '孙七', '山东省青岛市');

SET FOREIGN_KEY_CHECKS = 1;
