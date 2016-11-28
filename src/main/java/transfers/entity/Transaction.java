package transfers.entity;

import java.util.Date;

/**
 * Created by Артём on 28.11.2016.
 */
public class Transaction {

    private final long transactionId;
    private final float amount;
    private final long fromAccount;
    private final long toAccount;
    private final Date transactionDate;//TODO:

    public Transaction(long transactionId, float amount, long fromAccount, long toAccount, Date transactionDate) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.transactionDate = transactionDate;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public float getAmount() {
        return amount;
    }

    public long getFromAccount() {
        return fromAccount;
    }

    public long getToAccount() {
        return toAccount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
}
