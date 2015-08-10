package implementation.atm.accounts.api;

public interface Account {

	public abstract int getAmount();

	public abstract void setAmount(int amount);

	public abstract boolean depositCash(int amount);
	
	public abstract int withdrawCash(int amount);

}