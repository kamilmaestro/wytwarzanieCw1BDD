package bank;

final class Account {

  private final int accountId;

  Account(int accountId) {
    this.accountId = accountId;
  }

  int getAccountId() {
    return accountId;
  }

}
