package bank;

public final class Bank implements BankOperation {

  private static int accountNumber = 0;
  private final AccountRepository accountRepository;

  public Bank() {
    this.accountRepository = new AccountRepository.InMemoryAccountRepository();
  }

  @Override
  public int createAccount() {
    int id = ++accountNumber;
    return accountRepository.save(new Account(id))
        .getAccountId();
  }

  @Override
  public Account getAccount(int id) {
    return accountRepository.getById(id);
  }

  @Override
  public int deleteAccount(int accountNumber) {
    return 0;
  }

  @Override
  public boolean deposit(int accountNumber, int amount) {
    return false;
  }

  @Override
  public boolean withdraw(int accountNumber, int amount) {
    return false;
  }

  @Override
  public boolean transfer(int fromAccount, int toAccount, int amount) {
    return false;
  }

  @Override
  public int accountBalance(int accountNumber) {
    return 0;
  }

  @Override
  public int sumAccountsBalance() {
    return 0;
  }

}
