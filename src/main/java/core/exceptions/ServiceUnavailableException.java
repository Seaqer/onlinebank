package core.exceptions;

/**
 * Created by Артём on 27.11.2016.
 */
public class ServiceUnavailableException extends Exception {
    public ServiceUnavailableException() {
    }

    public ServiceUnavailableException(String message) {
        super(message);
    }

    public ServiceUnavailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceUnavailableException(Throwable cause) {
        super(cause);
    }
}
