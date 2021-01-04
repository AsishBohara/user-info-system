package com.onlinebanking;

import javax.swing.JOptionPane;

public class AccountController {

	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();
		Account account = getAccount();
		int saved = accountService.saveAccountInfo(account);
if(saved>=1) {
	JOptionPane.showMessageDialog(null,"Account info is savedsuccessfully in db");
}else {
	JOptionPane.showMessageDialog(null, "Error in db");
}
	}

	public static Account getAccount() {
		Account account =new Account();
		String accountname = JOptionPane.showInputDialog("Enter accountname: ");
		Integer accountno = Integer.parseInt(JOptionPane.showInputDialog("Enter accountno:"));
		long moblieNo = Long.parseLong(JOptionPane.showInputDialog("Enter mobileno"));
		Integer id = Integer.parseInt(JOptionPane.showInputDialog("Enter id:"));
		String email = JOptionPane.showInputDialog("Enter email:");
		
		account.setAccount_name(accountname);
		account.setAccount_no(accountno);
		account.setMobile_no(moblieNo);
		account.setId(id);
		account.setEmail(email);
		
		return account;
	}

}
