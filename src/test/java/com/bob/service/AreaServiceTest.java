package com.bob.service;

import com.bob.BaseTest;
import com.bob.dto.AreaExecution;
import com.bob.entity.Area;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author bob
 * @date 2019/6/15 10:56
 */
public class AreaServiceTest extends BaseTest {
    @Autowired
    AreaService areaService;

    Logger log = LoggerFactory.getLogger(AreaServiceTest.class);

    @Test
    public void testAreaServiceGet() {
        AreaExecution execution = areaService.getAreaList();
        log.info(execution.getAreaList().toString());
        System.out.println(execution.getAreaList());
    }
}
