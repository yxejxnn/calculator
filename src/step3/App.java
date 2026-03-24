package step3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("첫 번째 정수 입력 : ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 정수 입력 : ");
            int num2 = scanner.nextInt();
            System.out.println("연산자 입력 (+ - * /) : ");
            char op = scanner.next().charAt(0);

            // 연산자를 OpType으로 변환
            OpType opType = OpType.fromChar(op);

            // Calculator 클래스를 이용해 계산 수행
            int result = calculator.calculate(num1, num2, op);

            // 0으로 나누는 경우가 아닐 때만 결과 출력
            if (!(op == '/' && num2 == 0)) {
                System.out.println("결과 : " + result);
            }

            // 저장된 결과 목록 출력
            System.out.println("저장된 결과 : " + calculator.getResults());

            // 삭제 여부 입력
            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? (yes 입력 시 삭제) : ");
            String removeAnswer = scanner.next();
            if (removeAnswer.equals("yes")) {
                calculator.removeResult();
                System.out.println("삭제 후 결과 : " + calculator.getResults());
            }

            // 종료 여부 입력
            System.out.println("계산을 계속 하겠습니까? (exit 입력 시 종료) : ");
            String answer = scanner.next();

            if (answer.equals("yes")) {
                break;
            }

        }
    }
}
