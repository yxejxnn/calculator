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

    }
}
