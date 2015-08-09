package implementation.atm;

import implementation.atm.accounts.CheckingAccount;
import implementation.atm.accounts.SavingsAccount;
import implementation.atm.accounts.api.Account;

public class ATM {

	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;

	public ATM() {
		checkingAccount = new CheckingAccount();
		savingsAccount = new SavingsAccount();
	}

	public void depositToChecking(int amount) {
		checkingAccount.depositCash(amount);
	}

	public void depositToSavings(int amount) {
		savingsAccount.depositCash(amount);
	}

	public int getCheckingBalance() {
		return checkingAccount.getAmount();
	}

	public int getSavingsBalance() {
		return savingsAccount.getAmount();
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public boolean transfer(Account account1, Account account2, int amount) {
		return account2.depositCash(account1.withdrawCash(amount));
	}
}
