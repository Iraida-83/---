package operation.binary;

public class OperationOr implements BinaryOperation{
    @Override
    public String getName() {
        return "ИЛИ";
    }

    @Override
    public String getSymbol() {
        return "|";
    }

    @Override
    public int getResult(int a, int b) {
        return a | b;
    }
}
