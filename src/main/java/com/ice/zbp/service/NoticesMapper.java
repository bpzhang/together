package com.ice.zbp.service;

import com.ice.zbp.model.Notices;

public interface NoticesMapper {
    int deleteByPrimaryKey(Integer noticeid);

    int insert(Notices record);

    int insertSelective(Notices record);

    Notices selectByPrimaryKey(Integer noticeid);

    int updateByPrimaryKeySelective(Notices record);

    int updateByPrimaryKey(Notices record);
}