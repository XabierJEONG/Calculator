package calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Double> resultArray = new ArrayList<>();

    public double calculate(String oper, int num1, int num2) throws CalException{

        double result = 0;

        if (oper.equals("+")) {
            result = num1 + num2;
        } else if (oper.equals("-")) {
            result = num1 - num2;
        } else if (oper.equals("*")) {
            result = num1 * num2;
        } else if (oper.equals("/")) {
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
