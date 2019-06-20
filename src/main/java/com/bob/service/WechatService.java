package com.bob.service;

import com.bob.dto.WechatAuthExecution;
import com.bob.entity.WechatAuth;
import com.bob.exceptions.WechatAuthOperationException;

public interface WechatService {
    WechatAuthExecution insertWechatAuth(WechatAuth auth)
            throws WechatAuthOperationException;

    WechatAuthExecution getWechatAuthByOpenId(String openId);
}
