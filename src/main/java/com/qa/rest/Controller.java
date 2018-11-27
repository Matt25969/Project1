package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.AccountChecker;

@RestController
public class Controller {

	@Autowired
	private AccountChecker checker;

	@GetMapping("/check/{account}")
	public String checkAccount(@PathVariable String account) {
		String result = checker.checkAccount(account);
		return result;

	}

}
