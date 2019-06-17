package com.bob.dao;

import com.bob.BaseTest;
import com.bob.entity.ProductCategory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @author bob
 * @date 2019/6/16 22:55
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按方法名字典顺序执行
public class ProductCategoryDaoTest extends BaseTest {
    @Autowired
    ProductCategoryDao productCategoryDao;

    private static int row;
    @Test
    public void atetinert() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setName("productCategory");
        productCategory.setShopId(1);
        productCategory.setPriority(0);
        productCategory.setCreateTime(new Date());

        int ok = productCategoryDao.insertProductCategory(productCategory);
        row = productCategory.getId();
        System.out.println("insert ok"+ok);
    }

    @Test
    public void btestquery() {
        List<ProductCategory> productCategories = productCategoryDao.queryProductCategoryListByShopId(1);
        System.out.println("query list:"+productCategories);
    }

//    @Test
    public void ctestdelete() {
        int ok = productCategoryDao.deleteProductCategoryById(row);
        System.out.println("delete ok="+ok);
    }
}
