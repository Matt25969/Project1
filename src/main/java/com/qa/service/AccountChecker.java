package com.qa.service;

import org.springframework.stereotype.Component;

@Component
public class AccountChecker {
	
	public String checkAccount(String account) {
		
		switch(account) {
		
		case "1":
			return "One";

		case "2":
			return "Two";

		case "3":
			return "Three";
		
		}
		
		return"";
		
	}

}
