package com.bob.dao;

import com.bob.entity.HeadLine;

import java.util.List;

/**
 * @author bob
 * @date 2019/6/15 22:20
 */
public interface HeadLineDao {
    int insertHeadLine(HeadLine headLine);

    int deleteHeadLine(int headLineId);

    int batchDeleteHeadLine(List<Integer> headLineIdList);

    int updateHeadLine(HeadLine headLine);

    HeadLine queryHeadLineById(int HeadLineId);

    List<HeadLine> queryHeadLineByIds(List<Integer> headLineIdList);

    //根据条件查询
    List<HeadLine> queryHeadLine(HeadLine headLine);
}
