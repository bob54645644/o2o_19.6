package com.bob.enums;

/*
* Area操作状态
* 操作成功 SUCCESS 0
* 操作失败 INNER_ERROR -1001
* Area信息为空 EMPTY -1002
* Area信息非法 OFFLINE -1
* */
public enum AreaStateEnum {
    SUCCESS(0,"操作成功"),
    INNER_ERROR(-1001,"操作失败"),
    EMPTY(-1002,"信息为空"),
    OFFLINE(-1,"区域非法");
    private int state;
    private String info;

    AreaStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }
    public static AreaStateEnum stateOf(int state) {
        for (AreaStateEnum stateEnum:values()) {
            if(stateEnum.getState() == state)
                return stateEnum;
        }
        return null;
    }
}

