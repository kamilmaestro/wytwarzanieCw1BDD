import bank.Bank
import spock.lang.Specification
import spock.lang.Unroll

class CreateAccountSpec extends Specification {

  private Bank bank

  def setup() {
    bank = new Bank()
  }

  @Unroll
  def "should create an account"() {
    expect: "an account is created"
      bank.createAccount() == accountID
    where:
      accountID << [1, 2, 3]
  }

  def "a created account should have an empty balance" () {
    when: "creates an account"
      int accountId = bank.createAccount()
    then: "this account has an empty balance"
      bank.getAccount(accountId).balance == 0
  }

}