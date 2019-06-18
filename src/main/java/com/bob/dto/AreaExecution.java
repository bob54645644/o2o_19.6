package com.bob.dto;

import com.bob.entity.Area;
import com.bob.enums.AreaStateEnum;

import java.util.List;

/**
 * areaList
 *
 * area操作结果
 * @author bob
 * @date 2019/6/17 19:55
 */
public class AreaExecution {
    private int state;
    private String info;
    private List<Area> areaList;

    public AreaExecution() {
    }
    public AreaExecution(AreaStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
    }
    public AreaExecution(AreaStateEnum stateEnum,List<Area> areaList) {
        this.areaList = areaList;
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<Area> areaList) {
        this.areaList = areaList;
    }
}
