package com.bob.service;

import com.bob.dto.PersonInfoExecution;
import com.bob.entity.PersonInfo;
import com.bob.exceptions.PersonInfoOperationException;

public interface PersonInfoService {
    PersonInfoExecution insertPersonInfo(PersonInfo personInfo)
            throws PersonInfoOperationException;

    PersonInfoExecution getPersonInfoById(int personInfoId);
}
