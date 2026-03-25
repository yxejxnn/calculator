package step3;

import java.util.ArrayList;

public class Calculator<T > {

    // 연산 결과들을 저장할 리스트
    private ArrayList<T> results = new ArrayList<>();

    // 입력 받은 정수와 연산자를 사용해서 계산을 수행할 메서드
    public T calculate(T num1, T num2, OpType opType) {
        T result = null; // 계산 결과를 저장할 변수

        // 정수 계산
        if (num1 instanceof Integer && num2 instanceof Integer) {
            Integer n1 = (Integer) num1;
            Integer n2 = (Integer) num2;

            switch (opType) {
                case ADD:
                    result = (T) Integer.valueOf(n1 + n2);
                    break;
                case SUBTRACT:
                    result = (T) Integer.valueOf(n1 - n2);
                    break;
                case MULTIPLY:
                    result = (T) Integer.valueOf(n1 * n2);
                    break;
                case DIVIDE:
                    if (n2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                    else {
                        result = (T) Integer.valueOf(n1 / n2);
                    }
                    break;
            }
        }

        // 실수 계산
        else if (num1 instanceof Double && num2 instanceof Double) {
            Double n1 = (Double) num1;
            Double n2 = (Double) num2;

            switch (opType) {
                case ADD:
                    result = (T) Double.valueOf(n1 + n2);
                    break;
                case SUBTRACT:
                    result = (T) Double.valueOf(n1 - n2);
                    break;
                case MULTIPLY:
                    result = (T) Double.valueOf(n1 * n2);
                    break;
                case DIVIDE:
                    if (n2 == 0.0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                    else {
                        result = (T) Double.valueOf(n1 / n2);
                    }
                    break;
            }
        }

        // 계산 결과 반환
        return result;
    }

    // 저장된 계산 결과들을 보여주는 메서드 (Getter)
    public ArrayList<T> getResults() {
        return results;
    }

    // 가장 먼저 저장된 결과를 삭제하는 메서드
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}
