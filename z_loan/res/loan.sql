drop database if exists loan;
create database loan;
use loan;
set names gbk;

drop table if exists employee;
create table employee(id int primary key auto_increment
,name varchar(20),loginName varchar(20),password varchar(20),groupId int);

insert into employee values(1,'刘备','liubei','liubei',1);
insert into employee values(2,'张飞','zhangfei','zhangfei',2);
insert into employee values(3,'关羽','guanyv','guanyv',2);

drop table if exists loan;
create table loan(id int primary key auto_increment,employeeId int,title varchar(100),amount varchar(100),applyDate varchar(100),status int);

insert into loan values(1,2,'出差借款','1500','2018-08-22 15:12:11',1);
insert into loan values(2,2,'婚宴借款','3000','2018-02-13 08:23:16',2);
insert into loan values(3,3,'房贷借款','10000','2018-07-28 12:22:11',0);
insert into loan values(4,1,'招待客户借款','2000','2018-12-01 11:30:00',0);