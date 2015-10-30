/**
 * @(#)FoodPO.java  
 *
 * Copyright (c) 2014-2014  苏州犀牛网络科技有限公司 版权所有
 * xiniunet. All rights reserved.
 *
 * This software is the confidential and proprietary
 * information of  xiniunet.
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement
 * you entered into with xiniunet.
 */
package com.showcal.thermalcontrol.po;

import com.showcal.framework.sql.ColumnAlias;
import com.showcal.framework.sql.ColumnIgnore;
import com.xiniunet.framework.base.BasePO;

import java.util.Date;

/**
 * Created by 顾志雄 on 2015-09-15 13:46:57.
 *
 * @author 顾志雄
 */
public class FoodPO extends BasePO {


    /**
     * 主键,
     */
    private Long id;

    /**
     * 食物名称,
     */
    private String name;

    /**
     * 食物重量,
     */
    private Double weight;

    /**
     * 食物热量,
     */
    private Double heat;

    /**
     * 单位热量,
     */
    private Double unitheat;

    /**
     * 蛋白质(克),单位(克)
     */
    private Double protein;

    /**
     * 脂肪（克）,
     */
    private Double fat;

    /**
     * 碳水化合物（克）,
     */
    private Double carbohydrate;

    /**
     * 膳食纤维（克）,
     */
    private Double df;

    /**
     * 条形码,
     */
    @ColumnAlias("BAR_CODE")
    private String barCode;

    /**
     * 品牌,
     */
    private String brand;

    /**
     * 食物交换份克数(克),
     */
    @ColumnAlias("FOOD_EXCHANGE")
    private Double foodExchange;

    /**
     * 单位食用克数(克),
     */
    @ColumnAlias("EDUBLE_UNIT")
    private Double edubleUnit;

    /**
     * 食物单位,
     */
    private String unit;

    /**
     * 每单位重量,
     */
    @ColumnAlias("UNIT_WEIGHT")
    private Double unitWeight;

    /**
     * 食物大类,
     */
    @ColumnAlias("FOOD_LARGE_CATEGORY")
    private Long foodLargeCategory;

    /**
     * 食物分类,
     */
    @ColumnAlias("FOOD_CATEGORY_ID")
    private Long foodCategoryId;

    /**
     * 减肥是否推荐,
     */
    @ColumnAlias("IS_LOSE")
    private Integer isLose;

    /**
     * 增肌是否推荐,
     */
    @ColumnAlias("IS_ADD_MUSCLE")
    private Integer isAddMuscle;

    /**
     * 是否常见,
     */
    @ColumnAlias("IS_COMMON")
    private Integer isCommon;
    /**
     * 来源ID,
     */
//    @ColumnAlias("SOURCE_ID")
    @ColumnIgnore
    private Long sourceId;
    /**
     * 菜谱ID,
     */
    @ColumnAlias("MENU_ID")
    private Long menuId;

    /**
     * 菜谱类别,
     */
    @ColumnAlias("MENU_CATEGORY")
    private Integer menuCategory;

    /**
     * 图片链接地址,
     */
    @ColumnAlias("PICTURE_URL")
    private String pictureUrl;

    /**
     * 是否有效,
     */
    @ColumnAlias("IS_ACTIVE")
    private Boolean isActive;

    /**
     * 生效日期,
     */
    @ColumnIgnore
    private Date activeDate;

    /**
     * 生效人,
     */
    @ColumnAlias("ACTIVE_USER")
    private String activeUser;

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeat() {
        return this.heat;
    }

    public void setHeat(Double heat) {
        this.heat = heat;
    }

    public Double getUnitheat() {
        return this.unitheat;
    }

    public void setUnitheat(Double unitheat) {
        this.unitheat = unitheat;
    }

    public Double getProtein() {
        return this.protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getFat() {
        return this.fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getCarbohydrate() {
        return this.carbohydrate;
    }

    public void setCarbohydrate(Double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public Double getDf() {
        return this.df;
    }

    public void setDf(Double df) {
        this.df = df;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getFoodExchange() {
        return this.foodExchange;
    }

    public void setFoodExchange(Double foodExchange) {
        this.foodExchange = foodExchange;
    }

    public Double getEdubleUnit() {
        return this.edubleUnit;
    }

    public void setEdubleUnit(Double edubleUnit) {
        this.edubleUnit = edubleUnit;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getUnitWeight() {
        return this.unitWeight;
    }

    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public Long getFoodLargeCategory() {
        return this.foodLargeCategory;
    }

    public void setFoodLargeCategory(Long foodLargeCategory) {
        this.foodLargeCategory = foodLargeCategory;
    }

    public Long getFoodCategoryId() {
        return this.foodCategoryId;
    }

    public void setFoodCategoryId(Long foodCategoryId) {
        this.foodCategoryId = foodCategoryId;
    }

    public Integer getIsLose() {
        return isLose;
    }

    public Integer getIsAddMuscle() {
        return isAddMuscle;
    }

    public Integer getIsCommon() {
        return isCommon;
    }

    public Long getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Long getMenuId() {
        return this.menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuCategory() {
        return this.menuCategory;
    }

    public void setMenuCategory(Integer menuCategory) {
        this.menuCategory = menuCategory;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Date getActiveDate() {
        return this.activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public String getActiveUser() {
        return this.activeUser;
    }

    public void setActiveUser(String activeUser) {
        this.activeUser = activeUser;
    }

    public void setIsLose(Integer isLose) {
        this.isLose = isLose;
    }

    public void setIsAddMuscle(Integer isAddMuscle) {
        this.isAddMuscle = isAddMuscle;
    }

    public void setIsCommon(Integer isCommon) {
        this.isCommon = isCommon;
    }
}