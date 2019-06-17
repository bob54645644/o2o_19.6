package com.bob.dao;

import com.bob.BaseTest;
import com.bob.entity.Area;
import com.bob.entity.PersonInfo;
import com.bob.entity.Shop;
import com.bob.entity.ShopCategory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @author bob
 * @date 2019/6/16 18:25
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按方法名字典顺序执行
public class ShopDaoTest extends BaseTest {
    @Autowired
    ShopDao shopDao;

    private  static int row;

//    @Test
    public void atestinsert() {
        Shop shop = new Shop();
        shop.setName("shop");
        shop.setImage("iamge");
        shop.setDescribe("describe");
        shop.setAddr("addr");
        shop.setPhone("999");
        shop.setPriority(0);
        shop.setEnableStatus(0);
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());

        Area area = new Area();
        area.setId(1);
        shop.setArea(area);

        ShopCategory shopCategory = new ShopCategory();
        shopCategory.setId(3);
        shop.setShopCategory(shopCategory);

        PersonInfo personInfo = new PersonInfo();
        personInfo.setId(2);
        shop.setOwner(personInfo);

        int ok = shopDao.insertShop(shop);
        row = shop.getId();
        System.out.println("row="+row);
        System.out.println("insert ok="+ok);
    }

//    @Test
    public void btestupdate() {
        Shop shop = new Shop();
        shop.setId(row);
        shop.setName("shop1");
        shop.setImage("iamge1");
        shop.setDescribe("describe1");
        shop.setAddr("addr1");
        shop.setPhone("9991");
        shop.setPriority(1);
        shop.setEnableStatus(1);
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());

        Area area = new Area();
        area.setId(1);
        shop.setArea(area);

        ShopCategory shopCategory = new ShopCategory();
        shopCategory.setId(3);
        shop.setShopCategory(shopCategory);

        PersonInfo personInfo = new PersonInfo();
        personInfo.setId(2);
        shop.setOwner(personInfo);

        int ok = shopDao.updateShop(shop);
        System.out.println("update ok="+ok);
    }

//    @Test
    public void ctestqueryById() {
        Shop shop = shopDao.queryShopById(row);
        System.out.println("querybyId:"+shop);
    }

    @Test
    public void dtestqueryList() {
        Shop shop = new Shop();
        shop.setName("shop");
        shop.setImage("iamge1");
        shop.setDescribe("describe1");
        shop.setAddr("addr1");
        shop.setPhone("9991");
        shop.setPriority(1);
        shop.setEnableStatus(1);
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());

        Area area = new Area();
        area.setId(1);
        shop.setArea(area);

        ShopCategory shopCategory = new ShopCategory();
        shopCategory.setId(2);
        ShopCategory parent = new ShopCategory();
        parent.setId(1);
//        shopCategory.setParent(parent);
        shop.setShopCategory(shopCategory);

        PersonInfo personInfo = new PersonInfo();
        personInfo.setId(2);
        shop.setOwner(personInfo);

        List<Shop> shops = shopDao.queryShopList(shop, 0, 10);
        System.out.println("queryList:"+shops);
    }

    @Test
    public void etestqueryCout() {
        Shop shop = new Shop();
        shop.setName("shop");
        shop.setPriority(1);
        shop.setEnableStatus(1);
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());

        Area area = new Area();
        area.setId(1);
        shop.setArea(area);

        ShopCategory shopCategory = new ShopCategory();
        shopCategory.setId(2);


        PersonInfo personInfo = new PersonInfo();
        personInfo.setId(2);
        shop.setOwner(personInfo);

        ShopCategory parent = new ShopCategory();
        parent.setId(1);
//        shopCategory.setParent(parent);
        shop.setShopCategory(shopCategory);



        int n = shopDao.queryShopCount(shop);
        System.out.println("count:"+n);
    }
}
