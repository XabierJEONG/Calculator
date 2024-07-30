package calculator;

import java.util.ArrayList;

public class Calculator {

    // 필드
    private ArrayList<Double> resultArray;
    private ArrayList<Double> pieResultArray;
    private double result;
    private double pieResult;
    final double PI = 3.14; // 원주율은 변하지 않는 상수이기에 fianl 사용.

    // 생성자
    public Calculator(ArrayList<Double> resultArray, ArrayList<Double> pieResultArray) {
        this.resultArray = resultArray;
        this.pieResultArray = pieResultArray;
    }

    // 원 넓이 계산기 메소드
    public double pieCalculate(int radNum1) throws CalException {
        if (radNum1 != 0) {
            pieResult = radNum1 * radNum1 * PI;
        }
        pieResultArray.add(pieResult);
        return pieResult;
    }

    // 원 넓이 getter 메소드
    public double getPieResult() {
        return pieResult;
    }
    // 원 넓이 setter 메소드
    public void setPieResult(double pieResult) {
        this.pieResult = pieResult;
    }
    // 원 넓이 삭제 메소드
    public void removePieResult(String remove) {
        if (remove.equals("remove")) {
            pieResultArray.remove(0);
        }
    }
    // 원 넓이 컬렉션 필드의 저장된 결과값 조회
    public void inquiryPieResults(String inquiry) {
        if (inquiry.equals("inquiry")) {
            System.out.println(pieResultArray);
        }
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

    // 사칙연산 getter 메소드
    public double getResult() {
        return result;
    }
    // 사칙연산 setter 메소드
    public void setResult(double result) {
        this.result = result;
    }
    // 사칙연산 삭제 메소드
    public void removeResult(String remove) {
        if (remove.equals("remove")) {
            resultArray.remove(0);
        }
    }
    // 사칙연산 컬렉션 필드의 저장된 결과값 조회
    public void inquiryResults(String inquiry) {
        if (inquiry.equals("inquiry")) {
            System.out.println(resultArray);
        }
    }
}
