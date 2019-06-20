package com.bob.service.impl;

import com.bob.dao.HeadLineDao;
import com.bob.dto.HeadLineExecution;
import com.bob.entity.HeadLine;
import com.bob.enums.HeadLineStateEnum;
import com.bob.service.HeadLineService;

import java.util.Date;

/**
 * @author bob
 * @date 2019/6/19 23:18
 */
public class HeadLineServiceImpl implements HeadLineService {
    private HeadLineDao headLineDao;
    @Override
    public HeadLineExecution insertHeadLine(HeadLine headLine) {
        headLine.setCreateTime(new Date());
        headLine.setLastEditTime(new Date());
        try{
            int effectedNum = headLineDao.insertHeadLine(headLine);
            if (effectedNum > 0) {
                return new HeadLineExecution(HeadLineStateEnum.SUCCESS, headLine);
            } else {
                return new HeadLineExecution(HeadLineStateEnum.INNER_ERROR);
            }
        }
        return null;
    }

    @Override
    public HeadLineExecution listHeadLine() {
        return null;
    }
}
