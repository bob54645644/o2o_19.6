package com.bob.service;

import com.bob.dto.ProductCategoryExecution;
import com.bob.entity.ProductCategory;
import com.bob.exceptions.ProductCategoryOperationException;

public interface ProductCategoryService {
    ProductCategoryExecution insertProductCategory(ProductCategory productCategory)
        throws ProductCategoryOperationException;
    ProductCategoryExecution deleteProductCategory(int productCategoryId)
        throws ProductCategoryOperationException;

    ProductCategoryExecution listProductCategoryByShopId(int shopId);
}
