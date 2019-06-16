package com.bob.entity;

import java.util.Date;

/**
 * @author bob
 * @date 2019/6/15 16:57
 */
public class Shop {
    private int id;
    private String name;
    private String image;
    private String describe;
    private String addr;
    private String phone;
    private Area area;
    private ShopCategory shopCategory;
    private PersonInfo owner;
    private int priority;
    //店铺转态 0：不可用 1：可用 2：待审核
    private int enableStatus;
    private Date createTime;
    private Date lastEditTime;

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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public ShopCategory getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(ShopCategory shopCategory) {
        this.shopCategory = shopCategory;
    }

    public PersonInfo getOwner() {
        return owner;
    }

    public void setOwner(PersonInfo owner) {
        this.owner = owner;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(int enableStatus) {
        this.enableStatus = enableStatus;
    }

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

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", describe='" + describe + '\'' +
                ", addr='" + addr + '\'' +
                ", phone='" + phone + '\'' +
                ", area=" + area +
                ", shopCategory=" + shopCategory +
                ", owner=" + owner +
                ", priority=" + priority +
                ", enableStatus=" + enableStatus +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }
}
