package auth.intefaces;

import auth.entity.UserType;

/**
 * Created by Артём on 27.11.2016.
 */
public interface User {
    boolean authorization(char[] password);
}
