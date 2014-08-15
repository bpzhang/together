package com.ice.zbp.service;

import com.ice.zbp.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ice on 2014-08-14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-configTest.xml")
public class UserTest {

     @Autowired
	 private UserService userService;

	@Test
	public void findbyphone() {
		User user = userService.findbyPhone("18612991451");
         System.out.println(user.getUserName());
	}
}
