package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Double> resultArray = new ArrayList<>();
        Calculator calculator = new Calculator(resultArray);
        Scanner sc = new Scanner(System.in);

        // 숫자, 연산자 입력
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char oper = sc.next().charAt(0);

            try {
                double result = calculator.calculate(oper, num1, num2);
                System.out.println("결과 : " + calculator.getResult());
            } catch (CalException e) {
                System.out.println("에러 : " + e.getMessage());
            }

//            //set 메소드
//            calculator.setResult(3);
//            System.out.println(calculator.getResult());

            // 연산결과 삭제여부.
            System.out.print("가장 먼저 저장된 연산결과를 삭제하시겠습니까? (remove 입력) ");
            String remove = sc.next();
            calculator.removeResult(remove);


            //연산결과 조회.
            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
            String inquiry = sc.next();
            calculator.inquiryResults(inquiry);

            // 추가 계산여부.
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;

            }
        } sc.close();
    }
}