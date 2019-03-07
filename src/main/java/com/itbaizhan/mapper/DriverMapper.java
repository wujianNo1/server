package com.itbaizhan.mapper;

import com.itbaizhan.pojo.Driver;
import com.itbaizhan.pojo.DriverWithBLOBs;

import java.util.List;

public interface DriverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverWithBLOBs record);

    int insertSelective(DriverWithBLOBs record);

    DriverWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DriverWithBLOBs record);

    int updateByPrimaryKey(Driver record);

    List<DriverWithBLOBs> getAllDrivers();
}