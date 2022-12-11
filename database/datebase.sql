-- 创建数据库
create database ssmdb;
use ssmdb;
-- 用户表
CREATE TABLE sys_user ( user_id INT PRIMARY KEY auto_increment, username VARCHAR ( 20 ) NOT NULL UNIQUE, `password` VARCHAR ( 10 ) NOT NULL );-- 客户表
CREATE TABLE sys_customer (
	customer_id INT PRIMARY KEY auto_increment,
	customer_name VARCHAR ( 20 ) NOT NULL,
	phone VARCHAR ( 11 ) NOT NULL UNIQUE,
	email VARCHAR ( 20 ) NOT NULL UNIQUE,
	address VARCHAR ( 50 ) NOT NULL,
	company VARCHAR ( 50 ) NOT NULL 
);-- 订单表
CREATE TABLE sys_order (
	order_id INT PRIMARY KEY auto_increment,
	sequence VARCHAR ( 20 ) NOT NULL UNIQUE,
	price INT NOT NULL,
	c_id INT,
	u_id INT,
	`status` TINYINT NOT NULL,
	CONSTRAINT fk_order_customer FOREIGN KEY ( c_id ) REFERENCES sys_customer ( customer_id ),
	CONSTRAINT fk_order_user FOREIGN KEY ( u_id ) REFERENCES sys_user ( user_id ) 
);
SHOW TABLES;
INSERT INTO sys_user
VALUES
	( NULL, 'aaa', '1234' ),
	( NULL, 'daoblunt', '1234' );
INSERT INTO sys_customer
VALUES
	( NULL, '张三', '13177883344', 'zhangsan@163.com', '辽宁沈阳', '沈阳某某公司' ),
	( NULL, '李四', '15677882233', 'lisi@163.com', '山东青岛', '青岛某某公司' ),
	( NULL, '王五', '18744663535', 'wangwu@163.com', '上海', '上海某某公司' ),
	( NULL, '赵六', '18835354455', 'zhaoliu@163.com', '广州', '广州某某公司' ),
	( NULL, '田七', '18135352255', 'tianqi@163.com', '香港', '香港某某公司' ),
	( NULL, 'tom', '35352255', 'tom@gmail.com', '美国', '美国某某公司' ),
	( NULL, 'lucy', '9994543', 'lucy@gmail.com', '英国', '英国某某公司' );
INSERT INTO sys_order
VALUES
	( NULL, 'sequence0001', 4676, 1, 1, 0 ),
	( NULL, 'sequence0002', 3321, 2, 1, 0 ),
	( NULL, 'sequence0003', 9986, 3, 1, 0 ),
	( NULL, 'sequence0004', 2455, 4, 1, 0 ),
	( NULL, 'sequence0005', 6546, 5, 1, 0 ),
	( NULL, 'sequence0006', 4324, 6, 2, 0 ),
	( NULL, 'sequence0007', 8990, 7, 2, 0 );