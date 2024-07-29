package calculator;

import java.util.ArrayList;

public class Calculator {
    public ArrayList<Double> resultArray;
    public Calculator() {
        resultArray = new ArrayList<>();
    }


    // 계산기 메소드
    public double calculate(char oper, int num1, int num2) throws CalException{

        double result = 0;

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
