/*
 Navicat Premium Data Transfer

 Source Server         : yicheng
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : cloud-order

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 12/01/2023 19:16:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `user_id` bigint(0) NOT NULL COMMENT '用户id',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `price` bigint(0) NOT NULL COMMENT '商品价格',
  `num` int(0) NULL DEFAULT 0 COMMENT '商品数量',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 109 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES (101, 1, 'HUAWEI Mate50 Pro', 689900, 1);
INSERT INTO `tb_order` VALUES (102, 3, 'VIVO X90Pro', 609900, 1);
INSERT INTO `tb_order` VALUES (103, 4, 'IQOO 11', 539000, 1);
INSERT INTO `tb_order` VALUES (104, 5, '小米12', 359900, 1);
INSERT INTO `tb_order` VALUES (105, 6, 'honor 50', 499900, 1);
INSERT INTO `tb_order` VALUES (106, 7, 'one plus 10', 544900, 1);

SET FOREIGN_KEY_CHECKS = 1;
