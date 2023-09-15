package qcalc.com.crio;

public class StandardCalculator {

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
private int result;

public int add(int num1, int num2){
    int res = num1 + num2;
    setResult(res);
    return res;
}

public void subtract(int num1, int num2){
    int res = num1 - num2;
    setResult(res);
}

public void multiply(int num1, int num2){
    int res = num1 * num2;
    setResult(res);
}

public void divide(int num1, int num2){
    int res = num1 / num2;
    setResult(res);
}

public int getResult(){
    return result;
}

private void setResult(int value){
    this.result = value;
}

public void clearResult(){
    result =0;
}

public void printResult(){
    System.out.println("Standard Calculator Result:" + getResult());
}

}
