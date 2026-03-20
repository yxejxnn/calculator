package step2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 스캐너 호출
        Scanner scanner = new Scanner(System.in);

        // Calculator 객체 생성
        Calculator calculator = new Calculator();

        // 무한반복
        while (true) {

            // 첫 번째 정수와 두 번째 정수를 입력받음
            System.out.print("첫 번째 정수 입력 : ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 정수 입력 : ");
            int num2 = scanner.nextInt();

            // 연산자를 입력받음
            System.out.print("연산자 입력 (+ - * /) : ");
            char op = scanner.next().charAt(0); // 입력 받은 문자열의 첫 번째 문자를 저장

            // Carculator 클래스로 계산 수행
            int result = calculator.calculate(num1, num2, op);
            // 0으로 나눴을 때 결과에 0이 출력 되지 않게 해줌
            if (!(op == '/' && num2 == 0)) {
                System.out.println("결과 : " + result);
            }

            // 반복문 종료 조건 : exit 입력 시 종료
            System.out.print("계산을 계속 하겠습니까? (exit 입력 시 종료) : ");
            String answer = scanner.next();
            if (answer.equals("exit")) { // 문자열 비교는 equals() 사용!
                break;
            }
        }
    }
}
