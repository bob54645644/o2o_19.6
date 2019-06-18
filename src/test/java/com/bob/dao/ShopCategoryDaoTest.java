package com.bob.dao;

import com.bob.BaseTest;
import com.bob.entity.ShopCategory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author bob
 * @date 2019/6/16 14:24
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按方法名字典顺序执行
public class ShopCategoryDaoTest extends BaseTest {

    @Autowired
    ShopCategoryDao shopCategoryDao;
    private static int row;

//    @Test
    public void atestinsert() {
        ShopCategory shopCategory = new ShopCategory();
        shopCategory.setName("饮料");
        shopCategory.setImage("image");
        shopCategory.setDescribe("好喝的，解渴的");
        shopCategory.setPriority(0);
        shopCategory.setCreateTime(new Date());
        shopCategory.setLastEditTime(new Date());

        ShopCategory shopCategory1 = new ShopCategory();
        shopCategory1.setId(1);
        shopCategory.setParent(shopCategory1);

        int ok = shopCategoryDao.insertShopCategory(shopCategory);
        row = shopCategory.getId();
        System.out.println("row = "+row);
        System.out.println("insert ok=" + ok);
    }

//    @Test
    public void btestupdate() {

        ShopCategory shopCategory = new ShopCategory();
        shopCategory.setId(row);
        shopCategory.setName("饮料1");
        shopCategory.setImage("image1");
        shopCategory.setDescribe("好喝的，解渴的1");
        shopCategory.setPriority(1);
        shopCategory.setCreateTime(new Date());
        shopCategory.setLastEditTime(new Date());

        int ok = shopCategoryDao.updateShopCategory(shopCategory);
        System.out.println("update ok=" + ok);
    }

//    @Test
    public void cquerybyId() {
        System.out.println(row);
        ShopCategory shopCategory = shopCategoryDao.queryShopCategoryById(row);
        System.out.println("querybyId:" + shopCategory);
    }

//    @Test
    public void dqueryByIds() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(row);

        List<ShopCategory> shopCategories = shopCategoryDao.queryShopCategoryByIds(integerList);
        System.out.println("querybyIds size="+shopCategories.size());
    }

//    @Test
    public void edelete() {
        int ok = shopCategoryDao.deleteShopCategory(row);
        System.out.println("delete ok=" +ok);
    }

    @Test
    public void ftestcondition() {
        ShopCategory shopCategory = new ShopCategory();
        shopCategory.setId(1);
        ShopCategory shopCategory1 = new ShopCategory();
        List<ShopCategory> shopCategories = shopCategoryDao.queryShopCategoryByCondition(shopCategory);
        System.out.println(shopCategories);
    }
}
