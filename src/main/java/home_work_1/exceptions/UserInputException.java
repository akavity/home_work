package home_work_1.exceptions;

public class UserInputException extends IllegalArgumentException {
    public UserInputException() {
        super("Wrong data");
    }

    public UserInputException(String massage) {
        super(massage);
    }

    public UserInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserInputException(Throwable cause) {
        super(cause);
    }
}
