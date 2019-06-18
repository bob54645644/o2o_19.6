package com.bob.dto;

import com.bob.entity.Shop;
import com.bob.enums.ShopStateEnum;

import java.util.List;

/**shop
 * count
 * shopList
 * @author bob
 * @date 2019/6/18 0:16
 */
public class ShopExecution {
    private int state;
    private String info;
    private Shop shop;
    private List<Shop> shopList;
    private int count;

    public ShopExecution() {
    }

    public ShopExecution(ShopStateEnum stateEnum, Shop shop) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.shop = shop;
    }

    public ShopExecution(ShopStateEnum stateEnum, List<Shop> shopList, int count) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.shopList = shopList;
        this.count = count;
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

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
