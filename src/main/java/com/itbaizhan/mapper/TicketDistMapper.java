package com.itbaizhan.mapper;

import com.itbaizhan.pojo.TicketDist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketDistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TicketDist record);

    int insertSelective(TicketDist record);

    TicketDist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TicketDist record);

    int updateByPrimaryKey(TicketDist record);

    List<TicketDist> getAllTicketDist(@Param("start") int start, @Param("count") Integer count);

    Long getTotal();
}