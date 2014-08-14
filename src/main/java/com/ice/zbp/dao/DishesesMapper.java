package com.ice.zbp.dao;

import com.ice.zbp.model.Disheses;

public interface DishesesMapper {
    int deleteByPrimaryKey(Integer dishesid);

    int insert(Disheses record);

    int insertSelective(Disheses record);

    Disheses selectByPrimaryKey(Integer dishesid);

    int updateByPrimaryKeySelective(Disheses record);

    int updateByPrimaryKey(Disheses record);
}