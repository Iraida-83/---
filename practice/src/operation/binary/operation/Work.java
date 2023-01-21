package operation.binary.operation;

import operation.binary.*;

import java.util.ArrayList;
import java.util.List;

public class Work {
    public static void BinaryOperation(){
        int a = 5;
        int b = 6;

        OperationAnd operationAnd = new OperationAnd();
        OperationOr operationOr= new OperationOr();
        OperationXor operationXor = new OperationXor();
        OperationSchaeffersStroke operationSchaeffersStroke = new OperationSchaeffersStroke();

        List<BinaryOperation> binaryOperationList = new ArrayList<>();
        binaryOperationList.add(operationAnd);
        binaryOperationList.add(operationOr);
        binaryOperationList.add(operationXor);
        binaryOperationList.add(operationSchaeffersStroke);

        for (BinaryOperation i: binaryOperationList){
            System.out.println(i.getName() + " 5 " + i.getSymbol() + " 6 = " + i.getResult(a, b));
        }
    }
}
