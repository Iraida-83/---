package operation.binary;

public interface BinaryOperation {
    String getName();
    String getSymbol();
    int getResult(int a, int b);
}
