package com.onlinebanking;

import java.util.List;

import com.vastika.uis.dao.UserDao;
import com.vastika.uis.dao.UserDaoImpl;
import com.vastika.uis.model.User;

public class AccountServiceImpl implements AccountService {
	
	AccountDao accountDao = new AccountDaoImpl();

	@Override
	public int saveAccountInfo(Account account) {
	
		return accountDao.saveAccountInfo(account);
	}

	@Override
	public int updateAccountInfo(Account account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAccountInfo(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Account> getAllAccountInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}