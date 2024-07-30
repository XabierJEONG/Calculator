package calculator;

public class ArithmeticCalculator extends Calculator {
    // 생성자
    public ArithmeticCalculator() {
        super();
    }
    // 사칙연산계산기 메소드
    public double calculate(char oper, int num1, int num2) throws CalException {
        if (oper == '+') {
            result = num1 + num2;
        } else if (oper == '-') {
            result = num1 - num2;
        } else if (oper == '*') {
            result = num1 * num2;
        } else if (oper == '/') {
            result = num1 / num2;
            if (num2 == 0) {
                throw new CalException();
            }
        } else {
            throw new CalException();
        }
        resultArray.add(result);
        return result;
    }
}
