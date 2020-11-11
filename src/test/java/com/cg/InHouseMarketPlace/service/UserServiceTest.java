package com.cg.InHouseMarketPlace.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.cg.InHouseMarketPlace.model.User;

class UserServiceTest {

	
	UserService service=mock(UserService.class);
	
	User user=new User("Sai");
		
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

/*	
	@Test
	public void testGetUserId() {
		User user = new User("Sai");
		user.setUserId("Sai");
		
		assertEquals("Sai", user.getUserId());
	}*/
	
	public void testUser() {
		when(service.editUser(user)).thenReturn(user);
		assertEquals(user, service.editUser(user));
	}
}
