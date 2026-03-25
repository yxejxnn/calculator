package step3;

import java.util.ArrayList;

public class Calculator<T > {

    // 연산 결과들을 저장할 리스트
    private ArrayList<T> results = new ArrayList<>();

    // 입력 받은 정수와 연산자를 사용해서 계산을 수행할 메서드
    public T calculate(T num1, T num2, OpType opType) {
        T result = null; // 계산 결과를 저장할 변수
        Number n1 = (Number) num1;
        Number n2 = (Number) num2;

        double result2 = 0; // 계산 중 사용할 변수

        switch (opType) {
            case ADD:
                result2 = n1.doubleValue() + n2.doubleValue();
                break;
            case SUBTRACT:
                result2 = n1.doubleValue() - n2.doubleValue();
                break;
            case MULTIPLY:
                result2 = n1.doubleValue() * n2.doubleValue();
                break;
            case DIVIDE:
                if (n2.doubleValue() == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                else {
                    result2 = n1.doubleValue() / n2.doubleValue();
                }
                break;
        }

        // 계산 결과를 입력 타입에 맞게 변환
        if (num1 instanceof Integer && num2 instanceof Integer) {
            result = (T) Integer.valueOf((int) result2);
        }
        else if (num1 instanceof Double && num2 instanceof Double) {
            result = (T) Double.valueOf(result2);
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
