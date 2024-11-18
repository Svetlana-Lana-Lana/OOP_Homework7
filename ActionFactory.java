class ActionFactory {

    public static Action createAction(String operator) {
        switch (operator) {
            case "+":
                return new Addition();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            default:
                throw new IllegalArgumentException("Ошибка, данная операция недоступна: " + operator);
        }
    }
}
