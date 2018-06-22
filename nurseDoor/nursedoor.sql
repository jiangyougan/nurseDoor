/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.11-log : Database - nursedoor
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`nursedoor` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `nursedoor`;

/*Table structure for table `admin_function` */

DROP TABLE IF EXISTS `admin_function`;

CREATE TABLE `admin_function` (
  `admin_function_id` char(32) NOT NULL COMMENT '功能id',
  `admin_function_modular_id` char(32) DEFAULT NULL COMMENT '关联模块表id',
  `admin_function_add` int(2) DEFAULT NULL COMMENT '添加功能权限（0有1无）',
  `admin_function_del` int(2) DEFAULT NULL COMMENT '删除功能权限（0有1无）',
  `admin_function_upd` int(2) DEFAULT NULL COMMENT '修改功能权限（0有1无）',
  `admin_function_sel` int(2) DEFAULT NULL COMMENT '查询功能权限（0有1无）',
  `admin_function_createter` char(32) DEFAULT NULL COMMENT '创建人（关联管理员id）',
  `admin_function_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`admin_function_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_function` */

/*Table structure for table `admin_modular` */

DROP TABLE IF EXISTS `admin_modular`;

CREATE TABLE `admin_modular` (
  `modular_id` char(32) NOT NULL COMMENT '功能模块id',
  `modular_name` varchar(20) DEFAULT NULL COMMENT '功能模块名字',
  `modular_creater` char(32) DEFAULT NULL COMMENT '创建人(关联管理员id)',
  `modular_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`modular_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_modular` */

/*Table structure for table `administration` */

DROP TABLE IF EXISTS `administration`;

CREATE TABLE `administration` (
  `administration_id` char(32) NOT NULL COMMENT '后台管理员id',
  `administration_name` varchar(20) DEFAULT NULL COMMENT '后台管理员账号',
  `administration_pwd` varchar(30) DEFAULT NULL COMMENT '后台管理员密码',
  `administration_nick` varchar(50) DEFAULT NULL COMMENT '昵称',
  `administration_true_name` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `administration_department` varchar(20) DEFAULT NULL COMMENT '所属部门',
  `administration_sex` int(2) DEFAULT NULL COMMENT '1男2女',
  `administration_email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `administration_phone` char(11) DEFAULT NULL COMMENT '电话',
  `administration_address` varchar(30) DEFAULT NULL COMMENT '地址',
  `administration_grade` int(4) DEFAULT NULL COMMENT '等级(0代表最高权限)',
  `administration_state` int(4) DEFAULT '1' COMMENT '0停用/1启用',
  `administration_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `administration_createter` char(32) DEFAULT NULL COMMENT '创建人名称',
  PRIMARY KEY (`administration_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `administration` */

insert  into `administration`(`administration_id`,`administration_name`,`administration_pwd`,`administration_nick`,`administration_true_name`,`administration_department`,`administration_sex`,`administration_email`,`administration_phone`,`administration_address`,`administration_grade`,`administration_state`,`administration_createtime`,`administration_createter`) values ('1','123456','123456','lx','lx','开发部',1,'1156890717@qq.com','15098013787',NULL,0,0,'2016-10-26 00:00:00',NULL),('2','123456','123456','eq','lx','开发部',2,'1156890717@qq.com','15816400417',NULL,5,0,'2016-10-26 00:00:00',NULL);

/*Table structure for table `byaddress` */

DROP TABLE IF EXISTS `byaddress`;

CREATE TABLE `byaddress` (
  `byaddress_id` char(32) NOT NULL COMMENT '受护id',
  `byaddress_userid` char(32) DEFAULT NULL COMMENT '关联用户id',
  `byaddress_position_x` double(10,8) DEFAULT NULL COMMENT '经度',
  `byaddress_position_y` double(10,8) DEFAULT NULL COMMENT '纬度',
  `byaddress_address` varchar(50) DEFAULT NULL COMMENT '详细地址',
  `byaddress_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`byaddress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `byaddress` */

/*Table structure for table `evaluate` */

DROP TABLE IF EXISTS `evaluate`;

CREATE TABLE `evaluate` (
  `evaluate_id` char(32) NOT NULL COMMENT '评价id',
  `evaluate_userid` char(32) DEFAULT NULL COMMENT '评价人（关联用户id）',
  `evaluate_nurseid` char(32) DEFAULT NULL COMMENT '被评价人（关联护士id）',
  `evaluate_content` varchar(500) DEFAULT NULL COMMENT '评价内容',
  `evaluate_mark` decimal(10,0) DEFAULT NULL COMMENT '评价打分',
  `evaluate_createtime` datetime DEFAULT NULL COMMENT '评价时间',
  PRIMARY KEY (`evaluate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `evaluate` */

/*Table structure for table `follow` */

DROP TABLE IF EXISTS `follow`;

CREATE TABLE `follow` (
  `follow_id` char(32) NOT NULL COMMENT '关注id',
  `follow_followid` char(32) DEFAULT NULL COMMENT '关注人id',
  `follow_followid_iden` int(2) DEFAULT NULL COMMENT '关注人的身份（0用户 1护士）',
  `follow_befollowid` char(32) DEFAULT NULL COMMENT '被关注人id',
  `follow_befollowid_iden` int(2) DEFAULT NULL COMMENT '被关注人的身份（0用户 1护士）',
  `follow_createtime` datetime DEFAULT NULL COMMENT '关注时间',
  PRIMARY KEY (`follow_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `follow` */

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `goods_id` char(32) NOT NULL COMMENT '产品ID',
  `goods_content` char(32) DEFAULT NULL COMMENT '属于那一类（关联manage_nursing_content表）',
  `goods_name` varchar(32) DEFAULT NULL COMMENT '产品名称',
  `goods_money` decimal(10,2) DEFAULT NULL COMMENT '产品金钱',
  `goods_isdefault` int(4) DEFAULT '0' COMMENT '是否默认必选(0默认必选，1不选)',
  `goods_nurseid` char(32) DEFAULT NULL COMMENT '关联护士ID(暂时没用，冗余字段)',
  `goods_note` char(32) DEFAULT NULL COMMENT '可以使用的备注信息(备注表note中的主键)(暂时没用)',
  `goods_createadmin` char(32) DEFAULT NULL COMMENT '创建人',
  `goods_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `goods_updatime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

insert  into `goods`(`goods_id`,`goods_content`,`goods_name`,`goods_money`,`goods_isdefault`,`goods_nurseid`,`goods_note`,`goods_createadmin`,`goods_createtime`,`goods_updatime`) values ('1','193919eeb3014eeeb50ba2a2f4211d2a','肺结核','10.00',0,NULL,NULL,NULL,NULL,NULL),('2','193919eeb3014eeeb50ba2a2f4211d2a','儿童护理','20.00',0,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `hospital` */

DROP TABLE IF EXISTS `hospital`;

CREATE TABLE `hospital` (
  `hospital_id` char(32) NOT NULL COMMENT '医院id',
  `hospital_name` varchar(30) DEFAULT NULL COMMENT '医院名',
  `hospital_province` varchar(10) DEFAULT NULL COMMENT '所在省份',
  `hospital_city` varchar(10) DEFAULT NULL COMMENT '所在城市',
  `hospital_district` varchar(10) DEFAULT NULL COMMENT '所在区县',
  `hospital_address` varchar(50) DEFAULT NULL COMMENT '医院详细地址',
  `hospital_phone` char(11) DEFAULT NULL COMMENT '医院电话',
  `hospital_createter` char(32) DEFAULT NULL COMMENT '关联管理员id',
  `hospital_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`hospital_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hospital` */

insert  into `hospital`(`hospital_id`,`hospital_name`,`hospital_province`,`hospital_city`,`hospital_district`,`hospital_address`,`hospital_phone`,`hospital_createter`,`hospital_createtime`) values ('123456',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `major` */

DROP TABLE IF EXISTS `major`;

CREATE TABLE `major` (
  `major_id` char(32) NOT NULL COMMENT '专业id',
  `major_name` varchar(20) DEFAULT NULL COMMENT '专业名称',
  `major_note` varchar(100) DEFAULT NULL COMMENT '专业备注',
  `major_details` varchar(100) DEFAULT NULL COMMENT '所属医院',
  `major_createter` char(32) DEFAULT NULL COMMENT '关联管理员id',
  `major_cteatetime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`major_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `major` */

insert  into `major`(`major_id`,`major_name`,`major_note`,`major_details`,`major_createter`,`major_cteatetime`) values ('1','儿童','qwe','123456',NULL,NULL),('2','儿童',NULL,'123',NULL,NULL),('3','成人',NULL,'123456',NULL,NULL);

/*Table structure for table `manage_nursing_content` */

DROP TABLE IF EXISTS `manage_nursing_content`;

CREATE TABLE `manage_nursing_content` (
  `manage_nursing_content_id` char(32) NOT NULL COMMENT '护理服务项详细id(二级菜单)',
  `manage_nursing_content_maproject` char(32) DEFAULT NULL COMMENT '关联护理服务id(一级菜单)',
  `manage_nursing_content_major` char(20) DEFAULT NULL COMMENT '所属专业',
  `manage_nursing_content_name` varchar(32) DEFAULT NULL COMMENT '护理服务项名字',
  `manage_nursing_content_content` varchar(1000) DEFAULT NULL COMMENT '护理服务项简介',
  `manage_nursing_content_forpeople` text COMMENT '适用人群',
  `manage_nursing_content_look` text COMMENT '注意事项',
  `manage_nursing_content_cost` decimal(10,2) DEFAULT NULL COMMENT '该项护理费用(暂时没用)',
  `manage_nursing_content_supplies` decimal(10,2) DEFAULT NULL COMMENT '护理耗材费用(暂时没用)',
  `content_imgurl` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `content_required` int(4) DEFAULT '0' COMMENT '是否必选（0否，1是）(暂时没用)',
  `content_note` char(32) DEFAULT NULL COMMENT '可以使用的备注信息(备注表note中的主键)',
  `manage_nursing_content_createter` char(32) DEFAULT NULL COMMENT '创建人',
  `manage_nursing_content_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `manage_nursing_content_updatetime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`manage_nursing_content_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manage_nursing_content` */

insert  into `manage_nursing_content`(`manage_nursing_content_id`,`manage_nursing_content_maproject`,`manage_nursing_content_major`,`manage_nursing_content_name`,`manage_nursing_content_content`,`manage_nursing_content_forpeople`,`manage_nursing_content_look`,`manage_nursing_content_cost`,`manage_nursing_content_supplies`,`content_imgurl`,`content_required`,`content_note`,`manage_nursing_content_createter`,`manage_nursing_content_createtime`,`manage_nursing_content_updatetime`) values ('060dfa73a5e84360802f73b4f974bbad','1','1','儿童','儿童检测','<p>不要太大<img src=\"/nurseDoor/ueditor/jsp/upload/image/20161031/1477877286126048752.jpg\" title=\"1477877286126048752.jpg\" alt=\"2.jpg\"/></p>',NULL,'0.00','0.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/3210749856269204_25.jpg',0,NULL,NULL,'2016-10-31 09:27:25',NULL),('096953daac2d42d49a2a368fbb0b6016','1','1','','',NULL,NULL,'0.00','0.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/21389547',0,NULL,NULL,'2016-10-31 09:25:32',NULL),('0d2241ea42aa4918aef98571f16f3f2b','1','1','肺结核','肺结核检测',NULL,NULL,'231.00','21.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/965832403c4ccf6201ffded48814f4e55a9a9b3e.jpg',1,NULL,NULL,'2016-10-31 09:24:57',NULL),('1117f9ade4bb44cb804ea04b961c3813','1','1','儿童护理','儿童护理',NULL,NULL,'23.00','23.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/238796402.jpg',1,NULL,NULL,'2016-10-29 20:48:01',NULL),('121da4f69a734c08983d8c6247d01d06','1','1','嗷嗷','是的',NULL,NULL,'230.00','100.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/95372108',1,NULL,NULL,'2016-10-30 15:47:31',NULL),('19336ea7783f41e68dacf1829c6e6f48','1','1','妇产科','产前检测','<p>孕妇</p><p><img src=\"/nurseDoor/ueditor/jsp/upload/image/20161031/1477878760449082743.jpg\" title=\"1477878760449082743.jpg\" alt=\"3.jpg\"/></p>','<p>产前</p><p><img src=\"/nurseDoor/ueditor/jsp/upload/image/20161031/1477878773875000865.jpg\" title=\"1477878773875000865.jpg\" alt=\"3.jpg\"/></p>','2123.00','123.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/750691343.jpg',0,NULL,NULL,'2016-10-31 09:52:26',NULL),('193919eeb3014eeeb50ba2a2f4211d2a','1','1','成人健康','健康检测','<p>双十一半价优惠</p><p><img src=\"/nurseDoor/ueditor/jsp/upload/image/20161031/1477878632729064741.jpg\" title=\"1477878632729064741.jpg\" alt=\"2.jpg\"/></p>','<p>不要感冒</p><p><img src=\"/nurseDoor/ueditor/jsp/upload/image/20161031/1477878608794061284.jpg\" title=\"1477878608794061284.jpg\" alt=\"2.jpg\"/></p>','1223.00','213.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/483207962.jpg',1,NULL,NULL,'2016-10-31 09:49:42',NULL),('1b9d75983364473796201c9f7b1ea727','1','1','儿童','',NULL,NULL,'0.00','0.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/86203591',0,NULL,NULL,'2016-10-29 20:57:53',NULL),('2','1','212','21','21','2','21','21.00','21.00',NULL,0,NULL,'21',NULL,NULL),('26ca49a21fed4ff2a71b258959360255','1','1','肺结核','肺结核检测','',NULL,'231.00','12.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/431062983c4ccf6201ffded48814f4e55a9a9b3e.jpg',1,NULL,NULL,'2016-10-31 09:26:37',NULL),('376470e660a64f8f8f10af22a7ba88b9','2','2','儿童','儿童',NULL,NULL,'0.00','0.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/205967311.jpg',1,NULL,NULL,'2016-10-29 20:56:20',NULL),('78a6e5780fcc4cc2a1e98cbf03a0db65','1','1','静脉输液','',NULL,NULL,'0.00','0.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/49753018',0,NULL,NULL,'2016-10-30 15:46:23',NULL),('7a3cf78e9b374157b0e1600bc77746a0','1','1','肺结核','肺结核检测','<p>广大人群</p><p><img src=\"/nurseDoor/ueditor/jsp/upload/image/20161031/1477875879363081331.jpg\" title=\"1477875879363081331.jpg\" alt=\"3c4ccf6201ffded48814f4e55a9a9b3e.jpg\"/></p>',NULL,'321.00','21.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/680752933c4ccf6201ffded48814f4e55a9a9b3e.jpg',1,NULL,NULL,'2016-10-31 09:04:17',NULL),('8ff76a9694b64fb2841e46d8be3ee4c4','1','1','99','99',NULL,NULL,'99.00','99.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/475629811.jpg',1,NULL,NULL,NULL,NULL),('995e3cdde48a4d73a9a2467511122046','1','1','儿童护理','儿童洗澡',NULL,NULL,'9898.00','98.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/054168271.jpg',1,NULL,NULL,'2016-10-29 20:54:42',NULL),('ab403de74d5846259bf10dfb14700e07','2','2','31','·12312',NULL,NULL,'3123.00','12312.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/167028931.jpg',1,NULL,NULL,'2016-10-29 21:02:51',NULL),('b08a4291a938496fb6b0ddd89e515bb2','1','1','静脉输液','',NULL,NULL,'0.00','0.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/741905263c4ccf6201ffded48814f4e55a9a9b3e.jpg',0,NULL,NULL,'2016-10-30 15:47:12',NULL),('b249d7da75f142659d8dfeb385d2427e','2','2','成人护理','健康检测','<p>成年人</p><p><img src=\"/nurseDoor/ueditor/jsp/upload/image/20161031/1477878380223043749.jpg\" title=\"1477878380223043749.jpg\" alt=\"1.jpg\"/></p>','<p>不要感冒</p><p><img src=\"/nurseDoor/ueditor/jsp/upload/image/20161031/1477878397646027337.jpg\" title=\"1477878397646027337.jpg\" alt=\"1.jpg\"/></p>','121.00','12.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/739108561.jpg',1,NULL,NULL,'2016-10-31 09:45:50',NULL),('d895be14a789488a8627e3b497c59f86','1','1','儿童护理','儿童护理',NULL,NULL,'898.00','89.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/8245963156269204_25.jpg',1,NULL,NULL,'2016-10-29 20:50:31',NULL),('e90a80628bdb46508caa44e6e1fd5735','1','1','新生儿护理套餐','是的','',NULL,'230.00','100.00','ndows-x64\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\nurseDoor\\imgpath/event/128760343c4ccf6201ffded48814f4e55a9a9b3e.jpg',1,NULL,NULL,'2016-10-30 15:51:21',NULL);

/*Table structure for table `manage_nursing_project` */

DROP TABLE IF EXISTS `manage_nursing_project`;

CREATE TABLE `manage_nursing_project` (
  `manage_nursing_project_id` char(32) NOT NULL COMMENT '护理服务id',
  `manage_nursing_project_pic` varchar(50) DEFAULT NULL COMMENT '护理服务图标',
  `manage_nursing_project_name_id` varchar(20) DEFAULT NULL COMMENT '护理服务名',
  `manage_nursing_project_major` char(20) DEFAULT NULL COMMENT '所属专业',
  `project_imgurl` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `manage_nursing_project_createter` char(32) DEFAULT NULL COMMENT '创建人(后台管理员id)',
  `manage_nursing_project_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `manage_nursing_project_updatetime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`manage_nursing_project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manage_nursing_project` */

insert  into `manage_nursing_project`(`manage_nursing_project_id`,`manage_nursing_project_pic`,`manage_nursing_project_name_id`,`manage_nursing_project_major`,`project_imgurl`,`manage_nursing_project_createter`,`manage_nursing_project_createtime`,`manage_nursing_project_updatetime`) values ('1','1','1','1','1','1',NULL,NULL),('2','2','2','2','2','2',NULL,NULL);

/*Table structure for table `manage_nursing_testing` */

DROP TABLE IF EXISTS `manage_nursing_testing`;

CREATE TABLE `manage_nursing_testing` (
  `manage_nursing_testing_id` char(32) NOT NULL COMMENT '护理服务项详细检测id',
  `manage_nursing_testing_macontent` char(32) DEFAULT NULL COMMENT '关联护理服务项id',
  `manage_nursing_testing_name` varchar(32) DEFAULT NULL COMMENT '护理服务项详细检测name（血糖 血压等）',
  `manage_nursing_testing_createtime` char(32) DEFAULT NULL COMMENT '创建人',
  `manage_nursing_testing_createter` datetime DEFAULT NULL COMMENT '创建时间',
  `manage_nursing_testing_updatetime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`manage_nursing_testing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manage_nursing_testing` */

/*Table structure for table `note` */

DROP TABLE IF EXISTS `note`;

CREATE TABLE `note` (
  `note_id` char(32) NOT NULL COMMENT '备注ID',
  `note_name` varchar(64) DEFAULT NULL COMMENT '备注名称',
  `note_crtetime` datetime DEFAULT NULL COMMENT '备注创建时间',
  `note_crteadmin` char(32) DEFAULT NULL COMMENT '备注创建人',
  PRIMARY KEY (`note_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `note` */

/*Table structure for table `nurse` */

DROP TABLE IF EXISTS `nurse`;

CREATE TABLE `nurse` (
  `nurse_id` char(32) NOT NULL COMMENT 'id',
  `nurse_header` char(100) DEFAULT NULL COMMENT '头像',
  `nurse_nick` char(32) DEFAULT NULL COMMENT '昵称',
  `nurse_name` char(22) DEFAULT NULL COMMENT '账号',
  `nurse_pwd` varchar(32) DEFAULT NULL COMMENT '密码',
  `nurse_phone` char(22) DEFAULT NULL COMMENT '手机号',
  `nurse_address` varchar(50) DEFAULT NULL,
  `nurse_invitationcode` char(32) DEFAULT NULL COMMENT '邀请码',
  `nurse_invitationlink` varchar(100) DEFAULT NULL COMMENT '邀请码链接',
  `nurse_sex` char(4) DEFAULT NULL COMMENT '性别 1男2女',
  `nurse_age` char(6) DEFAULT NULL COMMENT '年龄',
  `nurse_language` varchar(32) DEFAULT NULL COMMENT '擅长语言',
  `nurse_work_unit` varchar(50) DEFAULT NULL COMMENT '工作单位',
  `nurse_job` varchar(20) DEFAULT NULL COMMENT '职称',
  `nurse_office` varchar(32) DEFAULT NULL COMMENT '科室',
  `nurse_number` varchar(40) DEFAULT NULL COMMENT '护士注册号',
  `nurse_yearsofservice` char(10) DEFAULT NULL COMMENT '工作年限',
  `nurse_note` varchar(256) DEFAULT NULL COMMENT '备注（个人优势）',
  `nurse_place` varchar(128) DEFAULT NULL COMMENT '服务地点',
  `nurse_goodservice` varchar(256) DEFAULT NULL COMMENT '提供的服务',
  `nurse_nurse_licensepic` varchar(500) DEFAULT NULL COMMENT '职业照片（护士执照等）',
  `nurse_email` char(32) DEFAULT NULL COMMENT '邮箱',
  `nurse_truename` char(16) DEFAULT NULL COMMENT '真实姓名',
  `nurse_cardpic` varchar(256) DEFAULT NULL COMMENT '身份证照片',
  `nurse_card` char(18) DEFAULT NULL COMMENT '身份证号',
  `nurse_province` varchar(10) DEFAULT NULL COMMENT '省份',
  `nurse_city` varchar(14) DEFAULT NULL COMMENT '城市',
  `nurse_district` varchar(14) DEFAULT NULL COMMENT '区县',
  `nurse_sign` varchar(256) DEFAULT NULL COMMENT '个性签名',
  `nurse_position_x` double(16,8) DEFAULT NULL COMMENT '经度',
  `nurse_position_y` double(16,8) DEFAULT NULL COMMENT '纬度',
  `nurse_balance` decimal(10,2) DEFAULT NULL COMMENT '余额',
  `nurse_usestate` int(2) DEFAULT NULL COMMENT '可用状态',
  `nurse_mark` decimal(10,0) DEFAULT NULL COMMENT '积分',
  `nurse_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`nurse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nurse` */

insert  into `nurse`(`nurse_id`,`nurse_header`,`nurse_nick`,`nurse_name`,`nurse_pwd`,`nurse_phone`,`nurse_address`,`nurse_invitationcode`,`nurse_invitationlink`,`nurse_sex`,`nurse_age`,`nurse_language`,`nurse_work_unit`,`nurse_job`,`nurse_office`,`nurse_number`,`nurse_yearsofservice`,`nurse_note`,`nurse_place`,`nurse_goodservice`,`nurse_nurse_licensepic`,`nurse_email`,`nurse_truename`,`nurse_cardpic`,`nurse_card`,`nurse_province`,`nurse_city`,`nurse_district`,`nurse_sign`,`nurse_position_x`,`nurse_position_y`,`nurse_balance`,`nurse_usestate`,`nurse_mark`,`nurse_createtime`) values ('08d1fa926da74ca58fcf2f239cc89dd0','nurseDoor/NurseImg/NurseHeader/08d1fa926da74ca58fcf2f239cc89dd075483196.jpg','大师','18348087862','49ba59abbe56e057',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('9e1b02d677ad4879a3bf16a4836db274','nurseDoor/NurseImg/NurseHeader/9e1b02d677ad4879a3bf16a4836db27437912458.jpg','蜗牛','15757101111','49ba59abbe56e057',NULL,NULL,NULL,NULL,'1','23',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'刘霄',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('a768101a6ecb495cbd8c7b64e6eeb4d7','nurseDoor/NurseImg/NurseHeader/a768101a6ecb495cbd8c7b64e6eeb4d725764819.jpg','lx','15098013787','49ba59abbe56e057','15098013787','杭州市',NULL,NULL,'1',NULL,'英语，法语，日语','第一人民医院',NULL,NULL,'123456789',NULL,'非常好',NULL,'儿童护理,成人护理','nurseDoor/NurseImg/NurseLicensepic/a768101a6ecb495cbd8c7b64e6eeb4d778291450.jpg,nurseDoor/NurseImg/NurseLicensepic/a768101a6ecb495cbd8c7b64e6eeb4d707638529.jpg','www.1156890717@qq.com','刘霄','nurseDoor/NurseImg/NurseCardPic/a768101a6ecb495cbd8c7b64e6eeb4d762510974.jpg,nurseDoor/NurseImg/NurseCardPic/a768101a6ecb495cbd8c7b64e6eeb4d709536187.jpg','420281199409065415',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('cd892f55d43d421fbcbd40c2121eb3a5','nurseDoor/NurseImg/NurseHeader/cd892f55d43d421fbcbd40c2121eb3a590821573.jpg','lx','15816400417','49ba59abbe56e057',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `nurse_nofree` */

DROP TABLE IF EXISTS `nurse_nofree`;

CREATE TABLE `nurse_nofree` (
  `nurse_nofree_id` char(1) NOT NULL COMMENT 'id',
  `nurse_nofree_nurseid` char(32) DEFAULT NULL COMMENT '护士id',
  `nurse_nofree_begintime` datetime DEFAULT NULL COMMENT '不空闲的开始时间段',
  `nurse_nofree_stoptime` datetime DEFAULT NULL COMMENT '不空闲的结束时间段',
  `nurse_nofree_name` varchar(20) DEFAULT NULL COMMENT '名称',
  `nurse_nofree_note` varchar(20) DEFAULT NULL COMMENT '备注',
  `nurse_nofree_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`nurse_nofree_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nurse_nofree` */

insert  into `nurse_nofree`(`nurse_nofree_id`,`nurse_nofree_nurseid`,`nurse_nofree_begintime`,`nurse_nofree_stoptime`,`nurse_nofree_name`,`nurse_nofree_note`,`nurse_nofree_createtime`) values ('1','1','1970-01-18 10:25:50','1970-01-18 10:25:58','12','12','2016-10-27 14:52:01'),('2','1','2016-10-28 14:57:55','2016-10-29 14:57:55','12','12','2016-10-27 14:55:00');

/*Table structure for table `nursing_project` */

DROP TABLE IF EXISTS `nursing_project`;

CREATE TABLE `nursing_project` (
  `nursing_project_id` char(32) NOT NULL COMMENT '护士选择护理项目id',
  `nursing_nurseid` char(32) DEFAULT NULL COMMENT '关联护士id',
  `nursing_project_macontent` varchar(32) DEFAULT NULL COMMENT '关联护士护理服务项id',
  `nursing_project_note` varchar(256) DEFAULT NULL COMMENT '备注',
  `nursing_project_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`nursing_project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nursing_project` */

/*Table structure for table `nursing_report` */

DROP TABLE IF EXISTS `nursing_report`;

CREATE TABLE `nursing_report` (
  `nursing reportid` char(32) DEFAULT NULL COMMENT '护理报告表',
  `nursing_report_orderid` char(32) DEFAULT NULL COMMENT '订单表id（一个报告关联一个订单表）',
  `nursing_report_nurseid` char(32) DEFAULT NULL COMMENT '护士表id（关联护士表id）',
  `nursing_report_contentid` char(32) DEFAULT NULL COMMENT '关联护理服务项id',
  `nursing_report_note` varchar(500) DEFAULT NULL COMMENT '备注',
  `nursing_report_servicepic` varchar(500) DEFAULT NULL COMMENT '服务信息图片',
  `nursing_report_addrecords` varchar(500) DEFAULT NULL COMMENT '补充记录',
  `nursing_report_lable` char(10) DEFAULT NULL COMMENT '标签（建议就诊/..）',
  `nursing_reportpic` varchar(1000) DEFAULT NULL COMMENT '图片资料',
  `nursing_report_createtime` datetime DEFAULT NULL COMMENT '报告创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nursing_report` */

/*Table structure for table `nursing_testing_content` */

DROP TABLE IF EXISTS `nursing_testing_content`;

CREATE TABLE `nursing_testing_content` (
  `nursing_testing_contentid` char(32) NOT NULL COMMENT '用户检测护理内容id',
  `nursing_orderid` char(32) DEFAULT NULL COMMENT '关联订单id',
  `nursing_nurseid` char(32) DEFAULT NULL COMMENT '护士id（关联护士表）',
  `nursing_testing_id` char(32) DEFAULT NULL COMMENT '关联护理服务检测表id',
  `nursing_project_note` varchar(32) DEFAULT NULL COMMENT '护理具体数据（如36摄氏度、19次）',
  `nursing_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`nursing_testing_contentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nursing_testing_content` */

/*Table structure for table `order_receiver` */

DROP TABLE IF EXISTS `order_receiver`;

CREATE TABLE `order_receiver` (
  `order_receive_id` char(32) NOT NULL COMMENT 'id',
  `order_nurseid` char(32) DEFAULT NULL COMMENT '接单护士id',
  `order_ordersendid` char(32) DEFAULT NULL COMMENT '订单id（关联用户发单表）',
  `order_receivestate` char(4) DEFAULT NULL COMMENT '接单状态0已接单1已沟通2已出发3开始服务4已完成',
  `order_createtime` datetime DEFAULT NULL COMMENT '接单时间',
  PRIMARY KEY (`order_receive_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_receiver` */

insert  into `order_receiver`(`order_receive_id`,`order_nurseid`,`order_ordersendid`,`order_receivestate`,`order_createtime`) values ('1','2','0bac9cee208c415a90bcf70af327e6b4','1','2016-10-29 09:57:00'),('2','2','40f9022c621649ea839057cf93b7ac29','2','2016-10-29 09:57:00'),('3','2','972013707e2148e3927b0b3658784d17','3','2016-10-29 09:57:00');

/*Table structure for table `order_send` */

DROP TABLE IF EXISTS `order_send`;

CREATE TABLE `order_send` (
  `order_send_id` char(32) NOT NULL COMMENT '订单id',
  `order_send_numbers` char(32) DEFAULT NULL COMMENT '订单单号',
  `order_send_userid` char(32) DEFAULT NULL COMMENT '订单创建人',
  `order_send_servicecontent` varchar(32) DEFAULT NULL COMMENT '服务项目',
  `order_send_username` varchar(20) DEFAULT NULL COMMENT '服务对象名字',
  `order_send_card` char(18) DEFAULT NULL COMMENT '身份证号',
  `order_send_sex` char(4) DEFAULT NULL COMMENT '服务对象性别 1男2女',
  `order_send_age` char(8) DEFAULT NULL COMMENT '服务对象年龄',
  `order_send_addree` varchar(125) DEFAULT NULL COMMENT '服务对象地址',
  `order_send_userpic` varchar(1000) DEFAULT NULL COMMENT '服务对象图片',
  `order_send_note` varchar(1000) DEFAULT NULL COMMENT '订单备注',
  `order_send_coupon` char(32) DEFAULT NULL COMMENT '订单优惠券(关联优惠券id)',
  `order_send_trafficmoney` decimal(10,2) DEFAULT NULL COMMENT '订单交通费',
  `order_send_savemoney` decimal(10,2) DEFAULT NULL COMMENT '订单保险费',
  `order_send_costmoney` decimal(10,2) DEFAULT NULL COMMENT '订单服务费用',
  `order_send_ispayment` char(4) DEFAULT NULL COMMENT '是否支付0未支付1已支付',
  `order_send_totalmoney` char(20) DEFAULT NULL COMMENT '支付总金额',
  `order_send_issafe` char(4) DEFAULT NULL COMMENT '是否购买保险0未买1已买',
  `order_send_type` char(4) DEFAULT NULL COMMENT '订单类型（0全发/1指定）',
  `order_send_state` char(4) DEFAULT NULL COMMENT '订单状态（-1进行中/0正在发布/1已被接取/2已服务/3已完成/4被取消/为空为待预约）',
  `order_send_begintime` datetime DEFAULT NULL COMMENT '开始时间',
  `order_send_stoptime` datetime DEFAULT NULL COMMENT '结束时间',
  `order_send_createtime` datetime DEFAULT NULL COMMENT '订单创建时间',
  PRIMARY KEY (`order_send_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_send` */

insert  into `order_send`(`order_send_id`,`order_send_numbers`,`order_send_userid`,`order_send_servicecontent`,`order_send_username`,`order_send_card`,`order_send_sex`,`order_send_age`,`order_send_addree`,`order_send_userpic`,`order_send_note`,`order_send_coupon`,`order_send_trafficmoney`,`order_send_savemoney`,`order_send_costmoney`,`order_send_ispayment`,`order_send_totalmoney`,`order_send_issafe`,`order_send_type`,`order_send_state`,`order_send_begintime`,`order_send_stoptime`,`order_send_createtime`) values ('0bac9cee208c415a90bcf70af327e6b4','4560720161020','a768101a6ecb495cbd8c7b64e6eeb4d7','成人护理3','刘霄','420281199409065415','1','23','杭州市','nurseDoor/NurseImg/OrderSendPic/0bac9cee208c415a90bcf70af327e6b405123486.jpg,nurseDoor/NurseImg/OrderSendPic/0bac9cee208c415a90bcf70af327e6b448215369.jpg','请爱护','1','30.00','5.00','199.00','1','234','1','1','-1','2016-11-12 13:33:08','2016-11-12 13:33:08','2016-10-20 10:46:29'),('40f9022c621649ea839057cf93b7ac29','4649720161020','a768101a6ecb495cbd8c7b64e6eeb4d7','成人护理2','刘霄','420281199409065415','1','23','杭州市','nurseDoor/NurseImg/OrderSendPic/40f9022c621649ea839057cf93b7ac2964053912.jpg,nurseDoor/NurseImg/OrderSendPic/40f9022c621649ea839057cf93b7ac2921976830.jpg','请爱护','1','30.00','5.00','199.00','1','234','1','0','0','2016-11-12 13:33:08','2016-11-12 17:33:08','2016-10-20 10:43:27'),('972013707e2148e3927b0b3658784d17','8009020161020','a768101a6ecb495cbd8c7b64e6eeb4d7','成人护理1','刘霄','420281199409065415','1','23','杭州市','nurseDoor/NurseImg/OrderSendPic/972013707e2148e3927b0b3658784d1769570321.jpg,nurseDoor/NurseImg/OrderSendPic/972013707e2148e3927b0b3658784d1779148025.jpg','请爱护','1','30.00','5.00','199.00','1','234','1','0','0','2016-09-12 13:33:08','2016-11-12 13:33:08','2016-10-20 10:13:24');

/*Table structure for table `order_send_special` */

DROP TABLE IF EXISTS `order_send_special`;

CREATE TABLE `order_send_special` (
  `order_send_special_id` char(32) NOT NULL COMMENT '专属订单id',
  `order_send_special_ordersendid` char(32) DEFAULT NULL COMMENT '关联发订单表id',
  `order_send_special_nurseid` char(32) DEFAULT NULL COMMENT '关联护士id',
  `order_send_special_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`order_send_special_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_send_special` */

insert  into `order_send_special`(`order_send_special_id`,`order_send_special_ordersendid`,`order_send_special_nurseid`,`order_send_special_createtime`) values ('3f976b943e764396aa0b4336f904ae9d','0bac9cee208c415a90bcf70af327e6b4','9e1b02d677ad4879a3bf16a4836db274','2016-10-20 10:46:30'),('6d8b522e2f71476d822a15ad6cbf79f3','40f9022c621649ea839057cf93b7ac29','1941074296884cd6b8dabca4847fc82c','2016-10-20 10:43:54'),('7b7ce1ea4bd94553a32cba723630dde4','05637c432fef4b9dafe615015e27435b','9e1b02d677ad4879a3bf16a4836db274','2016-10-20 10:55:04'),('9e1ecd139cd74951a0a61a889f8b1137','0bac9cee208c415a90bcf70af327e6b4','827348d9e67f4adbb9fb21510f70f70f','2016-10-20 10:46:30'),('c41350fd6eb24d488647e3c14a3e020b','0bac9cee208c415a90bcf70af327e6b4','1941074296884cd6b8dabca4847fc82c','2016-10-20 10:46:30');

/*Table structure for table `package` */

DROP TABLE IF EXISTS `package`;

CREATE TABLE `package` (
  `package_id` char(32) DEFAULT NULL COMMENT '套餐id',
  `package_manursing_content` char(32) DEFAULT NULL COMMENT '关联服务项id',
  `package1_name` varchar(20) DEFAULT NULL COMMENT '套餐名称',
  `package1_describe` text COMMENT '套餐描述',
  `package1_cost` decimal(10,2) DEFAULT NULL COMMENT '套餐费用',
  `package_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `package_updatime` datetime DEFAULT NULL COMMENT '套餐修改时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `package` */

insert  into `package`(`package_id`,`package_manursing_content`,`package1_name`,`package1_describe`,`package1_cost`,`package_createtime`,`package_updatime`) values ('1','2','1','1','1.00','2016-10-20 00:00:00','2016-10-20 00:00:00'),('2','2','2','2','2.00','2016-10-27 00:00:00','2016-10-27 00:00:00'),('932c136fb1b745628b5e91ca9d5fbd2f','19336ea7783f41e68dacf1829c6e6f48',NULL,'<p>双十一半价优惠</p><p><img src=\"/nurseDoor/ueditor/jsp/upload/image/20161031/1477878795346097864.jpg\" title=\"1477878795346097864.jpg\" alt=\"3.jpg\"/></p>',NULL,'2016-10-31 09:53:17',NULL);

/*Table structure for table `protected_address` */

DROP TABLE IF EXISTS `protected_address`;

CREATE TABLE `protected_address` (
  `protected_address_id` char(32) NOT NULL COMMENT '受护地址id',
  `protected_address_userid` char(32) DEFAULT NULL COMMENT '关联用户id',
  `protected_address_position_x` double(10,6) DEFAULT NULL COMMENT '经度',
  `protected_address_position_y` double(10,6) DEFAULT NULL COMMENT '纬度',
  `protected_address_address` varchar(50) DEFAULT NULL COMMENT '详细地址',
  `protected_address_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`protected_address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `protected_address` */

/*Table structure for table `protected_person` */

DROP TABLE IF EXISTS `protected_person`;

CREATE TABLE `protected_person` (
  `protected_person_id` char(32) NOT NULL COMMENT '受护人id',
  `protected_person_name` varchar(20) DEFAULT NULL COMMENT '受护人名字',
  `protected_person_sex` char(2) DEFAULT NULL COMMENT '性别',
  `protected_person_card` char(18) DEFAULT NULL COMMENT '身份证号码',
  `protected_person_age` char(4) DEFAULT NULL COMMENT '年龄',
  `protected_person_guardian` varchar(20) DEFAULT NULL COMMENT '监护人',
  `protected_person_phone` char(11) DEFAULT NULL COMMENT '手机',
  `protected_person_nexus` varchar(10) DEFAULT NULL COMMENT '关系',
  `protected_address_id` char(32) DEFAULT NULL COMMENT '关联受护地址id',
  `protected_person_note` varchar(126) DEFAULT NULL COMMENT '病史备注',
  `protected_address` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `protected_default` int(4) DEFAULT '0' COMMENT '是否默认（0否，1是）',
  `protected_user_id` char(32) DEFAULT NULL COMMENT '关联用户ID',
  PRIMARY KEY (`protected_person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `protected_person` */

insert  into `protected_person`(`protected_person_id`,`protected_person_name`,`protected_person_sex`,`protected_person_card`,`protected_person_age`,`protected_person_guardian`,`protected_person_phone`,`protected_person_nexus`,`protected_address_id`,`protected_person_note`,`protected_address`,`protected_default`,`protected_user_id`) values ('1','儿童','1','1','12','12','12','12','12','12','12',1,'a768101a6ecb495cbd8c7b64e6eeb4d7');

/*Table structure for table `save` */

DROP TABLE IF EXISTS `save`;

CREATE TABLE `save` (
  `save_id` char(32) NOT NULL COMMENT '保险id',
  `save_cost` decimal(10,2) DEFAULT NULL COMMENT '保险费用',
  `save_createter` char(32) DEFAULT NULL COMMENT '创建人',
  `save_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `save_updatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `save_name` varchar(64) DEFAULT NULL COMMENT '保险名称',
  `save_logo` varchar(255) DEFAULT NULL COMMENT '保险logo',
  `save_url` varchar(255) DEFAULT NULL COMMENT '保险url',
  `save_info` varchar(255) DEFAULT NULL COMMENT '保险内容',
  PRIMARY KEY (`save_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `save` */

insert  into `save`(`save_id`,`save_cost`,`save_createter`,`save_createtime`,`save_updatetime`,`save_name`,`save_logo`,`save_url`,`save_info`) values ('1','5.00','1','2016-10-20 00:00:00',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `traffic` */

DROP TABLE IF EXISTS `traffic`;

CREATE TABLE `traffic` (
  `traffic_id` char(32) NOT NULL COMMENT '交通费id',
  `traffic_cost` decimal(10,2) DEFAULT NULL COMMENT '费用',
  `traffic_creater` char(32) DEFAULT NULL COMMENT '创建人',
  `traffic_updatetime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`traffic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `traffic` */

insert  into `traffic`(`traffic_id`,`traffic_cost`,`traffic_creater`,`traffic_updatetime`) values ('1','30.00','1',NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` char(32) NOT NULL COMMENT '用户id',
  `user_header` char(100) DEFAULT NULL COMMENT '用户头像',
  `user_nick` varchar(32) DEFAULT NULL COMMENT '用户昵称',
  `user_name` char(32) DEFAULT NULL COMMENT '用户账号',
  `user_pwd` varchar(32) DEFAULT NULL COMMENT '用户密码',
  `user_phone` char(22) DEFAULT NULL COMMENT '手机号',
  `user_address` varchar(50) DEFAULT NULL,
  `user_invitationcode` char(32) DEFAULT NULL COMMENT '用户邀请码',
  `user_sex` char(2) DEFAULT NULL COMMENT '性别 1男2女',
  `user_age` char(6) DEFAULT NULL COMMENT '年龄',
  `user_email` char(32) DEFAULT NULL COMMENT '邮箱',
  `user_cardpic` varchar(256) DEFAULT NULL COMMENT '身份证照片',
  `user_truename` varchar(16) DEFAULT NULL COMMENT '真实姓名',
  `user_card` char(18) DEFAULT NULL COMMENT '身份证号',
  `user_province` char(10) DEFAULT NULL COMMENT '省份',
  `user_city` varchar(16) DEFAULT NULL COMMENT '城市',
  `user_district` varchar(16) DEFAULT NULL COMMENT '区县',
  `user_note` varchar(125) DEFAULT NULL COMMENT '个性签名',
  `user_position_x` double(16,8) DEFAULT NULL COMMENT '经度',
  `user_position_y` double(16,8) DEFAULT NULL COMMENT '纬度',
  `user_idenstate` char(4) DEFAULT NULL COMMENT '认证状态',
  `user_balance` decimal(10,2) DEFAULT '0.00' COMMENT '余额',
  `user_usestate` char(4) DEFAULT NULL COMMENT '可用状态',
  `user_mark` decimal(10,0) DEFAULT '0' COMMENT '积分',
  `user_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`user_header`,`user_nick`,`user_name`,`user_pwd`,`user_phone`,`user_address`,`user_invitationcode`,`user_sex`,`user_age`,`user_email`,`user_cardpic`,`user_truename`,`user_card`,`user_province`,`user_city`,`user_district`,`user_note`,`user_position_x`,`user_position_y`,`user_idenstate`,`user_balance`,`user_usestate`,`user_mark`,`user_createtime`) values ('a768101a6ecb495cbd8c7b64e6eeb4d7','nurseDoor/NurseImg/UserHeader/d43db03f40c143208a968e3c002296b568431957.jpg','41489','15098013787','49ba59abbe56e057',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0.00',NULL,'0',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
