package com.company;

public class Main {

    public static void main(String[] args) {

        //as we created an instance of the class,
        // hence not using "static" word while creating our methods in SimpleCalculator class.

        SimpleCalculator riaCalc = new SimpleCalculator();
        riaCalc.setFirstNumber(3);
        riaCalc.setSecondNumber(9);
        riaCalc.GetAdditionResult();
        riaCalc.GetSubtractionResult();
        riaCalc.GetMultiResult();
        riaCalc.GetDivisionResult();







    }
}
