package bank;

import java.util.HashMap;
import java.util.Map;

interface AccountRepository {

  Account save(Account account);

  class InMemoryAccountRepository implements AccountRepository {

    private final Map<Integer, Account> values = new HashMap<>();

    @Override
    public Account save(Account account) {
      values.put(account.getAccountId(), account);
      return account;
    }

  }

}
