/*
Navicat MySQL Data Transfer

Source Server         : wgl
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : student

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-10-14 22:34:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `score`
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `score_id` varchar(10) NOT NULL COMMENT '成绩id',
  `subject_id` varchar(20) NOT NULL COMMENT '课程id',
  `student_id` varchar(20) NOT NULL COMMENT '学生id',
  `score` varchar(5) NOT NULL COMMENT '成绩',
  `credit` varchar(1) NOT NULL COMMENT '学分',
  PRIMARY KEY (`score_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` varchar(20) NOT NULL COMMENT '学生id',
  `student_name` varchar(20) DEFAULT NULL COMMENT '学生姓名',
  `sex` varchar(5) DEFAULT NULL COMMENT '性别',
  `sfz_id` char(19) DEFAULT NULL COMMENT '身份证号码',
  `tel` varchar(11) DEFAULT NULL COMMENT '电话号码',
  `marjor_name` varchar(20) DEFAULT NULL COMMENT '专业',
  `student_class` varchar(10) DEFAULT NULL COMMENT '班级',
  `enter_date` date DEFAULT NULL COMMENT '入学时间',
  `leave_date` date DEFAULT NULL COMMENT '离校时间',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `address` varchar(50) DEFAULT NULL COMMENT '家庭住址',
  `graschool` varchar(20) DEFAULT NULL COMMENT '毕业院校',
  `nation` varchar(2) DEFAULT NULL COMMENT '民族',
  `native_place` varchar(20) DEFAULT NULL COMMENT '籍贯',
  `politicstatus` varchar(10) DEFAULT NULL COMMENT '政治面貌',
  `student_password` varchar(20) DEFAULT NULL COMMENT '登录密码',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for `subjects`
-- ----------------------------
DROP TABLE IF EXISTS `subjects`;
CREATE TABLE `subjects` (
  `subjects_id` varchar(20) NOT NULL COMMENT '课程id',
  `subject_name` varchar(20) DEFAULT NULL COMMENT '课程名字',
  `student_id` varchar(20) DEFAULT NULL COMMENT '学生id',
  `teacher_id` varchar(20) DEFAULT NULL COMMENT '教师id',
  `credit` varchar(1) DEFAULT NULL COMMENT '学分',
  PRIMARY KEY (`subjects_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subjects
-- ----------------------------

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` varchar(20) NOT NULL COMMENT '教师id',
  `teacher_name` varchar(20) DEFAULT NULL COMMENT '教师姓名',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `tel` varchar(11) DEFAULT NULL COMMENT '联系方式',
  `title` varchar(20) DEFAULT NULL COMMENT '职称',
  `politicstatus` varchar(2) DEFAULT NULL COMMENT '政治面貌',
  `graschool` varchar(20) DEFAULT NULL COMMENT '毕业院校',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
