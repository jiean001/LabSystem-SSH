/*
Navicat MySQL Data Transfer

Source Server         : mdatabase
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : labsys_db

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-09-06 02:34:08
*/

SET FOREIGN_KEY_CHECKS=0;

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
-- Records of laboratoryinfo
-- ----------------------------
INSERT INTO `laboratoryinfo` VALUES ('1', '熊盛武', 'xiongshengwu', '朱安娜', 'xiongshegnwu 1', '这里是熊盛武实验室', 'this is the laboratory of xiongshengwu', '123456', '124655@qq.com', '武汉市', 'wuhan ', '4515230', 'sfasfsaf');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `news_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `newstitle_c` varchar(255) DEFAULT NULL,
  `newstitle_e` varchar(255) DEFAULT NULL,
  `newscontent_c` varchar(255) DEFAULT NULL,
  `newscontent_e` varchar(255) DEFAULT NULL,
  `newstime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('2', '新闻1', 'news1', '这是新闻1的内容', 'this is the content of newsa', '2017-09-04 12:26:00');
INSERT INTO `news` VALUES ('3', '新闻2', 'news2', '这是新闻2的内容', 'hello hfkafa', '2017-09-06 00:39:48');
INSERT INTO `news` VALUES ('4', '新闻3', 'news3', '这是新闻3的内容', 'adasfa fasfaf', '2017-09-22 00:39:50');
INSERT INTO `news` VALUES ('5', '新闻4', 'news4', '这是新闻4的内容', 'afdsafdsafsafa', '2017-09-06 00:39:51');
INSERT INTO `news` VALUES ('6', '新闻5', 'news5', '这是新闻5的内容', 'afdadsgdadg', '2017-09-06 00:39:54');

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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paper
-- ----------------------------
INSERT INTO `paper` VALUES ('1', '论文1', 'paper 1', '这是论文1', 'this is paper 1', 'www.baidu.com', '1', '1', '2017-09-05 12:19:40');
INSERT INTO `paper` VALUES ('2', '论文2', 'paper 2', '这是论文2', 'this is paper 2', null, null, null, '2017-09-05 12:20:32');
INSERT INTO `paper` VALUES ('3', '论文3', 'paper 3', null, null, null, null, null, '2017-09-05 12:22:12');
INSERT INTO `paper` VALUES ('4', '论文4', 'paper 4', null, null, null, null, null, '2017-09-05 12:22:18');
INSERT INTO `paper` VALUES ('5', '论文5', 'paper 5', null, null, null, null, null, '2017-09-05 12:22:20');
INSERT INTO `paper` VALUES ('6', '论文6', 'paper 6', null, null, null, null, null, '2017-09-05 12:22:22');
INSERT INTO `paper` VALUES ('7', '论文7', 'paper 7', null, null, null, null, null, '2017-09-05 12:22:25');
INSERT INTO `paper` VALUES ('8', '论文8', 'paper 8', null, null, null, null, null, '2017-09-05 12:22:27');
INSERT INTO `paper` VALUES ('9', '论文9', 'paper 9', null, null, null, null, null, '2017-09-05 12:22:29');
INSERT INTO `paper` VALUES ('10', '论文10', 'paper 10', null, null, null, null, null, '2017-09-05 12:22:32');
INSERT INTO `paper` VALUES ('11', '论文11', 'paper 11', null, null, null, null, null, '2017-09-05 12:22:35');

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
-- Records of paperbelong
-- ----------------------------

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
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('3', '项目1', 'project 1', '1', '这是项目1', 'this is project 1', '国家项目', 'guojiaxiagnmu', '2017-09-04 12:28:18', '2017-09-04 12:28:18', '100000');
INSERT INTO `project` VALUES ('4', '项目1', 'project 1', '1', '这是项目1', 'this is project 1', '国家项目', 'guojiaxiagnmu', '2017-09-04 12:29:48', '2017-09-04 12:29:48', '100000');

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
-- Records of resbelong
-- ----------------------------

