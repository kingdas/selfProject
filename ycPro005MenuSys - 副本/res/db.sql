DROP database IF EXISTS menuSys; 
create database menuSys;
use menuSys;
set names gbk;

DROP TABLE IF EXISTS t_menu;
#菜单
CREATE TABLE t_menu (
  id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '菜的编号',#xxx
  name varchar(20) DEFAULT NULL COMMENT '菜的名字',
  pic varchar(100) COMMENT '菜的照片',#只存照片的相对地址
  price float DEFAULT NULL COMMENT '菜的价格',
  remark varchar(100) DEFAULT NULL COMMENT '备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into t_menu(name,price)values('小炒肉',18),('花生米',5),('红炒肉',22),('黄瓜',5),('烂糊白菜',14);

DROP TABLE IF EXISTS t_order;
#订单
CREATE TABLE t_order (
  id int(11) PRIMARY KEY  NOT NULL AUTO_INCREMENT COMMENT '订单的编号',
  tableNum varchar(10) DEFAULT NULL COMMENT '桌号',
  createTime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '下单时间',
  personCount int(11) DEFAULT 0  COMMENT '用餐人数',
  totalPrice double DEFAULT 0 COMMENT '应收价格',
  realPrice double DEFAULT 0 COMMENT '实收价格',
  isPayment bit(1) DEFAULT 0 comment '是否结账，0是未买单，1是已买单',
  paymentTime datetime comment '结账时间',
  remark varchar(100) DEFAULT NULL COMMENT '备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
#deleteed
DROP TABLE IF EXISTS t_orderItem;
#订单项
CREATE TABLE t_orderItem (
  id int(11)  PRIMARY KEY  NOT NULL AUTO_INCREMENT COMMENT '编号',
  orderId int(11) DEFAULT NULL COMMENT '订单号',
  menuId int(11) DEFAULT NULL COMMENT '菜单号',
  num int(11) DEFAULT 1 COMMENT '份数',
  CONSTRAINT t_orderitem_ibfk_1 FOREIGN KEY (orderId) REFERENCES t_order (id),
  CONSTRAINT t_orderitem_ibfk_2 FOREIGN KEY (menuId) REFERENCES t_menu (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from t_menu;
select * from t_order;
select * from t_orderitem;




