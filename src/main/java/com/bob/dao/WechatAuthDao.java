package com.bob.dao;

import com.bob.entity.WechatAuth;

public interface WechatAuthDao {
    int insertWechatAuth(WechatAuth wechatAuth);

    WechatAuth queryWechatAuthByOpenId(String openId);
}
