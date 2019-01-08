DROP database IF EXISTS menuSys; 
create database menuSys;
use menuSys;
set names gbk;

DROP TABLE IF EXISTS t_menu;
#�˵�
CREATE TABLE t_menu (
  id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '�˵ı��',#xxx
  name varchar(20) DEFAULT NULL COMMENT '�˵�����',
  pic varchar(100) COMMENT '�˵���Ƭ',#ֻ����Ƭ����Ե�ַ
  price float DEFAULT NULL COMMENT '�˵ļ۸�',
  remark varchar(100) DEFAULT NULL COMMENT '��ע'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into t_menu(name,price)values('С����',18),('������',5),('�쳴��',22),('�ƹ�',5),('�ú��ײ�',14);

DROP TABLE IF EXISTS t_order;
#����
CREATE TABLE t_order (
  id int(11) PRIMARY KEY  NOT NULL AUTO_INCREMENT COMMENT '�����ı��',
  tableNum varchar(10) DEFAULT NULL COMMENT '����',
  createTime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '�µ�ʱ��',
  personCount int(11) DEFAULT 0  COMMENT '�ò�����',
  totalPrice double DEFAULT 0 COMMENT 'Ӧ�ռ۸�',
  realPrice double DEFAULT 0 COMMENT 'ʵ�ռ۸�',
  isPayment bit(1) DEFAULT 0 comment '�Ƿ���ˣ�0��δ�򵥣�1������',
  paymentTime datetime comment '����ʱ��',
  remark varchar(100) DEFAULT NULL COMMENT '��ע'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
#deleteed
DROP TABLE IF EXISTS t_orderItem;
#������
CREATE TABLE t_orderItem (
  id int(11)  PRIMARY KEY  NOT NULL AUTO_INCREMENT COMMENT '���',
  orderId int(11) DEFAULT NULL COMMENT '������',
  menuId int(11) DEFAULT NULL COMMENT '�˵���',
  num int(11) DEFAULT 1 COMMENT '����',
  CONSTRAINT t_orderitem_ibfk_1 FOREIGN KEY (orderId) REFERENCES t_order (id),
  CONSTRAINT t_orderitem_ibfk_2 FOREIGN KEY (menuId) REFERENCES t_menu (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from t_menu;
select * from t_order;
select * from t_orderitem;




