package core.dao;

import core.entity.info.ClientInfo;
import core.iterfaces.Repository;

import java.util.List;

public class ClientService implements Repository<ClientInfo> {

    @Override
    public ClientInfo addElement(ClientInfo element) {
        return null;
    }

    @Override
    public ClientInfo updateElement(ClientInfo element) {
        return null;
    }

    @Override
    public boolean deleteElement(ClientInfo element) {
        return false;
    }

    @Override
    public List<ClientInfo> getElements(ClientInfo element) {
        return null;
    }
}
