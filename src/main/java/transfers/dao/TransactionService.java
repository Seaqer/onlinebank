package transfers.dao;

import core.iterfaces.Repository;
import transfers.entity.Transaction;

import java.util.List;

public class TransactionService implements Repository<Transaction> {

    @Override
    public Transaction addElement(Transaction element) {
        return null;
    }

    @Override
    public Transaction updateElement(Transaction element) {
        return null;
    }

    @Override
    public boolean deleteElement(Transaction element) {
        return false;
    }

    @Override
    public List<Transaction> getElements(Transaction element) {
        return null;
    }
}
