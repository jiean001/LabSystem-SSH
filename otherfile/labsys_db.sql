/*
Navicat MySQL Data Transfer

Source Server         : mdatabase
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : labsys_db

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-09-04 17:25:01
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
-- Table structure for laboratoryinfo
-- ----------------------------
DROP TABLE IF EXISTS `laboratoryinfo`;
CREATE TABLE `laboratoryinfo` (
  `Laboratory_id` int(11) NOT NULL,
  `laboratoryname_c` varchar(255) NOT NULL,
  `laboratoryname_e` varchar(255) DEFAULT NULL,
  `laboratorytitle_c` varchar(255) DEFAULT NULL,
  `laboratorytitle_e` varchar(255) DEFAULT NULL,
  `laboratoryintro_c` varchar(255) DEFAULT NULL,
  `laboratoryintro_e` varchar(255) DEFAULT NULL,
  `laboratoryphone` varchar(255) DEFAULT NULL,
  `laboratoryemail` varchar(255) DEFAULT NULL,
  `laboratoryadd_c` varchar(255) DEFAULT NULL,
  `laboratoryadd_e` varchar(255) DEFAULT NULL,
  `laboratoryqq` varchar(255) DEFAULT NULL,
  `laboratoryweibo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Laboratory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for newsnew
-- ----------------------------
DROP TABLE IF EXISTS `newsnew`;
CREATE TABLE `newsnew` (
  `news_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `newstitle_c` varchar(255) DEFAULT NULL,
  `newstitle_e` varchar(255) DEFAULT NULL,
  `newscontent_c` varchar(255) DEFAULT NULL,
  `newscontent_e` varchar(255) DEFAULT NULL,
  `newstime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

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
-- Table structure for paperbelong
-- ----------------------------
DROP TABLE IF EXISTS `paperbelong`;
CREATE TABLE `paperbelong` (
  `paperbelong_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `paper_id` int(11) NOT NULL,
  `paperbelongisstu` tinyint(1) DEFAULT NULL,
  `person_id` int(11) DEFAULT NULL,
  `authortype_c` varchar(255) DEFAULT NULL,
  `authortype_e` varchar(255) DEFAULT NULL,
  `paperbelongintro_c` varchar(255) DEFAULT NULL,
  `paperbelonginfo_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`paperbelong_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for probelong
-- ----------------------------
DROP TABLE IF EXISTS `probelong`;
CREATE TABLE `probelong` (
  `probelong_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `pro_id` int(11) NOT NULL,
  `probelongisstu` tinyint(1) NOT NULL,
  `person_id` int(11) DEFAULT NULL,
  `probelongduty_c` varchar(255) DEFAULT NULL,
  `probelongduty_e` varchar(255) DEFAULT NULL,
  `probelongintro_c` varchar(255) DEFAULT NULL,
  `probelongintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`probelong_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `pro_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `proname_c` varchar(255) DEFAULT NULL,
  `proname_e` varchar(255) DEFAULT NULL,
  `prostate` int(11) DEFAULT NULL,
  `prointro_c` varchar(255) DEFAULT NULL,
  `prointro_e` varchar(255) DEFAULT NULL,
  `prosource_c` varchar(255) DEFAULT NULL,
  `prosource_e` varchar(255) DEFAULT NULL,
  `prostarttime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `proendtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `profund` int(11) DEFAULT NULL,
  PRIMARY KEY (`pro_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for resbelong
-- ----------------------------
DROP TABLE IF EXISTS `resbelong`;
CREATE TABLE `resbelong` (
  `resbelong_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `research_id` int(11) NOT NULL,
  `resbelongisstu` tinyint(1) NOT NULL,
  `person_id` int(11) DEFAULT NULL,
  `resbelongbriefintro_c` varchar(255) DEFAULT NULL,
  `resbelongbriefintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resbelong_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for research
-- ----------------------------
DROP TABLE IF EXISTS `research`;
CREATE TABLE `research` (
  `research_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `researchname_c` varchar(255) NOT NULL,
  `researchname_e` varchar(255) DEFAULT NULL,
  `researchintro_c` varchar(255) DEFAULT NULL,
  `researchintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`research_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for respaper
-- ----------------------------
DROP TABLE IF EXISTS `respaper`;
CREATE TABLE `respaper` (
  `respaper_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `research_id` int(11) DEFAULT NULL,
  `paper_id` int(11) DEFAULT NULL,
  `respaperintro_c` varchar(255) DEFAULT NULL,
  `respaperintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`respaper_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for respro
-- ----------------------------
DROP TABLE IF EXISTS `respro`;
CREATE TABLE `respro` (
  `respro_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `research_id` int(11) DEFAULT NULL,
  `pro_id` int(11) DEFAULT NULL,
  `resprointro_c` varchar(255) DEFAULT NULL,
  `resprointro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`respro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for source
-- ----------------------------
DROP TABLE IF EXISTS `source`;
CREATE TABLE `source` (
  `source_id` int(11) DEFAULT NULL,
  `sourcename_c` varchar(255) DEFAULT NULL,
  `sourcename_e` varchar(255) DEFAULT NULL,
  `sourceintro_c` varchar(255) DEFAULT NULL,
  `sourceintro_e` varchar(255) DEFAULT NULL,
  `sourcelevel` int(11) DEFAULT NULL,
  `sourcescore` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `student_num` varchar(255) DEFAULT NULL,
  `studentname_c` varchar(255) DEFAULT NULL,
  `studentname_e` varchar(255) DEFAULT NULL,
  `stubir` datetime DEFAULT NULL,
  `stupic` varchar(255) DEFAULT NULL,
  `stuphone` varchar(255) DEFAULT NULL,
  `stuemail` varchar(255) DEFAULT NULL,
  `stubriefintro_c` varchar(255) DEFAULT NULL,
  `stubriefintro_e` varchar(255) DEFAULT NULL,
  `edubkgrd_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for stuyear
-- ----------------------------
DROP TABLE IF EXISTS `stuyear`;
CREATE TABLE `stuyear` (
  `stuyear_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `year` varchar(255) DEFAULT NULL,
  `stu_id` int(11) DEFAULT NULL,
  `stuyearintro_c` varchar(255) DEFAULT NULL,
  `stuyearintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stuyear_id`)
) ENGINE=InnoDB AUTO_INCREMENT=111112 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for supervisortype
-- ----------------------------
DROP TABLE IF EXISTS `supervisortype`;
CREATE TABLE `supervisortype` (
  `supervisortype_id` int(11) NOT NULL,
  `supervisortypename_c` varchar(255) NOT NULL,
  `supervisortypename_e` varchar(255) NOT NULL,
  PRIMARY KEY (`supervisortype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `teachername_c` varchar(255) NOT NULL,
  `teachername_e` varchar(255) DEFAULT NULL,
  `teachergender` tinyint(1) DEFAULT NULL,
  `teacherbirth` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `edubkgrd_id` int(11) DEFAULT NULL,
  `profsntitle_id` int(11) DEFAULT NULL,
  `supervisortype_id` int(11) DEFAULT NULL,
  `teacherpic` varchar(255) DEFAULT NULL,
  `teacherphone` varchar(16) DEFAULT NULL,
  `teacheremail` varchar(255) DEFAULT NULL,
  `teacherbriefintro_c` varchar(255) DEFAULT NULL,
  `teacherbriefintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
