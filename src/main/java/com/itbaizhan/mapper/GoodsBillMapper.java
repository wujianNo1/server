package com.itbaizhan.mapper;

import com.itbaizhan.pojo.GoodsBill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsBill record);

    int insertSelective(GoodsBill record);

    GoodsBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsBill record);

    int updateByPrimaryKeyWithBLOBs(GoodsBill record);

    int updateByPrimaryKey(GoodsBill record);

    List<GoodsBill> getAllProdFormsByPage(@Param("start") int start, @Param("count") Integer count, @Param("state") String state);

    Long getProdFormTotal(@Param("state") String state);

    Integer getMaxId();

    Integer deleteGoodsBillById(@Param("ids") String[] split);

    GoodsBill getGoodsBillByCode(@Param("code") String code);
}