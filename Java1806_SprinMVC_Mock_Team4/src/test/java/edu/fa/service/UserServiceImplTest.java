package edu.fa.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.fa.model.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:springmvc-servlet.xml" })
public class UserServiceImplTest {
/*	@Autowired
	private UserDao userDao;*/
	@Autowired
	private UserService userService;
	@Autowired
	private TravelContentService travelContentService;
	
	
	/*@Test
	public void testLogin(){
		User user = new User();
		user.setUser_name("sonnh");
		user.setPassword("1234");
		assertNotNull(userDao.login(user.getUser_name(), user.getPassword()));
		
		
	}*/
	/*@Test 
	public void testFindUserByPassAndRole() {
		Role role = new Role();
		role.setRole_id(1);
		assertNotNull(userService.findByRole(role));
		
	}*/
	
	/*@Test 
	public void testFindUserByNameAndPassword() {
		
		assertNotNull(userService.findOneUserByUserNameAndPassword("PhucLQ", "12345678"));
		
	}
	
	@Test 
	public void testFindUserByName() {
		
		assertNotNull(userService.findOneUserByUserName("PhucLQ"));
		
	}*/
	
	/*@Test 
	public void testFindUserByName2() {
		
		assertTrue(travelContentService.findTravelContentByTravelTravelId(2).size()==0);
		
	}
	*/
	@Test
	public void testLogin(){
		User user = new User();
		user.setUserName("123");
		
		assertNotNull(userService.findOneUserByUserName("11111111"));
}
}
