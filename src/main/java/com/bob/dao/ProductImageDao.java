package com.bob.dao;

import com.bob.entity.ProductImage;

import java.util.List;

public interface ProductImageDao {
    int batchInsertProductImage(List<ProductImage> productImageList);

    int batchDeleteProductImage(int productId);

    List<ProductImage> queryProductImageByProductId(int productId);

}
