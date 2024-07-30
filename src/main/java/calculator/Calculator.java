package calculator;

import java.util.ArrayList;

public class Calculator {
    // 필드
    protected ArrayList<Double> resultArray;
    protected ArrayList<Double> pieResultArray;
    protected double result;
    protected double pieResult;
    final double PI = 3.14; // 원주율은 변하지 않는 상수이기에 fianl 사용.

    // 생성자
    public Calculator() {
        this.resultArray = new ArrayList<>();
        this.pieResultArray = new ArrayList<>();
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
