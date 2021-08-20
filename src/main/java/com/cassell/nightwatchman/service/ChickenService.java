package com.cassell.nightwatchman.service;

import com.cassell.nightwatchman.dao.ChickenMapper;
import com.cassell.nightwatchman.entity.ChickenMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by 金明 on 2021/8/18.
 */
@Service
public class ChickenService implements ChickenMapper {
    @Autowired
    private ChickenMapper chickenMapper;

    @Override
    public ChickenMsg findMsg(int id){
        return chickenMapper.findMsg(id);
    }
}
