package task1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * this class implement an account.
 * 
 * @author noura
 */
public class Account {

	private double balance;
	static private int count = 1;
	int accountNum;

	/**
	 * this default constructor to initialize the balance and account number of the
	 * account.
	 */
	public Account() {

		this.balance = 0;
		this.accountNum = count++;
	}

	/**
	 * this function is to set the balance of the account.
	 *
	 * @param blnce is the balance of the account.
	 */
	public void SetBalance(double blnce) {
		balance = blnce;
	}

	/**
	 * this function is to set the number of the account.
	 *
	 * @param accnum is the number of the accont.
	 */
	public void SetAccountNum(int accnum) {
		accountNum = accnum;
	}

	/**
	 * this function is to return the balance of the account.
	 *
	 * @return the account's balance.
	 */
	public double GetBalance() {
		return balance;
	}

	/**
	 * this function is to return the number of the account.
	 *
	 * @return the account's number.
	 */
	public int GetAccountNum() {
		return accountNum;
	}

	/**
	 * Overridden toString function to display the account information.
	 *
	 * @return account's information.
	 */
	@Override
	public String toString() {
		return "Account{" + "balance=" + balance + ", accountNum=" + accountNum + '}';

	}

	/**
	 * this function is to withdraw from the balance of the account.
	 *
	 * @param wd is the balance to be withdrawn.
	 */
	public void Withdraw(int wd) {
		if (balance >= wd) {
			balance -= wd;
		} else {
			System.out.println("Not Enough money");
		}
	}

	/**
	 * this function is to deposit to the account.
	 *
	 * @param dep is the balance to be deposed.
	 */
	public void deposit(int dep) {
		balance += dep;
	}
}