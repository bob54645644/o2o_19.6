package com.bob.dao;

import com.bob.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    int insertProduct(Product product);

    int deleteProductById(int productId);

    int batchDeleteProductById(List<Integer> productIdList);

    int updateProduct(Product product);

    Product queryProductById(int productId);

    List<Product> queryProductListByShopId(int shopId);

    //条件查询,分页
    List<Product> queryProductList(@Param("productCondition") Product productCondition,
                                   @Param("rowIndex")int rowIndex,@Param("pageSize")int pageSize);
    //条件查询总数
    int queryProductCount(@Param("productCondition") Product productCondition);

    //删除商品类别时，将其下商品的商品类别Id置空
    int updateProductCategoryIdToNull(int productCategoryId);
}
