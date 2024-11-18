public class Main {
    public static void main(String[] args) {

        Action addition = ActionFactory.createAction("+");
        Calculator calculatorAddition = new Calculator(addition);
        int resultAddition = calculatorAddition.calculate(3, 7);

        Action multiplication = ActionFactory.createAction("*");
        Calculator calculatorMultiplication = new Calculator(multiplication);
        int resultMultiplication = calculatorMultiplication.calculate(4, 3);

        Action division = ActionFactory.createAction("/");
        Calculator calculatorDivision = new Calculator(division);
        int resultDivision = calculatorDivision.calculate(20, 5);

    }
}
