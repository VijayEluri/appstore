/**
 * 
 */
package cn.edu.uestc.appstore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.edu.uestc.appstore.ServiceLocator;
import cn.edu.uestc.appstore.service.UserService;
import cn.edu.uestc.appstore.vo.UserVO;

/**
 * @author Selerda
 *
 */
public class UserServiceTest {

    private Log logger = LogFactory.getLog(UserServiceTest.class);

    private UserService userService;
    
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
        // Initialize ServiceLocator
        logger.info("Initializing ServiceLocator");
        ServiceLocator locator = ServiceLocator.instance();
        locator.init("testBeanRefFactory.xml", "beanRefFactory");

        // Initialize UserService
        logger.info("Initializing UserService");
        userService = locator.getUserService();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void regUser(){
		logger.info("testRegUser:");

		String username = "testReg";
		String password = "123456";
		
		userService.regUser(username, password);
	}
	
	@Test
	public void getUser(){

		String username = "testReg";
		
		UserVO userVO = userService.getUser(username);
		logger.info( "testGetUser - username:"+userVO.getUsername());
	}

	@Test
	public void updateUser(){

		String username = "testReg";
		
		UserVO userVO = userService.getUser(username);
		userVO.setAddress("地址");
		userService.updateUser(userVO);
		logger.info( "testUpdateUser - username:"+userVO.getUsername());
	}
	
	@Test
	public void deleteUser(){
		
		String username = "testReg";
		UserVO userVO = userService.getUser(username);
		
		userService.deleteUser(userVO.getUserId());
		logger.info( "testDeleteUser - id:"+userVO.getUserId());
	}
	
	@Test
    public void getAllUsers() {

        logger.info("testGetAllUsers:");
        UserVO[] users = userService.getAllUsers();

        for (int i=0; i<users.length; i++) {
            logger.info( "username:"+users[i].getUsername()
            		+ " password:"+users[i].getPassword() );
        }
    }

}
