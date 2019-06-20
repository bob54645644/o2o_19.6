package com.bob.dto;

import com.bob.entity.WechatAuth;
import com.bob.enums.WechatAuthStateEnum;

/**
 * wechatAuth
 * @author bob
 * @date 2019/6/18 0:28
 */
public class WechatAuthExecution {
    private int state;
    private String info;
    private WechatAuth wechatAuth;

    public WechatAuthExecution() {
    }

    public WechatAuthExecution(WechatAuthStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
    }

    public WechatAuthExecution(WechatAuthStateEnum stateEnum, WechatAuth wechatAuth) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.wechatAuth = wechatAuth;
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

    public WechatAuth getWechatAuth() {
        return wechatAuth;
    }

    public void setWechatAuth(WechatAuth wechatAuth) {
        this.wechatAuth = wechatAuth;
    }
}
