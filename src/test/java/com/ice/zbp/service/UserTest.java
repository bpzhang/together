package com.ice.zbp.service;

import com.ice.zbp.dao.UserMapper;
import com.ice.zbp.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ice on 2014-08-14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-configTest.xml")
public class UserTest {

     private  UserMapper userMapper;

	@Test
	public void findbyphone() {
		User user = userMapper.findByPhone("18612991451");
         System.out.println(user.getUserName());
	}
}
