package com.cassell.nightwatchman.dao;

import com.cassell.nightwatchman.entity.ChickenMsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * create by 金明 on 2021/8/18.
 */
@Mapper
public interface ChickenMapper {
    @Select(value = "select msg,msg_id from chicken_msg where msg_id =#{id}")
    ChickenMsg findMsg(int id);
}
