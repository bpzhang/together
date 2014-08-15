package com.ice.zbp.service;

import com.ice.zbp.model.User;

/**
 * Created by ice on 2014-08-15.
 */
public interface UserService {


	/**
	 * 保存*
	 */
	public void save(User user);

	/**
	 * 修改*
	 */
	public void update(User user);

	/**
	 * 查找*
	 */
	public User findbyPhone(String phone);

	/**
	 *
	 * 删除*
	 */
	public void delete(String id);

}
