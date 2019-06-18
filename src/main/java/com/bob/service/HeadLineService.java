package com.bob.service;

import com.bob.dto.HeadLineExecution;
import com.bob.entity.HeadLine;

/**
 * @author bob
 * @date 2019/6/17 16:18
 * 功能
 * 新增一个 insertHeadLine
 * 删除一个 deleteHeadLine
 * 批量删除 deleteHeadLines
 * 修改一个 updateHeadLine
 * 查询所有 listHeadLine
 * 查询一个 getHeadLine
 * 条件查询 listHeadLineByCondition
 *
 */
public interface HeadLineService {
    HeadLineExecution insertHeadLine(HeadLine headLine);

//    HeadLineExecution deleteHeadLine();
//
//    HeadLineExecution deleteHeadLines();
//
//    HeadLineExecution updateHeadLine();

    HeadLineExecution listHeadLine();

//    HeadLineExecution getHeadLine();
//
//    HeadLineExecution listHeadLineByCondition();

}
