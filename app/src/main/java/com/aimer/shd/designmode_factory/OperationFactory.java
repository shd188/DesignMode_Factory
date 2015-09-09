package com.aimer.shd.designmode_factory;

/**
 * Created by shd on 2015/9/9.
 */
public class OperationFactory {
    public static Operation createOperation(String type) {
        Operation operation = null;
        switch (type) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSubtract();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDivide();
                break;

        }
        return operation;
    }
}
