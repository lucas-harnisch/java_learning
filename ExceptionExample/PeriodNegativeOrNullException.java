package ExceptionExample;

public class PeriodNegativeOrNullException extends Exception {

    public PeriodNegativeOrNullException(String message) {
        super(message);
    }
    
    // Optional: If you want to include a default message
    public PeriodNegativeOrNullException() {
        super("Period cannot be negative or null.");
    }
}