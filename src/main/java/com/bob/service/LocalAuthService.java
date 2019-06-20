package com.bob.service;

import com.bob.dto.LocalAuthExecution;
import com.bob.entity.LocalAuth;
import com.bob.exceptions.LocalAuthOperationException;


public interface LocalAuthService {
    LocalAuthExecution insertLocalAuth(LocalAuth localAuth)
            throws LocalAuthOperationException;
    LocalAuthExecution updateLocalAuth(int personId, String username, String password,
                                       String newPassword)
        throws LocalAuthOperationException;

    LocalAuthExecution getLocalAuthByPersonId(int personId);

    LocalAuthExecution getLocalAuthByUsernameAndPassword(String username,String password);
}
