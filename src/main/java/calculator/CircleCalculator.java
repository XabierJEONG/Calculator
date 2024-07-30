package calculator;

public class CircleCalculator extends Calculator {



    // 생성자
    public CircleCalculator() {
        super();
    }

    // 원 넓이 계산기 메소드
    public double pieCalculate(double radNum1) throws CalException {
        if (radNum1 != 0) {
            pieResult = radNum1 * radNum1 * PI;
        }
        pieResultArray.add(pieResult);
        return pieResult;
    }

}