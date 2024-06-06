package com.myworld.aopdemodao;

import org.springframework.stereotype.Component;

@Component

public class MembershipDAO {

	public boolean addSilly() {
		System.out.println(getClass() + ": DOING STUFF: adding membership!");
		
		return true;
	}
	
	public void goToSleep() {
		System.out.println(getClass() + ": Going to sleep");
	}
}
