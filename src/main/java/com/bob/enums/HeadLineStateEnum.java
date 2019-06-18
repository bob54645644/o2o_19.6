package com.bob.enums;
/*
* HeadLine操作状态
* 成功 success 0
* 失败 inner_error -1001
* 信息空 empty -1002
* */
public enum HeadLineStateEnum {
    SUCCESS(0, "操作成功"),
    INNER_ERROR(-1001, "操作失败"),
    EMPTY(-1002,"信息空");

    private int state;
    private String info;

    HeadLineStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }

    public static HeadLineStateEnum stateOf(int state) {
        for (HeadLineStateEnum stateEnum : values()) {
            if(stateEnum.getState() == state)
                return stateEnum;
        }
        return null;
    }
}
