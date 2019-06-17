package com.bob.dao;

import com.bob.BaseTest;
import com.bob.entity.HeadLine;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author bob
 * @date 2019/6/16 22:14
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按方法名字典顺序执行
public class HeadLineDaoTest extends BaseTest {
    @Autowired
    HeadLineDao headLineDao;

    private static int row;
    @Test
    public void atestInsert() {
        HeadLine headLine = new HeadLine();
        headLine.setName("headline");
        headLine.setImage("image");
        headLine.setLink("link");
        headLine.setPriority(0);
        headLine.setEnableStatus(0);
        headLine.setCreateTime(new Date());
        headLine.setLastEditTime(new Date());

        int ok = headLineDao.insertHeadLine(headLine);
        row = headLine.getId();
        System.out.println("row="+row);
        System.out.println("insert ok="+ok);
    }

    @Test
    public void btestupdatre() {
        HeadLine headLine = new HeadLine();
        headLine.setId(row);
        headLine.setName("headline1");
        headLine.setImage("image1");
        headLine.setLink("link1");
        headLine.setPriority(0);
        headLine.setEnableStatus(0);
        headLine.setLastEditTime(new Date());

        int ok = headLineDao.updateHeadLine(headLine);
        System.out.println("update ok="+ok);
    }

    @Test
    public void ctestquerybyId() {
        HeadLine headLine = headLineDao.queryHeadLineById(row);
        System.out.println("queryById:"+headLine);
    }

    @Test
    public void dtestqueryByids() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(row);

        List<HeadLine> headLines = headLineDao.queryHeadLineByIds(integerList);
        System.out.println("queryByIds:"+headLines);
    }
    @Test
    public void etestqeryHeadLine() {
        HeadLine headLine = new HeadLine();
        headLine.setName("headline1");
        headLine.setImage("image1");
        headLine.setLink("link1");
        headLine.setPriority(0);
        headLine.setEnableStatus(0);

        List<HeadLine> headLines = headLineDao.queryHeadLine(headLine);
        System.out.println("queryHeadline:" +headLines);
    }

//    @Test
    public void ftesatdelete() {
        int ok = headLineDao.deleteHeadLine(row);
        System.out.println("delete ok="+ok);
    }
}
