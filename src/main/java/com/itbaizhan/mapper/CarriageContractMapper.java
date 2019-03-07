package com.itbaizhan.mapper;

import com.itbaizhan.pojo.CarriageContract;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarriageContractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarriageContract record);

    int insertSelective(CarriageContract record);

    CarriageContract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarriageContract record);

    int updateByPrimaryKey(CarriageContract record);

    List<String> getGoodsBillCode();

    Integer getMaxId();

    List<CarriageContract> getAllCarriageContract(@Param("start") int start, @Param("count") Integer count);

    Long getCarriageContractCount();
}