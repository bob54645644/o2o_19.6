package com.bob.enums;
/*
* Shop操作状态
* success 0
* inner_error -1001
* empty -1002
* 非法 offline -1
* 审核中 check 1
* 通过认证 pass 2
* shopId空 null_shopId -1003
* */
public enum ShopStateEnum {
    SUCCESS(0, "操作成功"),
    INNER_ERROR(-1001, "操作失败"),
    EMPTY(-1002, "店铺信息空"),
    NULL_SHOPID(-1003, "shopId空"),
    OFFLINE(-1, "店铺非法"),
    CHECK(1, "审核中"),
    PASS(2,"通过认证")
    ;
    private int state;
    private String info;

    ShopStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }

    public static ShopStateEnum stateOf(int state) {
        for (ShopStateEnum stateEnum : values()) {
            if(stateEnum.getState() == state)
                return stateEnum;
        }
        return null;
    }
}
