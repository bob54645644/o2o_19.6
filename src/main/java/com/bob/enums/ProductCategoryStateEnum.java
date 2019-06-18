package com.bob.enums;
/*
* productcategory操作状态
* success 0
* inner_error -1001
* empty -1002
* */
public enum ProductCategoryStateEnum {
    SUCCESS(0, "操作成功"),
    INNER_ERROR(-1001, "操作失败"),
    EMPTY(-1002,"产品类别信息为空");
    private int state;
    private String info;

    ProductCategoryStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }

    public static ProductCategoryStateEnum stateOf(int state) {
        for (ProductCategoryStateEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }
}
