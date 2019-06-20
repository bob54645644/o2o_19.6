package com.bob.dto;

import com.bob.entity.HeadLine;
import com.bob.enums.HeadLineStateEnum;

import java.util.List;

/**
 *headLine
 * headLineList
 *
 * @author bob
 * @date 2019/6/18 0:08
 */
public class HeadLineExecution {
    private int state;
    private String info;
    private HeadLine headLine;
    private List<HeadLine> headLineList;

    public HeadLineExecution() {
    }

    public HeadLineExecution(HeadLineStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
    }

    public HeadLineExecution(HeadLineStateEnum stateEnum, HeadLine headLine) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.headLine = headLine;
    }

    public HeadLineExecution(HeadLineStateEnum stateEnum, List<HeadLine> headLineList) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.headLineList = headLineList;
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

    public HeadLine getHeadLine() {
        return headLine;
    }

    public void setHeadLine(HeadLine headLine) {
        this.headLine = headLine;
    }

    public List<HeadLine> getHeadLineList() {
        return headLineList;
    }

    public void setHeadLineList(List<HeadLine> headLineList) {
        this.headLineList = headLineList;
    }
}
