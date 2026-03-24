package step3;

public enum OpType {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    // 입력한 연산자 문자를 OpType으로 변환
    public static OpType fromChar(char op) {
        switch (op) {
            case '+':
                return ADD;
            case '-':
                return SUBTRACT;
            case '*':
                return MULTIPLY;
            case '/':
                return DIVIDE;
            default:
                return null;
        }
    }
}
