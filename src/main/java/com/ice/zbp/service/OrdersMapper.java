package com.ice.zbp.service;

import com.ice.zbp.model.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer dishesid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer dishesid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}