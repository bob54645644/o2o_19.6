package com.bob.dto;

import com.bob.entity.ShopCategory;
import com.bob.enums.ShopCategoryStateEnum;

import java.util.List;

/**
 * shopCategory
 * shopCategoryList
 * @author bob
 * @date 2019/6/18 0:13
 */
public class ShopCategoryExecution {
    private int state;
    private String info;
    private ShopCategory shopCategory;
    private List<ShopCategory> shopCategoryList;

    public ShopCategoryExecution() {
    }

    public ShopCategoryExecution(ShopCategoryStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
    }

    public ShopCategoryExecution(ShopCategoryStateEnum stateEnum, ShopCategory shopCategory) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.shopCategory = shopCategory;
    }

    public ShopCategoryExecution(ShopCategoryStateEnum stateEnum, List<ShopCategory> shopCategoryList) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.shopCategoryList = shopCategoryList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ShopCategory getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(ShopCategory shopCategory) {
        this.shopCategory = shopCategory;
    }

    public List<ShopCategory> getShopCategoryList() {
        return shopCategoryList;
    }

    public void setShopCategoryList(List<ShopCategory> shopCategoryList) {
        this.shopCategoryList = shopCategoryList;
    }
}
