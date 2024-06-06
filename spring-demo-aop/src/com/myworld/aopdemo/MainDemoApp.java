package com.myworld.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myworld.aopdemodao.AccountDAO;
import com.myworld.aopdemodao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO" , AccountDAO.class);
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO" , MembershipDAO.class);
		

		
		//call the business method 
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();
		
		//call the membership method
		theMembershipDAO.addSilly();
		theMembershipDAO.goToSleep();
		
		//close the context
        context.close();
	}

}
