package com.aimer.shd.designmode_factory;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Operation oper = OperationFactory.createOperation("/");
        oper.numA = 5;
        oper.numB = 3;
        double result ;
        try {
            result = oper.getResult();
            Log.d("Factory", "结果是：" + result);
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("Factory", "结果是：" + e.toString());
        }
    }


}
