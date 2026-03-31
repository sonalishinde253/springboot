package com.springboot.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AccountDaoImpl implements AccountDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void createAccount(Account account) {
		String sql = "insert into account values(?,?,?)";
		jdbcTemplate.update(sql,account.getAccountNum(),account.getAccountType(),account.getAccountBalance());
		System.out.println("Account created");
	}

	@Override
	public void updateAccount(int accountNum, int accountBalance) {
		String sql = "update account set account_balance=? where account_num=?";
		jdbcTemplate.update(sql,accountBalance,accountNum);
		System.out.println("Account updated");
	}

	@Override
	public void deleteAccount(int accountNum) {

		String sql ="delete from account where account_num=?";
		jdbcTemplate.update(sql,accountNum);
		System.out.println("Account Deleted");
		
	}

	@Override
	public List<Map<String, Object>> getAllAcocunts() {
		String sql = "select * from account";
		return jdbcTemplate.queryForList(sql);
	}

}
