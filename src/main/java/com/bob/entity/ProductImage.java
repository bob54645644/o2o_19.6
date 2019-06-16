package com.bob.entity;

import java.util.Date;

/**
 * @author bob
 * @date 2019/6/15 17:11
 */
public class ProductImage {
    private int id;
    private String image;
    private String describe;
    private int priority;
    private int productId;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", describe='" + describe + '\'' +
                ", priority=" + priority +
                ", productId=" + productId +
                ", createTime=" + createTime +
                '}';
    }
}
