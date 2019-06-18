package com.bob.service;

import com.bob.dto.ShopCategoryExecution;
import com.bob.entity.ShopCategory;

/*
* 新增一个 insertShopCategory
* 删除一个 deleteShopCategoryById
* 条件查询 listShopCategoryByCondition
* */
public interface ShopCategoryService {
    ShopCategoryExecution insertShopCategory(ShopCategory shopCategory);

    ShopCategoryExecution deleteShopCategoryById(int shopCategoryId);

    ShopCategoryExecution listShopCategoryByCondition(ShopCategory shopCategory);
}
