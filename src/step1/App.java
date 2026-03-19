package step1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 스캐너 호출
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 정수와 두 번째 정수를 입력받음
        System.out.print("첫 번째 정수 입력 : ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int num2 = scanner.nextInt();

        // 연산자를 입력받음
        System.out.print("연산자 입력 (+ - * /) : ");
        char op = scanner.next().charAt(0); // 입력 받은 문자열의 첫 번째 문자를 저장

        // 계산 결과를 저장할 변수
        int result = 0;

        // 입력 받은 값을 계산함
        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("결과 : " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("결과 : " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("결과 : " + result);
                break;

            case '/':
                // 나눗셈에서는 두 번째에 입력 받는 수는 0이 올 수 없음
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                else {
                    result = num1 / num2;
                    System.out.println("결과 : " + result);
                }
                break;

            default:
                System.out.println("잘못된 연산자 입니다.");
        }

    }
}
