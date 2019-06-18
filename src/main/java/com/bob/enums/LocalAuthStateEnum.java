package com.bob.enums;
/*
* localAuth操作状态
* success 0
* empty -1002
* 账号或密码不正确 loginfail -1
* only_one_accout -2只能绑定一个账号
* */
public enum LocalAuthStateEnum {
    SUCCESS(0, "操作成功"),
    EMPTY(-1002, "注册信息为空"),
    LOGINFAIL(-1, "账号或密码不正确"),
    ONLY_ONE_ACCOUT(-2,"只能绑定一个账号");
    private int state;
    private String info;

    LocalAuthStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }
}
