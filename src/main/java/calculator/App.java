package calculator;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();
        Scanner sc = new Scanner(System.in);

        // 숫자, 연산자 입력
        while (true) {
            System.out.print("사칙연산을 원하시면 '0'을, 원의 너비를 원하시면 '1'을 입력하세요 : ");
            int choice = sc.nextInt();

            // 사칙연산
            if (choice == 0) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char oper = sc.next().charAt(0);

                try {
                    double result = arithmeticCalculator.calculate(oper, num1, num2);
                    arithmeticCalculator.setResult(result);
                    System.out.println("결과 : " + arithmeticCalculator.getResult());
                } catch (CalException e) {
                    System.out.println("에러 : " + e.getMessage());
                }

                // 연산결과 삭제여부.
                System.out.print("가장 먼저 저장된 연산결과를 삭제하시겠습니까? (remove 입력) ");
                String remove = sc.next();
                arithmeticCalculator.removeResult(remove);

                //연산결과 조회.
                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
                String inquiry = sc.next();
                arithmeticCalculator.inquiryResults(inquiry);

                // 추가 계산여부.
                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
                String exit = sc.next();
                if (exit.equals("exit")) {
                    break;
                }
            // 원넓이 계산
            } else if (choice == 1) {
                System.out.print("원의 반지름을 입력하세요: ");
                double num = sc.nextDouble();
                try {
                    double result = circleCalculator.pieCalculate(num);
                    circleCalculator.setPieResult(result);
                    System.out.println("결과 : " + circleCalculator.getPieResult());
                } catch (CalException e) {
                    System.out.println("에러: " + e.getMessage());
                }
                // 연산결과 삭제여부.
                System.out.print("가장 먼저 저장된 연산결과를 삭제하시겠습니까? (remove 입력) ");
                String remove = sc.next();
                circleCalculator.removePieResult(remove);

                //연산결과 조회.
                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
                String inquiry = sc.next();
                circleCalculator.inquiryPieResults(inquiry);

                // 추가 계산여부.
                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
                String exit = sc.next();
                if (exit.equals("exit")) {
                    break;
                }
            }
        }sc.close();
    }
}