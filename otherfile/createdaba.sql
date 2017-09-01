/*
Navicat MySQL Data Transfer

Source Server         : mdatabase
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : labsys_db

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-09-02 01:38:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminid` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '1', '1');
INSERT INTO `admin` VALUES ('2', '2', '2');

-- ----------------------------
-- Table structure for edubkgrd
-- ----------------------------
DROP TABLE IF EXISTS `edubkgrd`;
CREATE TABLE `edubkgrd` (
  `edubkgrd_id` int(11) NOT NULL,
  `edubkgrdname_c` varchar(255) NOT NULL,
  `edubkgrdname_e` varchar(255) NOT NULL,
  PRIMARY KEY (`edubkgrd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of edubkgrd
-- ----------------------------
INSERT INTO `edubkgrd` VALUES ('1', '博士', 'Doctor´s Degree');
INSERT INTO `edubkgrd` VALUES ('2', '研究生', 'Master´s Degree');
INSERT INTO `edubkgrd` VALUES ('3', '本科', 'Normal Courses');
INSERT INTO `edubkgrd` VALUES ('4', '专科', 'Short-cycle Courses');
INSERT INTO `edubkgrd` VALUES ('5', '其他', 'Others');

-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info` (
  `LABORATORYNAME_C` varchar(255) NOT NULL,
  `LABORATORYNAME_E` varchar(255) DEFAULT NULL,
  `LABORATORYTITLE_C` varchar(255) DEFAULT NULL,
  `LABORATORYTITLE_E` varchar(255) DEFAULT NULL,
  `LABORATORYINTRO_C` varchar(255) DEFAULT NULL,
  `LABORATORYINTRO_E` varchar(255) DEFAULT NULL,
  `LABORATORYPHONE` varchar(255) DEFAULT NULL,
  `LABORATORYEMAIL` varchar(255) DEFAULT NULL,
  `LABORATORADD_C` varchar(255) DEFAULT NULL,
  `LABORATORYADD_E` varchar(255) DEFAULT NULL,
  `LABORATORYQQ` varchar(255) DEFAULT NULL,
  `LABORATORYWEIBO` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info
-- ----------------------------

-- ----------------------------
-- Table structure for mentortype
-- ----------------------------
DROP TABLE IF EXISTS `mentortype`;
CREATE TABLE `mentortype` (
  `mentortype_id` int(11) NOT NULL,
  `mentortypename_c` varchar(255) NOT NULL,
  `mentortypename_e` varchar(255) NOT NULL,
  PRIMARY KEY (`mentortype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mentortype
-- ----------------------------
INSERT INTO `mentortype` VALUES ('1', '博士生导师', 'doctoral supervisor');
INSERT INTO `mentortype` VALUES ('2', '硕士生导师', 'master superisor');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `news_id` int(11) DEFAULT NULL,
  `newstitle_c` varchar(255) DEFAULT NULL,
  `newstitle_e` varchar(255) DEFAULT NULL,
  `newscontent_c` varchar(255) DEFAULT NULL,
  `newscontent_e` varchar(255) DEFAULT NULL,
  `newstime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------

-- ----------------------------
-- Table structure for paper
-- ----------------------------
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper` (
  `paper_id` int(11) NOT NULL AUTO_INCREMENT,
  `papername_c` varchar(255) DEFAULT NULL,
  `papername_e` varchar(255) DEFAULT NULL,
  `paperbriefintro_c` varchar(255) DEFAULT NULL,
  `paperbriefintro_e` varchar(255) DEFAULT NULL,
  `paperLink` varchar(255) DEFAULT NULL,
  `papertype` int(11) DEFAULT NULL COMMENT '1：论文\r\n2：发明专利\r\n3：实用新型专利\r\n4：外观专利\r\n5：其他',
  `papersource_id` int(11) DEFAULT NULL,
  `papertime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`paper_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paper
-- ----------------------------
INSERT INTO `paper` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '2017-09-02 01:00:21');
INSERT INTO `paper` VALUES ('2', '论文1', 'paper1', '简介', 'biref introduction', 'http://www.baidu.com', '1', '1', '2017-09-02 01:27:31');

-- ----------------------------
-- Table structure for paperbelong
-- ----------------------------
DROP TABLE IF EXISTS `paperbelong`;
CREATE TABLE `paperbelong` (
  `paperbelong_id` int(11) NOT NULL,
  `paper_id` int(11) NOT NULL,
  `paperbelongisstu` tinyint(1) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `stu_id` int(11) DEFAULT NULL,
  `authortype_c` varchar(255) DEFAULT NULL,
  `authortype_e` varchar(255) DEFAULT NULL,
  `paperbelongintro_c` varchar(255) DEFAULT NULL,
  `paperbelonginfo_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`paperbelong_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paperbelong
-- ----------------------------

-- ----------------------------
-- Table structure for probelong
-- ----------------------------
DROP TABLE IF EXISTS `probelong`;
CREATE TABLE `probelong` (
  `probelong_id` int(11) NOT NULL,
  `pro_id` int(11) NOT NULL,
  `probelongisstu` tinyint(1) NOT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `stu_id` int(11) DEFAULT NULL,
  `probelongduty_c` varchar(255) DEFAULT NULL,
  `probelongduty_e` varchar(255) DEFAULT NULL,
  `probelongintro_c` varchar(255) DEFAULT NULL,
  `probelongintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`probelong_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of probelong
-- ----------------------------

-- ----------------------------
-- Table structure for professionaltitle
-- ----------------------------
DROP TABLE IF EXISTS `professionaltitle`;
CREATE TABLE `professionaltitle` (
  `profsntitle_id` int(11) NOT NULL,
  `profsntitlename_c` varchar(255) NOT NULL,
  `profsntitlename_e` varchar(255) NOT NULL,
  PRIMARY KEY (`profsntitle_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of professionaltitle
-- ----------------------------
INSERT INTO `professionaltitle` VALUES ('1', '教授', 'professor');
INSERT INTO `professionaltitle` VALUES ('2', '副教授', 'associate professor');
INSERT INTO `professionaltitle` VALUES ('3', '讲师', 'lecturer');
INSERT INTO `professionaltitle` VALUES ('4', '助教', 'assistant');

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `pro_id` int(11) NOT NULL,
  `proname_c` varchar(255) DEFAULT NULL,
  `proname_e` varchar(255) DEFAULT NULL,
  `prostate_c` varchar(255) DEFAULT NULL,
  `prostate_e` varchar(255) DEFAULT NULL,
  `prointro_c` varchar(255) DEFAULT NULL,
  `prointro_e` varchar(255) DEFAULT NULL,
  `prosource_c` varchar(255) DEFAULT NULL,
  `prosource_e` varchar(255) DEFAULT NULL,
  `prostarttime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `proendtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `profund` int(11) DEFAULT NULL,
  PRIMARY KEY (`pro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------

-- ----------------------------
-- Table structure for resbelong
-- ----------------------------
DROP TABLE IF EXISTS `resbelong`;
CREATE TABLE `resbelong` (
  `resbelong_id` int(11) NOT NULL,
  `research_id` int(11) NOT NULL,
  `resbelongisstu` tinyint(1) NOT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `stu_id` int(11) DEFAULT NULL,
  `resbelongbriefintro_c` varchar(255) DEFAULT NULL,
  `resbelongbriefintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resbelong_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resbelong
-- ----------------------------

-- ----------------------------
-- Table structure for research
-- ----------------------------
DROP TABLE IF EXISTS `research`;
CREATE TABLE `research` (
  `research_id` int(11) NOT NULL,
  `researchname_c` varchar(255) NOT NULL,
  `researchname_e` varchar(255) DEFAULT NULL,
  `researchintro_c` varchar(255) DEFAULT NULL,
  `researchintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`research_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of research
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL,
  `student_num` varchar(255) DEFAULT NULL,
  `studentname_c` varchar(255) DEFAULT NULL,
  `studentname_e` varchar(255) DEFAULT NULL,
  `stubir` varchar(255) DEFAULT NULL,
  `stupic` varchar(255) DEFAULT NULL,
  `stuphone` varchar(255) DEFAULT NULL,
  `stuemail` varchar(255) DEFAULT NULL,
  `stubriefintro_c` varchar(255) DEFAULT NULL,
  `stubriefintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL,
  `teachername_c` varchar(255) NOT NULL,
  `teachername_e` varchar(255) DEFAULT NULL,
  `teachergender` tinyint(1) DEFAULT NULL,
  `teacherbirth` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `edubkgrd_id` int(11) DEFAULT NULL,
  `profsntitle_id` int(11) DEFAULT NULL,
  `mentortype_id` int(11) DEFAULT NULL,
  `teacherpic` varchar(255) DEFAULT NULL,
  `teacherphone` varchar(16) DEFAULT NULL,
  `teacheremail` varchar(255) DEFAULT NULL,
  `teacherbriefintro_c` varchar(255) DEFAULT NULL,
  `teacherbriefintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
