package step_definitions;

import static org.junit.Assert.assertEquals;
import implementation.atm.ATM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ATMSteps {
	private ATM atm = new ATM();

	@Given("^I have deposited \\$(\\d+) in my (\\w+) Account")
	public void iHaveDeposited$InMyCheckingAccount(int amount,
			String accountType) throws Throwable {

		if (accountType.equals("Checking")) {
			atm.depositToChecking(amount);
		}
		if (accountType.equals("Savings")) {
			atm.depositToSavings(amount);
		}
	}

	@When("^I transfer \\$(\\d+) from my Savings Account into my Checking Account expecting \"([^\"]*)\"")
	public void iTransfer$FromMySavingsAccountIntoMyCheckingAccount(int amount, String expectation)
			throws Throwable {
		if(expectation.equals("success")) {
			assertEquals(true, atm.transfer(atm.getSavingsAccount(), atm.getCheckingAccount(), amount));
		}
		if(expectation.equals("error")) {
			assertEquals(false, atm.transfer(atm.getSavingsAccount(), atm.getCheckingAccount(), amount));
		}
	}

	@Then("^the balance of the Checking Account should be \\$(\\d+)$")
	public void theBalanceOfTheCheckingAccountShouldBe$(int amount)
			throws Throwable {
		assertEquals(amount, atm.getCheckingBalance());
	}

	@Then("^the balance of the Savings Account should be \\$(\\d+)$")
	public void theBalanceOfTheSavingsAccountShouldBe$(int amount)
			throws Throwable {
		assertEquals(amount, atm.getSavingsBalance());
	}
}
