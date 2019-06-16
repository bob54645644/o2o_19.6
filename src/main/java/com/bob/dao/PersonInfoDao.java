package com.bob.dao;

import com.bob.entity.PersonInfo;

/**
 * @author bob
 * @date 2019/6/15 22:26
 */
public interface PersonInfoDao {
    int insertPersonInfo(PersonInfo personInfo);

    PersonInfo queryPersonInfoById(int personInfoId);
}
