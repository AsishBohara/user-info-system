package com.onlinebanking;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vastika.uis.model.User;
import com.vastika.uis.util.DbUtil;

public class AccountDaoImpl implements AccountDao {

	 public static final String SAVE_SQL ="insert into account_tbl(account_name,account_no, mobile_no, id, email)values(?, ?, ?, ?, ?) ";//save is insert we can write any one
	  public static final String UPDATE_SQL ="update  account_tbl set account_name =?, mobile_no=?, id=?,email=? where id=? ";
	  public static final String DELETE_SQL = "delete from account_tbl where id=?";
	  public static final String LIST_SQL = "select * from  account_tbl";
	  public static final String GET_BY_ID_SQL = "select * from  account_tbl where id =?";
	  
	@Override
	public int saveAccountInfo(Account account) {
int saved =0;
try(PreparedStatement ps = DbUtil.getConnection().prepareStatement(SAVE_SQL);
		
		){
	ps.setString(1, account.getAccount_name());
	ps.setInt(2, account.getAccount_no());
	ps.setLong(3, account.getMobile_no());
	ps.setInt(4, account.getId());
	ps.setString(5, account.getEmail());
	saved = ps.executeUpdate();
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();

	
}

return saved;

	
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
	