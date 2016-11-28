package auth.intefaces;

public interface PasswordEncryptor {

    char[] encrypt(char[] data);
    char[] decrypt(char[] data);
}
