/**
 * 
 */
package cn.edu.uestc.appstore.service;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.edu.uestc.appstore.ServiceLocator;
import cn.edu.uestc.appstore.util.EntityUtils;
import cn.edu.uestc.appstore.vo.*;

/**
 * @author Selerda
 *
 */
public class MockServiceTest {

    private Log logger = LogFactory.getLog(MockServiceTest.class);

    private UserService userService;
    private ResourceService resourceService;
    
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
  
        logger.info("Initializing ServiceLocator");
        ServiceLocator locator = ServiceLocator.instance();
        locator.init("testBeanRefFactory.xml", "beanRefFactory");

        logger.info("Initializing Services");
        userService = locator.getUserService();
        resourceService = locator.getResourceService();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
    public void getAll() {
		ResourceVO[] resources = this.resourceService.getResources();
		assertNotNull(resources);
        logger.info(resources.length);
    }

	@Test
    public void getOne() {
		long resId = 1L;
		ResourceVO resource = this.resourceService.getResourceById(resId);
        assertNotNull(resource);
        logger.info(EntityUtils.toFormatString(resource));
    }
}
