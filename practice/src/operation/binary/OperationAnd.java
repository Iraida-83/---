package operation.binary;

public class OperationAnd implements BinaryOperation{
    @Override
    public String getName() {
        return "И";
    }

    @Override
    public String getSymbol() {
        return "&";
    }

    @Override
    public int getResult(int a, int b) {
        return a & b;
    }
}
