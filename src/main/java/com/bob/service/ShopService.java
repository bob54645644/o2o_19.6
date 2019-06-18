package com.bob.service;

import com.bob.dto.ShopExecution;
import com.bob.entity.Shop;

/*
* 新增一个 insertShop
* 更新一个 updateShop
* 查询一个 getShopById
* 条件查询 listShopByCondition
* 条件查询计数 countShopByCondition
* */
public interface ShopService {
    ShopExecution insertShop(Shop shop);
    ShopExecution updateShop(Shop shop)
}
