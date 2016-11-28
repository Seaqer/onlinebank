package core.entity.info;

import core.entity.state.AccountType;
import core.entity.state.AcсountState;


public class AccountInfo {
    private final String client_id;
    private final String accountNumber;
    private final long balance;
    private final AccountType accountType;
    private final AcсountState acountState;

    public AccountInfo(String client_id, String accountNumber, long balance, AccountType accountType, AcсountState acountState) {
        this.client_id = client_id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.acountState = acountState;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public AcсountState getAcountState() {
        return acountState;
    }

    public String getClient_id() {
        return client_id;
    }
}
