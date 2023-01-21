package operation.binary;

public class OperationSchaeffersStroke implements BinaryOperation{
    @Override
    public String getName() {
        return "Штрих Шеффера";
    }

    @Override
    public String getSymbol() {
        return "/";
    }

    @Override
    public int getResult(int a, int b) {
        String y = Integer.toBinaryString(a & b);
        String result = "";
        for(char i: y.toCharArray()){
            if (i == '1')
                result += "0";
            else
                result += "1";
        }
        return Integer.parseInt(result);
    }
}
