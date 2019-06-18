package com.bob.dto;

import com.bob.entity.PersonInfo;
import com.bob.enums.PersonInfoStateEnum;

/**
 * personInfo
 * @author bob
 * @date 2019/6/18 0:26
 */
public class PersonInfoExecution {
    private int state;
    private String info;
    private PersonInfo personInfo;

    public PersonInfoExecution() {
    }

    public PersonInfoExecution(PersonInfoStateEnum stateEnum, PersonInfo personInfo) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.personInfo = personInfo;
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

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
