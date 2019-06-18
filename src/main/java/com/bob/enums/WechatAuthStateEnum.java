package com.bob.enums;
/*
* wechatAuth操作状态
* success 0
* inner_error -1001
* empty -1002
* null_personId -1003
* */
public enum WechatAuthStateEnum {
    SUCCESS(0, "操作成功"),
    INNER_ERROR(-1001, "操作失败"),
    EMPTY(-1002, "填写信息为空"),
    NULL_PERSONID(-1003,"用户信息为空");
    private int state;
    private String info;

    WechatAuthStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }

    public static WechatAuthStateEnum stateOf(int state) {
        for (WechatAuthStateEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }
}
