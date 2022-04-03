package bank;

public final class Account {

  private final int accountId;
  private double balance;

  public Account(int accountId) {
    this.accountId = accountId;
  }

  public int getAccountId() {
    return accountId;
  }

  public double getBalance() {
    return balance;
  }

}
