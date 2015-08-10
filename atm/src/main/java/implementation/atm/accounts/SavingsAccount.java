package implementation.atm.accounts;

import implementation.atm.accounts.api.Account;

public class SavingsAccount implements Account{
	private int amount = 0;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public boolean depositCash(int amount) {
		if(amount == 0) {
			return false;
		}
		this.amount = this.amount + amount;
		return true;
	}

	public int withdrawCash(int amount) {
		if(amount > this.amount) {
			return 0;
		}
		this.amount -= amount;
		return amount;
	}
}
