package calculator;

public class DivideOperator {
    public DivideOperator() {}
    public double divOper (int num1, int num2) throws CalException {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new CalException("0으로 나눌 수 없습니다.");
        }
    }
}
