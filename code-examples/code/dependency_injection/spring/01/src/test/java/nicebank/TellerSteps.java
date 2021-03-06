/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
***/
package nicebank;

import cucumber.api.java.en.*;

import org.springframework.beans.factory.annotation.Autowired;

import support.AtmUserInterface;
import support.TestAccount;

public class TellerSteps {

  @Autowired
  private TestAccount account;

  @Autowired
  private AtmUserInterface teller;
      
  @When("^I withdraw \\$(\\d+)$")
  public void iWithdraw$(int amount) throws Throwable {
      teller.withdrawFrom(account, amount);
  }
}