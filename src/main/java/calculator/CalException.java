package calculator;

public class CalException extends Exception {
    public CalException() {
        super("잘못된 입력값입니다.");
    }
}
