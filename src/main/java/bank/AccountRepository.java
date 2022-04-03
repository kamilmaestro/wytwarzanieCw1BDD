package bank;

import java.util.HashMap;
import java.util.Map;

interface AccountRepository {

  Account save(Account account);
  Account getById(int id);

  class InMemoryAccountRepository implements AccountRepository {

    private final Map<Integer, Account> values = new HashMap<>();

    @Override
    public Account save(Account account) {
      values.put(account.getAccountId(), account);
      return account;
    }

    @Override
    public Account getById(int id) {
      return values.get(id);
    }

  }

}
