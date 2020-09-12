/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : film

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 12/09/2020 19:55:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for f_actor
-- ----------------------------
DROP TABLE IF EXISTS `f_actor`;
CREATE TABLE `f_actor`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '演员编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '演员名称',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `nation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国家',
  `birthday` date NULL DEFAULT NULL COMMENT '生日',
  `remark` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '从影经历',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '演员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_admin
-- ----------------------------
DROP TABLE IF EXISTS `f_admin`;
CREATE TABLE `f_admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员编号',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '管理员信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of f_admin
-- ----------------------------
INSERT INTO `f_admin` VALUES (1, 'admin', 'admin', '王五');

-- ----------------------------
-- Table structure for f_awards
-- ----------------------------
DROP TABLE IF EXISTS `f_awards`;
CREATE TABLE `f_awards`  (
  `id` int(11) NOT NULL COMMENT '奖项编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '奖项名称',
  `periods` int(11) NULL DEFAULT NULL COMMENT '期数',
  `year` int(11) NULL DEFAULT NULL COMMENT '获奖年份',
  `site` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '举办地点',
  `actor_id` int(11) NULL DEFAULT NULL COMMENT '演员编号',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `actor_id`(`actor_id`) USING BTREE,
  CONSTRAINT `f_awards_ibfk_1` FOREIGN KEY (`actor_id`) REFERENCES `f_actor` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '奖项信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_car_user
-- ----------------------------
DROP TABLE IF EXISTS `f_car_user`;
CREATE TABLE `f_car_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `car_id` int(11) NULL DEFAULT NULL COMMENT '则扣卡id',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '有效期截至时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  INDEX `car_id`(`car_id`) USING BTREE,
  CONSTRAINT `f_car_user_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `f_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `f_car_user_ibfk_2` FOREIGN KEY (`car_id`) REFERENCES `f_discount_card` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '折扣卡和用户关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_card_cineplex
-- ----------------------------
DROP TABLE IF EXISTS `f_card_cineplex`;
CREATE TABLE `f_card_cineplex`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cineplex_id` int(11) NULL DEFAULT NULL COMMENT '影城id',
  `card_id` int(11) NULL DEFAULT NULL COMMENT '会员卡id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `cineplex_id`(`cineplex_id`) USING BTREE,
  INDEX `card_id`(`card_id`) USING BTREE,
  CONSTRAINT `f_card_cineplex_ibfk_1` FOREIGN KEY (`cineplex_id`) REFERENCES `f_cineplex` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `f_card_cineplex_ibfk_2` FOREIGN KEY (`card_id`) REFERENCES `f_discount_card` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '影城则扣卡关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_cineplex
-- ----------------------------
DROP TABLE IF EXISTS `f_cineplex`;
CREATE TABLE `f_cineplex`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '影城编号',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '影城内容',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '影城地址',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `characteristic_service` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '特色服务',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '影城名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '影城信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of f_cineplex
-- ----------------------------
INSERT INTO `f_cineplex` VALUES (4, '万达', '万达广场', '123456', '万达', '万达');

-- ----------------------------
-- Table structure for f_discount_card
-- ----------------------------
DROP TABLE IF EXISTS `f_discount_card`;
CREATE TABLE `f_discount_card`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '则扣卡编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '折扣卡名称',
  `discount` decimal(11, 2) NULL DEFAULT NULL COMMENT '则扣',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '折扣卡表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_film
-- ----------------------------
DROP TABLE IF EXISTS `f_film`;
CREATE TABLE `f_film`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '电影编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电影名称',
  `category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电影类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '电影表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_film_schedule
