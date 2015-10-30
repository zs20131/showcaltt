CREATE TABLE `TC_FOOD_EXCHANGE` (
    `ID` BIGINT(20)  NOT NULL  COMMENT '主键',
    `MEALS_ID` BIGINT(20)  DEFAULT NULL  COMMENT '餐次ID',
    `BASE_HEAT` DECIMAL(19,5)  DEFAULT NULL  COMMENT '基础热量值',
    `TOTAL_EXCHANGE` DECIMAL(19,5)  DEFAULT NULL  COMMENT '总交换份',
    `VEGETABLE` DECIMAL(19,5)  DEFAULT NULL  COMMENT '蔬果类',
    `MEAT_EGG` DECIMAL(19,5)  DEFAULT NULL  COMMENT '肉蛋奶类',
    `STAPLE_FOOD` DECIMAL(19,5)  DEFAULT NULL  COMMENT '主食类',
    `GREASE` DECIMAL(19,5)  DEFAULT NULL  COMMENT '油脂类',
    `IS_ACTIVE` TINYINT(1)  DEFAULT NULL  COMMENT '是否有效',
    `ACTIVE_DATE` DATE  DEFAULT NULL  COMMENT '生效日期',
    `ATTRIBUTE1` VARCHAR(500)  DEFAULT NULL  COMMENT '扩展栏位1',
    `ATTRIBUTE2` VARCHAR(500)  DEFAULT NULL  COMMENT '扩展栏位2',
    `ATTRIBUTE3` VARCHAR(500)  DEFAULT NULL  COMMENT '扩展栏位3',
    `ATTRIBUTE4` VARCHAR(500)  DEFAULT NULL  COMMENT '扩展栏位4',
    `ATTRIBUTE5` VARCHAR(500)  DEFAULT NULL  COMMENT '扩展栏位5',
    `ATTRIBUTE6` VARCHAR(500)  DEFAULT NULL  COMMENT '扩展栏位6',
    `ATTRIBUTE7` VARCHAR(500)  DEFAULT NULL  COMMENT '扩展栏位7',
    `ATTRIBUTE8` VARCHAR(500)  DEFAULT NULL  COMMENT '扩展栏位8',
    `ATTRIBUTE9` VARCHAR(500)  DEFAULT NULL  COMMENT '扩展栏位9',
    `ATTRIBUTE10` VARCHAR(500)  DEFAULT NULL  COMMENT '扩展栏位10',
    `ROW_VERSION` BIGINT(20)  DEFAULT NULL  COMMENT '行版本',
    `IS_DELETED` TINYINT(1)  DEFAULT NULL  COMMENT '是否已删除',
    `CREATED_BY` BIGINT(20)  NOT NULL  COMMENT '创建用户',
    `CREATION_TIME` DATETIME  NOT NULL  COMMENT '创建时间',
    `LAST_UPDATED_BY` BIGINT(20)  DEFAULT NULL  COMMENT '最后更新用户',
    `LAST_UPDATE_TIME` DATETIME  DEFAULT NULL  COMMENT '最后更新时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='食物交换份';