-- ----------------------------
-- Table structure for reschfldres
-- ----------------------------
DROP TABLE IF EXISTS `reschfldres`;
CREATE TABLE `reschfldres` (
  `reschfldres_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `researchfield_id` int(11) DEFAULT NULL,
  `research_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`reschfldres_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reschfldres
-- ----------------------------
INSERT INTO `reschfldres` VALUES ('1', '1', '1');
INSERT INTO `reschfldres` VALUES ('2', '1', '2');
INSERT INTO `reschfldres` VALUES ('3', '1', '4');

-- ----------------------------
-- Table structure for research
-- ----------------------------
DROP TABLE IF EXISTS `research`;
CREATE TABLE `research` (
  `research_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `researchintropic` varchar(255) DEFAULT NULL,
  `researchname_c` varchar(255) NOT NULL,
  `researchname_e` varchar(255) DEFAULT NULL,
  `researchintro_c` varchar(255) DEFAULT NULL,
  `researchintro_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`research_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of research
-- ----------------------------
INSERT INTO `research` VALUES ('1', 'www.163.com', '机器视觉', 'computer television', '这里是机器视觉', 'this is the tv');
INSERT INTO `research` VALUES ('2', 'www.ifeng.com', '人工智能', 'serewrawefaw', '这是人工智能', 'tjhalk');

-- ----------------------------
-- Table structure for researchfield
-- ----------------------------
DROP TABLE IF EXISTS `researchfield`;
CREATE TABLE `researchfield` (
  `researchfield_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `researchfieldname_c` varchar(255) DEFAULT NULL,
  `researchfieldname_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`researchfield_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of researchfield
-- ----------------------------
INSERT INTO `researchfield` VALUES ('1', '机器学习', 'machine learning');
INSERT INTO `researchfield` VALUES ('2', '深度学习', 'deap learning');
INSERT INTO `researchfield` VALUES ('3', '数据挖掘', 'data mining');

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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of respaper
-- ----------------------------
INSERT INTO `respaper` VALUES ('1', '1', '1', '积分垃圾分类', 'sfsdfaasdfaasf');
INSERT INTO `respaper` VALUES ('2', '1', '2', '理发师傅卡就是开发了', 'flafaafa\'f');
INSERT INTO `respaper` VALUES ('3', '1', '4', '然而啊额绕绕绕', 'efefaearare');
INSERT INTO `respaper` VALUES ('4', '2', '3', null, null);
INSERT INTO `respaper` VALUES ('5', '1', '7', null, null);

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
-- Records of respro
-- ----------------------------

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
-- Records of source
-- ----------------------------
INSERT INTO `source` VALUES ('1', '期刊1', 'magazine 1', '这是期刊1 ', 'this is magazine 1', '1', '100');
INSERT INTO `source` VALUES ('2', '期刊2', 'magazine 2', '这是期刊1 ', 'this is magazine 2', '2', '90');

-- ----------------------------
-- Table structure for state
-- ----------------------------
DROP TABLE IF EXISTS `state`;
CREATE TABLE `state` (
  `state_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `statename_c` varchar(255) DEFAULT NULL,
  `statename_e` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`state_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of state
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1', '路雄博', 'Luxiongbo', '2017-08-01 23:30:02', 'www.baidu.com', '133131', 'afsdaf', '啊范德萨发生', 'afasfafasfaf', '1');
INSERT INTO `student` VALUES ('2', '2', '发顺丰', 'ggsgsa', null, null, null, null, null, null, '2');
INSERT INTO `student` VALUES ('3', '2', '飞洒', 'hhl', null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('4', '3', '啊房贷首付', 'gsdgsg', null, null, null, null, null, null, '4');
INSERT INTO `student` VALUES ('5', '3', '阿发是否', 'gsgs', null, null, null, null, null, null, '1');
INSERT INTO `student` VALUES ('6', '4', '胜多负少', null, null, null, null, null, null, null, '1');
INSERT INTO `student` VALUES ('7', '6', '这小子', null, null, null, null, null, null, null, '2');
INSERT INTO `student` VALUES ('8', '76', '在v下', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('9', '567', '石帆胜丰', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('10', '55767', '发顺丰都是', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('11', '47', '个体', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('12', '474', '微软微软', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('13', '474', '我认为而', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('14', '47474', '维尔瓦', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('15', '47', '胜多负少', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('16', '474', '高考', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('17', '47', '快高考', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('18', '475', '快高考高考', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('19', '47', '高考过后看过', null, null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('20', '475', '看过看过', null, null, null, null, null, null, null, '2');

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
) ENGINE=InnoDB AUTO_INCREMENT=111130 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stuyear
-- ----------------------------
INSERT INTO `stuyear` VALUES ('111113', '2013', '1', null, null);
INSERT INTO `stuyear` VALUES ('111114', '2013', '2', null, null);
INSERT INTO `stuyear` VALUES ('111115', '2014', '3', null, null);
INSERT INTO `stuyear` VALUES ('111116', '2014', '4', null, null);
INSERT INTO `stuyear` VALUES ('111117', '2015', '5', null, null);
INSERT INTO `stuyear` VALUES ('111118', '2016', '6', null, null);
INSERT INTO `stuyear` VALUES ('111119', '2016', '7', null, null);
INSERT INTO `stuyear` VALUES ('111120', '2017', '1', null, null);
INSERT INTO `stuyear` VALUES ('111121', '2017', '6', null, null);
INSERT INTO `stuyear` VALUES ('111122', '2017', '8', null, null);
INSERT INTO `stuyear` VALUES ('111123', '2017', '9', null, null);
INSERT INTO `stuyear` VALUES ('111124', '2017', '10', null, null);
INSERT INTO `stuyear` VALUES ('111125', '2016', '11', null, null);
INSERT INTO `stuyear` VALUES ('111126', '2016', '12', null, null);
INSERT INTO `stuyear` VALUES ('111127', '2016', '13', null, null);
INSERT INTO `stuyear` VALUES ('111128', '2016', '14', null, null);
INSERT INTO `stuyear` VALUES ('111129', '2016', '15', null, null);

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
-- Records of supervisortype
-- ----------------------------
INSERT INTO `supervisortype` VALUES ('1', '博士生导师', 'doctoral supervisor');
INSERT INTO `supervisortype` VALUES ('2', '硕士生导师', 'master superisor');

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '熊盛武', 'xiongshengwu', '1', '2017-04-13 01:06:42', '1', '1', '1', 'www', '13131132', 'rwrwr', '我确认我确认日期认为日期让人', 'jlasflasjffa');
INSERT INTO `teacher` VALUES ('2', '朱安娜', 'anna', '0', '2017-09-06 01:08:52', '1', '3', '2', 'qwqr', '1315165656', 'qrwerwqrw', '叫阿嘎是关机啦噶', 'asfsafsafsaggag');
INSERT INTO `teacher` VALUES ('3', '高永晟', 'yongsheng gao', '1', '2017-09-06 01:09:10', '1', '1', '1', 'dgsag', '22312123', 'agdsagag', '啊哥仨个的撒嘎嘎', 'gagasgaetwetwat');
INSERT INTO `teacher` VALUES ('4', '段鹏飞', 'pengfei duan', '1', '2017-09-06 01:10:20', '1', '2', '2', 'wtwqtwwqt', '43255315', '2525352', '噶咯阿哥嘎嘎嘎嘎嘎嘎嘎', '3qrawtawewagaa');
