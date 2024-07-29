package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Double> resultArray = new ArrayList<>();
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        // 계산 반복
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char oper = sc.next().charAt(0);

            double result = 0;

            System.out.println("결과: " + result);

            // 연산결과 삭제여부.
            System.out.print("가장 먼저 저장된 연산결과를 삭제하시겠습니까? (remove 입력) ");
            String remove = sc.next();
            if (remove.equals("remove")) {
                resultArray.remove(0);
            }

            //연산결과 조회.
            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
            String inquiry = sc.next();
            if (inquiry.equals("inquiry")) {
                for (double resultArrays: resultArray) {
                    System.out.println(resultArrays);
                }
            }

            // 추가 계산여부.
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}