package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double GetAdditionResult(){
        double sum = firstNumber + secondNumber;
        System.out.println("Sum is "+ sum);
        return sum;
    }
    public void GetSubtractionResult(){
        double diff =  secondNumber - firstNumber;
        System.out.println("Difference is "+ diff);
    }
    public void GetMultiResult(){
        double product = firstNumber * secondNumber;
        System.out.println("Product is "+ product);
    }
    //can also be done in the following way
    public void GetDivisionResult(){
        double quo = this.getSecondNumber()/this.getFirstNumber()  ;
        System.out.println("Quotient is "+ quo);
    }


}
