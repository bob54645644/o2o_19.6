package com.bob.dao;

import com.bob.BaseTest;
import com.bob.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author bob
 * @date 2019/6/14 22:50
 */
public class AreaDaoTest extends BaseTest {
    @Autowired
    AreaDao areaDao;
//    @Test
    public void testQuery() {
        List<Area> areas = areaDao.queryArea();
        System.out.println(areas);
    }

//    @Test
    public void testInsertArea() {
        Area area = new Area();
        area.setAreaName("areaU");
        area.setPriority(6);
        area.setCreateTime(new Date());
        area.setLastEditTime(new Date());
        int ok = areaDao.insertArea(area);
        System.out.println("ok=" + ok);
        System.out.println(area);
    }

//    @Test
    public void testUpdateArea() {
        Area area = new Area();
        area.setId(2);
        area.setAreaName("areaU");
        area.setPriority(6);
        area.setLastEditTime(new Date());

        int ok = areaDao.updateArea(area);
        System.out.println(ok);
        System.out.println(area);
    }

//    @Test
    public void testDeleteArea() {
        int ok = areaDao.deleteArea(2);
        System.out.println(ok);
    }

//    @Test
    public void testBatchDelete() {
        List<Integer> idList = new ArrayList<>();
        idList.add(3);
        int ok = areaDao.batchDeleteArea(idList);
        System.out.println(ok);
    }

}
