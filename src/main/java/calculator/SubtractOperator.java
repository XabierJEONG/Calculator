package calculator;

public class SubtractOperator implements Operator{
    public SubtractOperator() {}
    @Override
    public double operate (int num1, int num2) {
        return num1 - num2;
    }

}
