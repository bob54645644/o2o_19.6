package com.bob.dao;

import com.bob.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryDao {
    int insertProductCategory(ProductCategory productCategory);

    int deleteProductCategoryById(int productCategoryId);

//    int batchDeleteProductCategoryByIds(List<Integer> productCategoryIdList);

    List<ProductCategory> queryProductCategoryListByShopId(int shopId);
}
