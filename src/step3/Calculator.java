package step3;

import java.util.ArrayList;

public class Calculator {

    // 연산 결과들을 저장할 리스트
    private ArrayList<Integer> results = new ArrayList<>();

    // 입력 받은 정수와 연산자를 사용해서 계산을 수행할 메서드
    public int calculate(int num1, int num2, OpType opType) {
        int result = 0; // 계산 결과를 저장할 변수

        // 연산 기능
        switch (opType) {
            case ADD:
                result = num1 + num2;
                results.add(result);
                break;
            case SUBTRACT:
                result = num1 - num2;
                results.add(result);
                break;
            case MULTIPLY:
                result = num1 * num2;
                results.add(result);
                break;
            case DIVIDE:
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                else {
                    result = num1 / num2;
                    results.add(result);
                }
                break;
        }

        // 계산 결과 반환
        return result;
    }

    // 저장된 계산 결과들을 보여주는 메서드 (Getter)
    public ArrayList<Integer> getResults() {
        return results;
    }

    // 가장 먼저 저장된 결과를 삭제하는 메서드
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}
