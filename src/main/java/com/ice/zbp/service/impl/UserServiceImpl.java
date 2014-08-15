package com.ice.zbp.service.impl;

import com.ice.zbp.dao.UserMapper;
import com.ice.zbp.model.User;
import com.ice.zbp.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ice on 2014-08-15.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {


	private UserMapper userMapper;

	@Override
	public void save(User user) {
		userMapper.insert(user);
	}

	@Override
	public void update(User user) {
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public User findbyPhone(String id) {
		return userMapper.findByPhone(id);
	}

	@Override
	public void delete(String id) {

	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

}
