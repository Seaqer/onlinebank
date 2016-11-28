package auth.dao;

import auth.intefaces.User;
import core.iterfaces.Repository;

import java.util.List;

public class UserService implements Repository<User> {

    @Override
    public User addElement(User element) {
        return null;
    }

    @Override
    public User updateElement(User element) {
        return null;
    }

    @Override
    public boolean deleteElement(User element) {
        return false;
    }

    @Override
    public List<User> getElements(User element) {
        return null;
    }
}
