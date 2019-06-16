package com.bob.entity;

import java.util.Date;

/**
 * @author bob
 * @date 2019/6/15 16:42
 */
public class WechatAuth {
    private int id;
    private String openId;
    private PersonInfo personInfo;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "WechatAuth{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", personInfo=" + personInfo +
                ", createTime=" + createTime +
                '}';
    }
}
