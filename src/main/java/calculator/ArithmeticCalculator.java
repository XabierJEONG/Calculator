package calculator;

public class ArithmeticCalculator extends Calculator {
    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;
    // 생성자
    public ArithmeticCalculator() {
        super();
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

    // 사칙연산계산기 메소드
    public double calculate(char oper, int num1, int num2) throws CalException {
        if (oper == '+') {
            result = addOperator.addOper(num1, num2);
        } else if (oper == '-') {
            result = subtractOperator.subOper(num1, num2);
        } else if (oper == '*') {
            result = multiplyOperator.multiOper(num1, num2);
        } else if (oper == '/') {
            result = divideOperator.divOper(num1, num2);
        } else {
            throw new CalException("유효한 입력값이 아닙니다.");
        }
        resultArray.add(result);
        return result;
    }
}
