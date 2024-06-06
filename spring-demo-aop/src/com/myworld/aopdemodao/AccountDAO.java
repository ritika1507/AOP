package com.myworld.aopdemodao;

import org.springframework.stereotype.Component;

import com.myworld.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount , boolean VIPflag) {
		
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public boolean doWork() {
		
		System.out.println(getClass() + ": DOING MY WORK");
		return false;
	}
}
