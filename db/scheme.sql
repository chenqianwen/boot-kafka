/** 创建数据库 */
DROP DATABASE if EXISTS `my-test`;
CREATE DATABASE `my-test` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `my-test`;
/** 创建表 */
DROP TABLE if EXISTS `test_user`;
CREATE TABLE `test_user`(
  `id` varchar(64)  NOT NULL COMMENT '主键',
  `name` varchar(64)  NOT NULL COMMENT '姓名',
  PRIMARY KEY (`id`) USING BTREE
)COMMENT='测试用户' ENGINE = Innodb  CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

insert into `test_user` values ('11','张三');
insert into `test_user` values ('22','李四');