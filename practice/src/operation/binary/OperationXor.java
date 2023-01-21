package operation.binary;

public class OperationXor implements BinaryOperation{
    @Override
    public String getName() {
        return "Исключающее ИЛИ";
    }

    @Override
    public String getSymbol() {
        return "^";
    }

    @Override
    public int getResult(int a, int b) {
        return a ^ b;
    }
}
