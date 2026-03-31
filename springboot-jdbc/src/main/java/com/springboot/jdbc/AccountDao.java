package com.springboot.jdbc;

import java.util.List;
import java.util.Map;

public interface AccountDao {
	public void createAccount(Account account);
	public void updateAccount(int aacountNum,int accountBalance);
	public void deleteAccount(int accountNum);
	public List<Map<String,Object>> getAllAcocunts();
}
