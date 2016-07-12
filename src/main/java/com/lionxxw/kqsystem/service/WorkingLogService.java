package com.lionxxw.kqsystem.service;

import com.lionxxw.kqsystem.code.base.BaseService;
import com.lionxxw.kqsystem.dto.WorkingLogDto;


/**
 * The interface Working log service.
 * Created by wangjian@baofoo.com on 2016-07-08 14:00:30
 */
public interface WorkingLogService extends BaseService<WorkingLogDto> {

    /**
     * 批量删除工作日志
     * @param ids
     * @throws Exception
     */
    void batchDelWorkingLog(Long[] ids) throws Exception;
}