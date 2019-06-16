package com.bob.entity;

import java.util.Date;
import java.util.List;

/**
 * @author bob
 * @date 2019/6/15 17:03
 */
public class Product {
    private int id;
    private String name;
    private String image;
    private String describe;
    private int priority;
    private String normalPrice;
    private String promotionPrice;
    private Shop shop;
    private ProductCategory productCategory;
    //该商品状态： 0：下架 1：上架
    private int enableStatus;
    private List<ProductImage> imageList;
    private Date createTime;
    private Date lastEditTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public int getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(int enableStatus) {
        this.enableStatus = enableStatus;
    }

    public List<ProductImage> getImageList() {
        return imageList;
    }

    public void setImageList(List<ProductImage> imageList) {
        this.imageList = imageList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", describe='" + describe + '\'' +
                ", priority=" + priority +
                ", normalPrice='" + normalPrice + '\'' +
                ", promotionPrice='" + promotionPrice + '\'' +
                ", shop=" + shop +
                ", productCategory=" + productCategory +
                ", enableStatus=" + enableStatus +
                ", imageList=" + imageList +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }
}
