import java.util.logging.Logger;

class Calculator {

    private final Action operation;

    private static final Logger Log = Logger.getLogger(Calculator.class.getName());

    public Calculator(Action operation) {
        this.operation = operation;
    }

    public int calculate(int x, int y) {
        int result = operation.calculation(x, y);
        Log.info("Вычисление: " + x + operation.getOperationSign() + y + "=" + result);
        return result;
    }
}
