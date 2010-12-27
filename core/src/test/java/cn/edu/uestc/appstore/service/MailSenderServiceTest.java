/**
 * 
 *//*
package cn.edu.uestc.appstore.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;

import cn.edu.uestc.appstore.ServiceLocator;
import cn.edu.uestc.appstore.service.user.UserService;

*//**
 * @author Selerda
 * 
 *//*
public class MailSenderServiceTest {

	private Log logger = LogFactory.getLog(UserServiceTest.class);

	private MailSenderService mailSenderService;

	
	@Before
	public void setUp() throws Exception {
		// Initialize ServiceLocator
        logger.info("Initializing ServiceLocator");
        ServiceLocator locator = ServiceLocator.instance();
        locator.init("testBeanRefFactory.xml", "beanRefFactory");

        // Initialize UserService
        logger.info("Initializing mailSenderService");
        mailSenderService = (MailSenderService) locator.getService("mailSenderService");
	}

	@Test
	public void sendMail() {
		
		// 注册完马上发送邮件
		String email = "selerda@qq.com";
		String username = "selerda";
		String url = "http://127.0.0.1/appstore";// request.getRequestURL().toString();
		// url = url.substring(0, url.lastIndexOf("/"));
		mailSenderService.setTo(email);
		mailSenderService.setSubject("来自App Store的邮件");
		mailSenderService.setTemplateName("mail.vm");// 设置的邮件模板
		Map model = new HashMap();
		model.put("username", username);
		model.put("url", url);
		model.put("email", "admin@uestc.edu.cn");
		mailSenderService.sendWithTemplate(model);
		System.out.println("邮件发送成功！");
		
	}
	
}
*/