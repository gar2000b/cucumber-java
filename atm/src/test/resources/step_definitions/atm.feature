Feature: ATM
	---
	
	This feature allows folk to transfer funds to / from different account types
	
	---
	
	Scenario: Transfer funds from savings into checking account
		Given I have deposited $10 in my Checking Account
		And I have deposited $500 in my Savings Account
		When I transfer $500 from my Savings Account into my Checking Account expecting "success"
		Then the balance of the Checking Account should be $510
		And the balance of the Savings Account should be $0
		
	Scenario: Transfer funds from savings into checking account with insufficiant funds deposited into savings
		Given I have deposited $10 in my Checking Account
		And I have deposited $500 in my Savings Account
		When I transfer $550 from my Savings Account into my Checking Account expecting "error"
		Then the balance of the Checking Account should be $10
		And the balance of the Savings Account should be $500