package com.bob.enums;

public enum ShopCategoryStateEnum {
    SUCCES(0,"操作成功"),
    INNER_ERROR(-1001, "操作失败"),
    EMPTY(-1002,"信息为空");
    private int state;
    private String info;

    ShopCategoryStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }

    public static ShopCategoryStateEnum stateOf(int state) {
        for (ShopCategoryStateEnum stateEnum : values()) {
            if(stateEnum.getState() == state)
                return stateEnum;
        }
        return null;
    }
}


/*public enum  ShopCategoryStateEnum {;
    SUCCESS(0,"操作成功");

    private int state;
    private String info;

    ShopCategoryStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }
}*/

