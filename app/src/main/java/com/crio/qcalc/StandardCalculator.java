
package com.crio.qcalc;


public class StandardCalculator {


    public static void getVersion(){

        System.out.println("Standard Calculator 1.0");

    }
private int result;


public void add(int num1,int num2){
    int res = num1+num2;
    setResult(res);
}

public void sub(int num1,int num2){
    int res = num1-num2;
    setResult(res);
}

public void mul(int num1,int num2){
    int res = num1*num2;
    setResult(res);
}

public void div(int num1,int num2){
    int res = num1/num2;
    setResult(res);
}

public int getResult(){
    return result;
}

private void setResult(int value){
    this.result = result;
}

public void clearResult(){
    result =0;
}

}
