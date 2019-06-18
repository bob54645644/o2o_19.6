package com.bob.enums;
/*
* product操作状态
* success 0
* inner_error -1001
* empty -1002
* offline -1
* down -2
* */
public enum ProductStateEnum {
    SUCCESS(0, "操作成功"),
    INNER_ERROR(-1001, "操作失败"),
    EMPTY(-1002, "product信息为空"),
    OFFLINE(-1, "非法商品"),
    DOWN(-2,"已下架");
    private int state;
    private String info;

    ProductStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }

    public static ProductStateEnum stateOf(int state) {
        for (ProductStateEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }
}
