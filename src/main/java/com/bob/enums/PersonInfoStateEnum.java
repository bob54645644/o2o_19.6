package com.bob.enums;
/*
* personInfo操作状态
* success 0
* inner_error -1001
* empty -1002
* */
public enum PersonInfoStateEnum {
    SUCCESS(0, "操作成功"),
    INNER_ERROR(-1001, "操作失败"),
    EMPTY(-1002,"用户信息为空");
    private int state;
    private String info;

    PersonInfoStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }

    public static PersonInfoStateEnum stateOf(int state) {
        for (PersonInfoStateEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }
}
