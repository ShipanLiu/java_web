package Basic4_API.api1.api_Exception;

public class AgeOutOfBoundsException extends RuntimeException {
    public AgeOutOfBoundsException() {}

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
