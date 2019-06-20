package com.bob.dto;

import com.bob.entity.ProductCategory;
import com.bob.enums.ProductCategoryStateEnum;

import java.util.List;

/**productCategoryList
 * @author bob
 * @date 2019/6/18 0:19
 */
public class ProductCategoryExecution {
    private int state;
    private String info;
    private List<ProductCategory> productCategoryList;

    public ProductCategoryExecution() {
    }

    public ProductCategoryExecution(ProductCategoryStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.info  = stateEnum.getInfo();
    }

    public ProductCategoryExecution(ProductCategoryStateEnum stateEnum, List<ProductCategory> productCategoryList) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.productCategoryList = productCategoryList;
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

    public List<ProductCategory> getProductCategoryList() {
        return productCategoryList;
    }

    public void setProductCategoryList(List<ProductCategory> productCategoryList) {
        this.productCategoryList = productCategoryList;
    }
}
