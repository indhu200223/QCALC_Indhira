/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package com.crio.qcalc;

public class App{

public static void main(String[] args) {
    
    System.out.println(((App) new App()).getGreeting());;
    
    ScientificCalculator calc = new ScientificCalculator();

    double result= calc.cubeOf(4.0);

    System.out.println("cube =" + result);

}
public String getGreeting(){
    return "Hello World!";
}
}