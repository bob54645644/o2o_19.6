package com.bob.dao;

import com.bob.entity.ShopCategory;

import java.util.List;

public interface ShopCategoryDao {
    int insertShopCategory(ShopCategory shopCategory);

    int deleteShopCategory(int shopCategoryId);

    int batchDeleteShopCategory(List<Integer> shopCategoryIdList);

    int updateShopCategory(ShopCategory shopCategory);

    ShopCategory queryShopCategoryById(int shopCategoryId);

    List<ShopCategory> queryShopCategoryByIds(List<Integer> shopCategoryIdList);
}
