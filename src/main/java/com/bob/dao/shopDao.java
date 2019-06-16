package com.bob.dao;

import com.bob.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface shopDao {
    int insertShop(Shop shop);

    //不删除，商店置为不可用即可

    int updateShop(Shop shop);

    Shop queryShopById(int shopId);

    //条件查询店铺
    List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition,
                             @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    //条件查询总数
    int queryShopCount(@Param("shopCondition") Shop shopCondition);

}
