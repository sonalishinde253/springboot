package com.springboot.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootJdbcApplication.class, args);
		AccountDao dao = context.getBean(AccountDao.class);
		Account acc = new Account();
		//create account 
//		acc.setAccountNum(113);
//		acc.setAccountType("Current");
//		acc.setAccountBalance(65000);
//		dao.createAccount(acc);
		
		//List Account
//		List<Map<String,Object>> accountList = dao.getAllAcocunts();
//		for(Map acct:accountList) {
//			System.out.println(acct.get("account_num") + " " + acct.get("account_type") +" "+ acct.get("account_balance") );
//		}
		
		//Update Account
//		dao.updateAccount(113, 870000);
		
		//Delete Account
		dao.deleteAccount(113);
	}

}
