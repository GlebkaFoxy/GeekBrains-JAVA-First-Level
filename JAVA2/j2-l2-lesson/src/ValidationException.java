/**
 * Created by Tim on 15.07.2016.
 */
public class ValidationException extends Exception {
    public ValidationException(String exceptionCause) {
        super(exceptionCause);
    }

    public String getSimpleString() {
        return "Hello World of exceptions!";
    }
}
