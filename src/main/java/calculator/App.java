package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double[] resultArray = new double[10];
        double[] newResultArray = new double[resultArray.length - 1];
        int index = 0;
        int indexRemove = 0;

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
                continue;
            }
            System.out.println("결과: " + result);

            if (index < resultArray.length) {
                resultArray[index] = result;
                index++;
            }

            for (int i = 0, j = 0; i < resultArray.length; i++) {
                if (i != indexRemove) {
                    newResultArray[j++] = resultArray[i];
                }
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }
        }
        System.out.println("배열 저장확인: " + Arrays.toString(resultArray));
    }
}