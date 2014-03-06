package main.java;

import main.java.service.EmpDeptService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.apache.commons.lang.StringUtils;

public class SampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------------Inside gradle11111111111----------------------");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		System.out.println("-----------------Inside gradle22222222222222----------------------");
		
		EmpDeptService empDeptService = (EmpDeptService)context.getBean("empDeptService");
		
		System.out.println("-----------------Inside gradle33333333333333333----------------------");
		
		empDeptService.addData();
	}

}
