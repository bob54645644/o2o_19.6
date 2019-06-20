package com.bob.dto;

import com.bob.entity.LocalAuth;
import com.bob.enums.LocalAuthStateEnum;

/**
 * localAuth
 * @author bob
 * @date 2019/6/18 0:31
 */
public class LocalAuthExecution {
    private int state;
    private String info;
    private LocalAuth localAuth;

    public LocalAuthExecution() {
    }

    public LocalAuthExecution(LocalAuthStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
    }

    public LocalAuthExecution(LocalAuthStateEnum stateEnum, LocalAuth localAuth) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.localAuth = localAuth;
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

    public LocalAuth getLocalAuth() {
        return localAuth;
    }

    public void setLocalAuth(LocalAuth localAuth) {
        this.localAuth = localAuth;
    }
}