-- ----------------------------
DROP TABLE IF EXISTS `f_film_schedule`;
CREATE TABLE `f_film_schedule`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '排片编号',
  `cineplex_id` int(11) NULL DEFAULT NULL COMMENT '影城编号',
  `movie_hall_id` int(11) NULL DEFAULT NULL COMMENT '影厅编号',
  `film_id` int(11) NULL DEFAULT NULL COMMENT '电影编号',
  `ticket_rates` decimal(11, 2) NULL DEFAULT NULL COMMENT '票价',
  `start_time` datetime(0) NULL DEFAULT NULL COMMENT '开映时间',
  `end_time` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `discount_card_id` int(11) NULL DEFAULT NULL COMMENT '折扣卡编号',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `cineplex_id`(`cineplex_id`) USING BTREE,
  INDEX `movie_hall_id`(`movie_hall_id`) USING BTREE,
  INDEX `film_id`(`film_id`) USING BTREE,
  CONSTRAINT `f_film_schedule_ibfk_1` FOREIGN KEY (`cineplex_id`) REFERENCES `f_cineplex` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `f_film_schedule_ibfk_2` FOREIGN KEY (`movie_hall_id`) REFERENCES `f_movie_hall` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `f_film_schedule_ibfk_3` FOREIGN KEY (`film_id`) REFERENCES `f_film` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '电影排片表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_movie_hall
-- ----------------------------
DROP TABLE IF EXISTS `f_movie_hall`;
CREATE TABLE `f_movie_hall`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '影厅编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '影厅名称',
  `cineplex_id` int(11) NULL DEFAULT NULL COMMENT '影城编号',
  `table_num` int(11) NULL DEFAULT NULL COMMENT '座位数',
  `i_max` tinyint(1) NULL DEFAULT 0 COMMENT '是否坐满',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `cineplex_id`(`cineplex_id`) USING BTREE,
  CONSTRAINT `f_movie_hall_ibfk_1` FOREIGN KEY (`cineplex_id`) REFERENCES `f_cineplex` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '影厅信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_order
-- ----------------------------
DROP TABLE IF EXISTS `f_order`;
CREATE TABLE `f_order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户编号',
  `cineples_id` int(11) NULL DEFAULT NULL COMMENT '影城编号',
  `movie_hall_id` int(11) NULL DEFAULT NULL COMMENT '影厅编号',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '付款金额',
  `score` decimal(11, 2) NULL DEFAULT NULL COMMENT '评分',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价内容',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  INDEX `cineples_id`(`cineples_id`) USING BTREE,
  INDEX `movie_hall_id`(`movie_hall_id`) USING BTREE,
  CONSTRAINT `f_order_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `f_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `f_order_ibfk_2` FOREIGN KEY (`cineples_id`) REFERENCES `f_cineplex` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `f_order_ibfk_3` FOREIGN KEY (`movie_hall_id`) REFERENCES `f_movie_hall` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_palms
-- ----------------------------
DROP TABLE IF EXISTS `f_palms`;
CREATE TABLE `f_palms`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录编号',
  `actor_id` int(11) NULL DEFAULT NULL COMMENT '演员编号',
  `category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获奖类别',
  `level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获奖级别',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `actor_id`(`actor_id`) USING BTREE,
  CONSTRAINT `f_palms_ibfk_1` FOREIGN KEY (`actor_id`) REFERENCES `f_actor` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '获奖记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_pay
-- ----------------------------
DROP TABLE IF EXISTS `f_pay`;
CREATE TABLE `f_pay`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录编号',
  `film_id` int(11) NULL DEFAULT NULL COMMENT '电影编号',
  `actor_id` int(11) NULL DEFAULT NULL COMMENT '演员编号',
  `portray` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '饰演人物',
  `rolee` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `film_id`(`film_id`) USING BTREE,
  INDEX `actor_id`(`actor_id`) USING BTREE,
  CONSTRAINT `f_pay_ibfk_1` FOREIGN KEY (`film_id`) REFERENCES `f_film` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `f_pay_ibfk_2` FOREIGN KEY (`actor_id`) REFERENCES `f_actor` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '演员出演记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for f_user
-- ----------------------------
DROP TABLE IF EXISTS `f_user`;
CREATE TABLE `f_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of f_user
-- ----------------------------
INSERT INTO `f_user` VALUES (1, '123456', '赵六', '男', '123456', '17636399759', '48648478@qq.com', '海淀区');

SET FOREIGN_KEY_CHECKS = 1;
