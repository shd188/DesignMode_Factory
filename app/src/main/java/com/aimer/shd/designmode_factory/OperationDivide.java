package com.aimer.shd.designmode_factory;

/**
 * Created by shd on 2015/9/9.
 */
public class OperationDivide extends Operation {


    @Override
    public double getResult() {
        if (numB==0)
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        return numA / numB;

    }
}
