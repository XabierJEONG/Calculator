package calculator;

public class ArithmeticCalculator extends Calculator {
    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;
    ModOperator modOperator;
    // 생성자
    public ArithmeticCalculator() {
        super();
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
        modOperator = new ModOperator();

    }

    // 사칙연산계산기 메소드
    public double calculate(char oper, int num1, int num2) throws CalException {
        if (oper == '+') {
            result = addOperator.operate(num1, num2);
        } else if (oper == '-') {
            result = subtractOperator.operate(num1, num2);
        } else if (oper == '*') {
            result = multiplyOperator.operate(num1, num2);
        } else if (oper == '/') {
            result = divideOperator.operate(num1, num2);
        } else if (oper == '%'){
            result = modOperator.operate(num1, num2);
        } else {
            throw new CalException("유효한 입력값이 아닙니다.");
        }
        resultArray.add(result);
        return result;
    }
}
