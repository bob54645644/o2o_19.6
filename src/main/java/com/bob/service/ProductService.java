package com.bob.service;

import com.bob.dto.ImageHolder;
import com.bob.dto.ProductExecution;
import com.bob.entity.Product;
import com.bob.exceptions.ProductOperationException;

import java.util.List;

public interface ProductService {
    ProductExecution insertProduct(Product product, ImageHolder imageHolder,
                                   List<ImageHolder> imageHolderList)
            throws ProductOperationException;

    ProductExecution deleteProductById(int productId);

    ProductExecution updateProduct(Product product,ImageHolder imageHolder,
                                   List<ImageHolder> imageHolderList)
        throws ProductOperationException;
    ProductExecution getProductById(int productId);

    ProductExecution listProductByShopId(int shopId);

    ProductExecution listProductByCondition(Product product,int pageIndex,int pageSize);


}
