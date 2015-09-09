package com.aimer.shd.designmode_factory;

/**
 * Created by shd on 2015/9/9.
 */
public class OperationAdd extends Operation {

    public OperationAdd(){}
    @Override
    public double getResult() {
        return numA + numB;
    }
}
