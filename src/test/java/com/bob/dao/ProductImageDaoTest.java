package com.bob.dao;

import com.bob.BaseTest;
import com.bob.entity.ProductImage;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author bob
 * @date 2019/6/17 11:34
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按方法名字典顺序执行
public class ProductImageDaoTest extends BaseTest {

    @Autowired
    ProductImageDao productImageDao;

    @Test
    public void atestinsert() {
        List<ProductImage> list = new ArrayList<>();

        ProductImage productImage = new ProductImage();
        productImage.setImage("image");
        productImage.setDescribe("describe");
        productImage.setPriority(0);
        productImage.setProductId(1);
        productImage.setCreateTime(new Date());

        ProductImage productImage1 = new ProductImage();
        productImage1.setImage("image1");
        productImage1.setDescribe("describe1");
        productImage1.setPriority(0);
        productImage1.setProductId(1);
        productImage1.setCreateTime(new Date());

        list.add(productImage);
        list.add(productImage1);

        int ok = productImageDao.batchInsertProductImage(list);

        System.out.println("insert ok="+ok);
    }

    @Test
    public void btestquery() {
        List<ProductImage> list = productImageDao.queryProductImageByProductId(1);
        System.out.println("query list:"+list);
    }

//    @Test
    public void ctestdelete() {

        int ok = productImageDao.batchDeleteProductImage(1);
        System.out.println("delete ok="+ok);
    }
}
