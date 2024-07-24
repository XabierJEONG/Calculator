package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char oper = sc.next().charAt(0);

            int result = 0;

            if (oper == '+') {

                result = num1 + num2;

            } else if (oper == '-') {

                result = num1 - num2;

            } else if (oper == '*') {

                result = num1 * num2;

            } else if (oper == '/') {

                result = num1 / num2;

            } else {
                System.out.println("유효하지 않은 연산자 입니다.");
            }

            System.out.println("결과: " + result);

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            } else if (!exit.equals("exit")) {
                System.out.println("유효하지 않은 입력입니다.");
                break;
            } else {}
        }
    }
}
