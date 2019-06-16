package com.bob.dao;

import com.bob.entity.LocalAuth;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface LocalAuthDao {
    int insertLocalAuth(LocalAuth localAuth);
    //通过条件改
    int updateLocalAuth(@Param("personId")int personId, @Param("username")String username,
                        @Param("password")String password, @Param("newPassword")String newPassword,
                        @Param("lastEditTime")Date lastEditTime);

    LocalAuth queryLocalAuthByPersonId(int personId);

    LocalAuth queryLocalAuthByUsernameAndPassword(@Param("username")String username,@Param("password")String password);
}
