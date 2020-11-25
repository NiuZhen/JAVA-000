学习笔记


CREATE TABLE `t_user` (
  `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_code` varchar(50) NOT NULL DEFAULT '' COMMENT '会员号', 
  `user_nick`  varchar(50) NOT NULL DEFAULT '' COMMENT '昵称',
  `gender` tinyint(3) NOT NULL DEFAULT '0' COMMENT '1：男；2：女',
  `user_birthday`  datetime NOT NULL DEFAULT '1900-01-01 00:00:00' COMMENT '生日',
  `user_address`  varchar(50) NOT NULL DEFAULT '' COMMENT '地址',
  `user_phone`  varchar(15) NOT NULL DEFAULT '' COMMENT '电话',
  `user_email`  varchar(50) NOT NULL DEFAULT '' COMMENT '邮箱',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像url',
  `last_login_ip` varchar(50) DEFAULT NULL COMMENT '最后登陆IP',
  `last_login_date` datetime DEFAULT NULL COMMENT '最后登陆时间',
  `salt` varchar(32) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL COMMENT '系统登录密码',
  `user_state` tinyint(3) NOT NULL DEFAULT '0' COMMENT '状态（1正常 2冻结 3禁用 4删除 ）',
  `remark`  varchar(200) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`user_id`),
  KEY `user_code_unique` (`user_code`) USING BTREE
)ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';


CREATE TABLE `goods_categorys` (
 `category_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '商品类别ID',
 `parent_id` int(11) NOT NULL  COMMENT '上级类别ID', 
 `category_name` varchar(50) NOT NULL DEFAULT '' COMMENT '类别名称',
 PRIMARY KEY (`category_id`)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='商品分类';



CREATE TABLE `t_goods` (
  `goods_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `goods_code` varchar(50) NOT NULL DEFAULT '' COMMENT '商品编码', 
  `goods_name` varchar(50) NOT NULL DEFAULT '' COMMENT '商品名称', 
  `goods_info` varchar(200) NOT NULL DEFAULT '' COMMENT '商品简介', 
  `market_price` decimal(10,2) DEFAULT '0.00' COMMENT '市场价格',
  `cost_price` decimal(10,2) DEFAULT '0.00' COMMENT '成本价格',
  `shop_price` decimal(10,2) DEFAULT '0.00' COMMENT '销售价格',
  `unit_name` varchar(50) NOT NULL DEFAULT '' COMMENT '单位',
  `browse` int(11) NULL DEFAULT '0' COMMENT '浏览量',  
  `goods_img` varchar(255) DEFAULT NULL COMMENT '商品url',
  `category_id` tinyint(3) NOT NULL DEFAULT '0' COMMENT '分类id',
  `category_name` varchar(30) NOT NULL DEFAULT '' COMMENT '分类名称', 
  `goods_stock` int(5) unsigned NOT NULL default '0' COMMENT '商品库存',
  `is_show` tinyint(1) NULL DEFAULT '1' COMMENT '状态（0：未上架，1：上架 2:下架）',
  `remark`  varchar(200) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`goods_id`),
  KEY `goods_code_unique` (`goods_code`) USING BTREE
)ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='商品表';


 

CREATE TABLE `n_order` (
  `order_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `order_code` varchar(50) NOT NULL DEFAULT '' COMMENT '订单号',
  `user_id` int(11) NOT NULL DEFAULT '0' COMMENT '下单用户ID',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `goods_amount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '商品总金额', 
  `money_paid` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '已付款金额', 
  `order_amount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '应付款金额', 
  `discount` decimal(10,2) NOT NULL COMMENT '折扣金额', 
  `order_status` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '订单状态（0，未确认；1，已确认；2，已取消；3，无效；4，退货；）',
  `shipping_status` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '商品配送情况，0，未发货；1，已发货；2，已收货；3，备货中', 
  `pay_status` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '支付状态；0，未付款；1，付款中；2，已付款',   
  `pay_id` tinyint(3) NOT NULL DEFAULT '0' COMMENT '用户选择的支付方式的id', 
  `pay_name` varchar(120) NOT NULL COMMENT '用户选择的支付方式的名称', 
  `add_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '订单生成时间', 
  `confirm_time` datetime  default null COMMENT '订单确认时间', 
  `pay_time`  datetime  default null COMMENT '订单支付时间', 
  `shipping_time` datetime  default null COMMENT '订单配送时间', 
  `country` smallint(5) unsigned NOT NULL DEFAULT '0' COMMENT '收货人的国家，用户页面填写，', 
  `province` smallint(5) unsigned NOT NULL DEFAULT '0' COMMENT '收货人的省份，用户页面填写', 
  `city` smallint(5) unsigned NOT NULL DEFAULT '0' COMMENT '收货人的城市，用户页面填写', 
  `district` smallint(5) unsigned NOT NULL DEFAULT '0' COMMENT '收货人的地区，用户页面填写', 
  `address` varchar(255) NOT NULL COMMENT '收货人的详细地址，用户页面填写', 
  PRIMARY KEY (`order_id`),
  KEY `idx_order_code` (`order_code`),
  KEY `idx_order_sdate` (`order_status`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='订单表';




CREATE TABLE `n_order_detail` (
  `order_detail_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '订单详情ID',
  `order_id` int(11) unsigned NOT NULL  COMMENT '订单ID',
  `goods_id` int(11) unsigned NOT NULL  COMMENT '商品ID',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `goods_number`  smallint(5) NOT NULL DEFAULT '0' COMMENT '下单商品数量', 
  `sales_amount` decimal(10,2) NOT NULL COMMENT '售卖价格', 
  `ori_price` decimal(10,2) NOT NULL COMMENT '商品单价', 	
  `snapshot_json` longtext COMMENT '商品快照json字符串（规格、单价、数量、商品简介、合计金额）',
  `valid` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否有效（1:有效 0:无效）(用于逻辑删除标记)',
   PRIMARY KEY (`order_detail_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='订单详情表';
