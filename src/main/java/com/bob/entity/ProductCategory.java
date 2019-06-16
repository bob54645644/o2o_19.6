package com.bob.entity;

import java.util.Date;

/**
 * @author bob
 * @date 2019/6/15 17:06
 */
public class ProductCategory {
    private int id;
    private String name;
    private int shopId;
    private int priority;
    private Date createTime;

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

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shopId=" + shopId +
                ", priority=" + priority +
                ", createTime=" + createTime +
                '}';
    }
}
