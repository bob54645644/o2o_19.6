package com.bob.entity;

import java.util.Date;

/**
 * @author bob
 * @date 2019/6/15 16:49
 */
public class HeadLine {
    private int id;
    private String name;
    private String image;
    private String link;
    private int priority;
    //头条状态 0：不可用 1：可用
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
        return "HeadLine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", link='" + link + '\'' +
                ", priority=" + priority +
                ", enableStatus=" + enableStatus +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }
}
