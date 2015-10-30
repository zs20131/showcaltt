CREATE TABLE `MD_ITEM` (
    `ID` BIGINT(20)  NOT NULL  COMMENT '主键',
    `CLASS_ID` BIGINT(20)  DEFAULT NULL  COMMENT '类目ID',
    `NUMBER` VARCHAR(50)  DEFAULT NULL  COMMENT '货号（料号）',
    `BARCODE` VARCHAR(50)  DEFAULT NULL  COMMENT '条形码',
    `NAME` VARCHAR(500)  DEFAULT NULL  COMMENT '名称',
    `PINYIN` VARCHAR(500)  DEFAULT NULL  COMMENT '拼音',
    `PY` VARCHAR(50)  DEFAULT NULL  COMMENT '拼音缩写',
    `TYPE` VARCHAR(50)  DEFAULT NULL  COMMENT '类型',
    `BASIS` VARCHAR(50)  DEFAULT NULL  COMMENT '基准类型',
    `QUICK_CODE` VARCHAR(50)  DEFAULT NULL  COMMENT '助记码',
    `SHORT_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '简称',
    `ORDER_SORT` BIGINT(20)  DEFAULT NULL  COMMENT '排序',
    `URL` VARCHAR(100)  DEFAULT NULL  COMMENT '链接',
    `INVOICED_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '开票名称',
    `DESCRIPTION` VARCHAR(4000)  DEFAULT NULL  COMMENT '料号描述',
    `BRAND_ID` VARCHAR(200)  DEFAULT NULL  COMMENT '品牌ID',
    `CATEGORY_ID` BIGINT(20)  DEFAULT NULL  COMMENT '类别ID',
    `UOM` VARCHAR(50)  DEFAULT NULL  COMMENT '单位',
    `SPEC_CODE` VARCHAR(50)  DEFAULT NULL  COMMENT '规格代码',
    `SPEC_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '规格名称',
    `IS_ACTIVE` TINYINT(1)  DEFAULT NULL  COMMENT '是否有效',
    `IS_ALL_OU_OPENED` TINYINT(1)  DEFAULT NULL  COMMENT '是否向所有OU开放',
     `IS_FEE_FREE` TINYINT(1)  DEFAULT NULL  COMMENT '是否包邮',
    `IS_BY_OU_CONTROL` TINYINT(1)  DEFAULT NULL  COMMENT '是否按OU控制',
    `KEYWORDS` VARCHAR(500)  DEFAULT NULL  COMMENT '关键字',
    `COMMODITY_ID` BIGINT(20)  DEFAULT NULL  COMMENT '商品ID',
    `PICTURE_ID` BIGINT(20)  DEFAULT NULL  COMMENT '图片ID',
    `VALIDITY_TERM` DECIMAL(19,5)  DEFAULT NULL  COMMENT '有效期',
    `SPEC1_ATTRIBUTE_ID` BIGINT(20)  DEFAULT NULL  COMMENT '规格1属性Id',
    `SPEC1_ATTRIBUTE_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '规格1属性名称',
    `SPEC1_VALUE_ID` BIGINT(20)  DEFAULT NULL  COMMENT '规格1 ID',
    `SPEC1_VALUE_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '规格1',
    `SPEC2_ATTRIBUTE_ID` BIGINT(20)  DEFAULT NULL  COMMENT '规格2属性Id',
    `SPEC2_ATTRIBUTE_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '规格2属性名称',
    `SPEC2_VALUE_ID` BIGINT(20)  DEFAULT NULL  COMMENT '规格2 ID',
    `SPEC2_VALUE_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '规格2',
    `SPEC3_ATTRIBUTE_ID` BIGINT(20)  DEFAULT NULL  COMMENT '规格3属性Id',
    `SPEC3_ATTRIBUTE_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '规格3属性名称',
    `SPEC3_VALUE_ID` BIGINT(20)  DEFAULT NULL  COMMENT '规格3 ID',
    `SPEC3_VALUE_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '规格3',
    `WEIGHT` DECIMAL(19,5)  DEFAULT NULL  COMMENT '重量',
    `VOLUME` DECIMAL(19,5)  DEFAULT NULL  COMMENT '体积',
    `COUNT_READ` INTEGER(20)  DEFAULT NULL  COMMENT '总阅读数',
    `COUNT_CONNECTION` INTEGER(20)  DEFAULT NULL  COMMENT '总收藏数',
    `IS_SUBMIT` TINYINT(1)  DEFAULT NULL  COMMENT '是否已提交',
    `SUBMIT_USER_ID` BIGINT(20)  DEFAULT NULL  COMMENT '提交用户ID',
    `SUBMIT_USER_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '提交用户姓名',
    `SUBMIT_TIME` DATETIME  DEFAULT NULL  COMMENT '提交时间',
    `IS_APPROVED` TINYINT(1)  DEFAULT NULL  COMMENT '是否已审批',
    `APPROVE_USER_ID` BIGINT(20)  DEFAULT NULL  COMMENT '审批用户ID',
    `APPROVE_USER_NAME` VARCHAR(50)  DEFAULT NULL  COMMENT '审批用户姓名',
    `APPROVE_TIME` DATETIME  DEFAULT NULL  COMMENT '审批时间',
    `APPROVE_RESULT` VARCHAR(50)  DEFAULT NULL  COMMENT '审批结果',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物料表';