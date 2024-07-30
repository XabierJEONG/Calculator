package calculator;

public class CircleCalculator extends Calculator {
    // 생성자
    public CircleCalculator() {
        super();
    }
    // 원 넓이 계산 메소드
    public double pieCalculate(double rad) throws CalException {
        if (rad != 0) {
            double pieResult = PI * rad * rad;
            pieResultArray.add(pieResult);
            return pieResult;
        } else if (rad == 0) {
            throw new CalException("유효한 입력값이 아닙니다.");
        }
        pieResultArray.add(result);
        return pieResult;
    }

}
