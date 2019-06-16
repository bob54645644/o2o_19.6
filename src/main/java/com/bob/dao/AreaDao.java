package com.bob.dao;

import com.bob.entity.Area;

import java.util.List;

public interface AreaDao {
    int insertArea(Area area);

    int deleteArea(int id);

    int batchDeleteArea(List<Integer> areaIdList);

    int updateArea(Area area);

    List<Area> queryArea();
}
