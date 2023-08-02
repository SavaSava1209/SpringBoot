package com.usc.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class UserDaoTest {
	
	@Autowired
	UserDao userDaoTest;

	@Test
	@Disabled
	void test() {
		userDaoTest.findAll();
	}

}
