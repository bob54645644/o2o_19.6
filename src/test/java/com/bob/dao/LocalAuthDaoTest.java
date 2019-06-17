package com.bob.dao;

import com.bob.BaseTest;
import com.bob.entity.LocalAuth;
import com.bob.entity.PersonInfo;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author bob
 * @date 2019/6/16 11:45
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按方法名字典顺序执行

public class LocalAuthDaoTest extends BaseTest {
    @Autowired
    LocalAuthDao localAuthDao;

    @Test
    public void atestInsert() {
        LocalAuth localAuth = new LocalAuth();
        localAuth.setUsername("bobo");
        localAuth.setPassword("123");
        localAuth.setCreateTime(new Date());
        localAuth.setLastEditTime(new Date());

        PersonInfo personInfo = new PersonInfo();
        personInfo.setId(2);

        localAuth.setPersonInfo(personInfo);

        int ok = localAuthDao.insertLocalAuth(localAuth);
        System.out.println("ok="+ok);
    }

    @Test
    public void btestUpdatae() {
        int ok = localAuthDao.updateLocalAuth(2, "bobo", "123", "1234", new Date());
        System.out.println("update ok=="+ok);
    }

    @Test
    public void ctestqueryBypersonId() {
        LocalAuth localAuth = localAuthDao.queryLocalAuthByPersonId(2);
        System.out.println("query by personId: " + localAuth);
    }

    @Test
    public void dtestqueryBypassword() {
        LocalAuth localAuth = localAuthDao.queryLocalAuthByUsernameAndPassword("bobo", "1234");
        System.out.println("query by password:"+ localAuth);
    }
}
