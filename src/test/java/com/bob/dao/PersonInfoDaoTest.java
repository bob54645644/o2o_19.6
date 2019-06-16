package com.bob.dao;

import com.bob.BaseTest;
import com.bob.entity.PersonInfo;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author bob
 * @date 2019/6/16 7:44
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按方法名字典顺序执行
public class PersonInfoDaoTest extends BaseTest {

    @Autowired
    private PersonInfoDao personInfoDao;


//    @Test
    public void ainsert() {
        PersonInfo personInfo = new PersonInfo();
        personInfo.setName("test");
        personInfo.setGender("男");
        personInfo.setEmail("123@4.com");
        personInfo.setEnableStatus(1);
        personInfo.setUserType(1);
        personInfo.setCreateTime(new Date());
        personInfo.setLastEditTime(new Date());

        int ok = personInfoDao.insertPersonInfo(personInfo);
        System.out.println("ok=" + ok);
    }
    @Test
    public void bquery() {
        PersonInfo personInfo = personInfoDao.queryPersonInfoById(2);
        System.out.println("query:"+personInfo);
    }
}
