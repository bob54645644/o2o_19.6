package com.bob.dao;

import com.bob.BaseTest;
import com.bob.entity.PersonInfo;
import com.bob.entity.WechatAuth;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author bob
 * @date 2019/6/16 8:25
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按方法名字典顺序执行
public class WechatAuthDaoTest extends BaseTest {
    @Autowired
    private WechatAuthDao wechatAuthDao;

//    @Test
    public void ainset() {
        WechatAuth wechatAuth = new WechatAuth();
        wechatAuth.setOpenId("openId");
        wechatAuth.setCreateTime(new Date());

        PersonInfo personInfo = new PersonInfo();
        personInfo.setId(2);

        wechatAuth.setPersonInfo(personInfo);

        int ok = wechatAuthDao.insertWechatAuth(wechatAuth);
        System.out.println("ok=" + ok);
    }

    @Test
    public void btestquery() {
        WechatAuth we = wechatAuthDao.queryWechatAuthByOpenId("openId");
        System.out.println(we);

    }
}
