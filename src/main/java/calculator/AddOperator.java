package calculator;

public class AddOperator implements Operator {
    public AddOperator() {}
    @Override
    public double operate (int num1, int num2) {
        return num1 + num2;
    }
}
