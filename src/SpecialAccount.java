package task1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * this class is a special account which inherit from the class account.
 *
 * @version 1.0
 * @author noura.
 */
public class SpecialAccount extends Account {

	/**
	 * this overridden Withdraw function for special functionality.
	 *
	 * @param wd is the balance to be withdrawn.
	 */
	@Override
	public void Withdraw(int wd) {
		if (this.GetBalance() + 1000 >= wd) {
			double balance = this.GetBalance();
			this.SetBalance(balance -= wd);
		} else {
			System.out.println("Not Enough money");
		}
	}

}