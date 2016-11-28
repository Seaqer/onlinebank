package core.dao;

import core.entity.info.AccountInfo;
import core.iterfaces.Repository;

import java.util.List;

public class AccountService implements Repository<AccountInfo>{

    @Override
    public AccountInfo addElement(AccountInfo element) {
        return null;
    }

    @Override
    public AccountInfo updateElement(AccountInfo element) {
        return null;
    }

    @Override
    public boolean deleteElement(AccountInfo element) {
        return false;
    }

    @Override
    public List<AccountInfo> getElements(AccountInfo element) {
        return null;
    }
}

