package com.itbaizhan.mapper;

import com.itbaizhan.pojo.Ticket;
import com.itbaizhan.pojo.TicketDist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ticket record);

    int insertSelective(Ticket record);

    Ticket selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ticket record);

    int updateByPrimaryKey(Ticket record);

    List<TicketDist> getAllTicketDist(int start, Integer count);

    List<Ticket> getAllTicket(@Param("start") int start, @Param("count") Integer count);

    Long getTicketTotal();
}