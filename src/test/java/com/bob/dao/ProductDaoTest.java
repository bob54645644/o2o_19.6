package com.bob.dao;

import com.bob.BaseTest;
import com.bob.entity.Product;
import com.bob.entity.ProductCategory;
import com.bob.entity.Shop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author bob
 * @date 2019/6/17 10:55
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按方法名字典顺序执行
public class ProductDaoTest extends BaseTest {
    @Autowired
    ProductDao productDao;

    private static int row;

//    @Test
    public void atestinsert() {
        Product product = new Product();
        product.setName("product");
        product.setImage("iamge");
        product.setDescribe("describe");
        product.setPriority(0);
        product.setNormalPrice("1.0");
        product.setPromotionPrice("2.0");
        product.setEnableStatus(0);
        product.setCreateTime(new Date());
        product.setLastEditTime(new Date());

        Shop shop = new Shop();
        shop.setId(1);
        product.setShop(shop);

        ProductCategory productCategory = new ProductCategory();
        productCategory.setId(2);
        product.setProductCategory(productCategory);

        int ok = productDao.insertProduct(product);
        row = product.getId();
        System.out.println("row="+row);
        System.out.println("insert ok="+ok);
    }

//    @Test
    public void btestupdate() {
        Product product = new Product();
        product.setId(row);
        product.setName("product");
        product.setImage("iamge");
        product.setDescribe("describe");
        product.setPriority(0);
        product.setNormalPrice("1.0");
        product.setPromotionPrice("2.0");
        product.setEnableStatus(0);
        product.setCreateTime(new Date());
        product.setLastEditTime(new Date());

        Shop shop = new Shop();
        shop.setId(1);
        product.setShop(shop);

        ProductCategory productCategory = new ProductCategory();
        productCategory.setId(2);
        product.setProductCategory(productCategory);

        int ok = productDao.updateProduct(product);

        System.out.println("update ok="+ok);
    }

//    @Test
    public void ctestqeruyById() {
        Product product = productDao.queryProductById(row);
        System.out.println("queryById:"+product);
    }

//    @Test
    public void dtesaqueryByshopId() {

        List<Product> products = productDao.queryProductListByShopId(1);
        System.out.println("queryByShopId:"+ products);
    }

//    @Test
    public void etestqeryByProduct() {
        Product product = new Product();
        product.setName("product");
        product.setImage("iamge");
        product.setDescribe("describe");
        product.setPriority(0);
        product.setNormalPrice("1.0");
        product.setPromotionPrice("2.0");
        product.setEnableStatus(0);
        product.setCreateTime(new Date());
        product.setLastEditTime(new Date());

        Shop shop = new Shop();
        shop.setId(1);
        product.setShop(shop);

        ProductCategory productCategory = new ProductCategory();
        productCategory.setId(2);
        product.setProductCategory(productCategory);

        List<Product> products = productDao.queryProductList(product, 0, 10);
        System.out.println("query productlist:"+products);
    }

//    @Test
    public void ftestquerycout() {

        Product product = new Product();
        product.setName("product");
        product.setImage("iamge");
        product.setDescribe("describe");
        product.setPriority(0);
        product.setNormalPrice("1.0");
        product.setPromotionPrice("2.0");
        product.setEnableStatus(0);
        product.setCreateTime(new Date());
        product.setLastEditTime(new Date());

        Shop shop = new Shop();
        shop.setId(1);
        product.setShop(shop);

        ProductCategory productCategory = new ProductCategory();
        productCategory.setId(2);
        product.setProductCategory(productCategory);

        int i = productDao.queryProductCount(product);
        System.out.println("cout="+i);
    }

    @Test
    public void gtestdelete() {

        int ok = productDao.deleteProductById(5);
        System.out.println("delete ok=" +ok);
    }

    @Test
    public void htestbatchdelete() {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);

        int ok = productDao.batchDeleteProductById(list);
        System.out.println("batch delete ok=" + ok);
    }
}
