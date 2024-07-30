package calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> resultArray;
    private double result;
    public Calculator() {
        resultArray = new ArrayList<>();
    }
    // 계산기 메소드
    public double calculate(char oper, int num1, int num2) throws CalException{

        if (num2 == 0) {
            throw new CalException();
        }

        if (oper == '+') {
            result = num1 + num2;
        } else if (oper == '-') {
            result = num1 - num2;
        } else if (oper == '*') {
            result = num1 * num2;
        } else if (oper == '/') {
            result = num1 / num2;
        } else {
            throw new CalException();
        }
        resultArray.add(result);
        return result;
    }

    // getter 메소드
    public double getResult() {
        return result;
    }
    // setter 메소드
    public void setResult(double result) {
        this.result = result;
    }

//    값 확인
//    public ArrayList<Double> getResultArray() {
//        return resultArray;
//    }

    //삭제 메소드
    public void removeResult(String remove) {
        if (remove.equals("remove")) {
            resultArray.remove(0);
        }
    }

    public void inquiryResults(String inquiry) {
        if (inquiry.equals("inquiry")) {
            System.out.println(resultArray);
        }
    }
}
