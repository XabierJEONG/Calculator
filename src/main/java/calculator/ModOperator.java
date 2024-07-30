package calculator;

public class ModOperator implements Operator{
    public ModOperator() {}
    @Override
    public double operate (int num1, int num2){
        if (num2 != 0) {
            return num1 % num2;
        } else {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
    }
}
