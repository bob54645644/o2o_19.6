package com.bob.service.impl;

import com.bob.dao.AreaDao;
import com.bob.entity.Area;
import com.bob.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bob
 * @date 2019/6/15 10:59
 */
@Service
public class AreaServiceImpl implements AreaService {
    private AreaDao areaDao;

    public AreaServiceImpl(AreaDao areaDao) {
        this.areaDao = areaDao;
    }

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
