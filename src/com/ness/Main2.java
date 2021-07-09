package com.ness;

public class Main2 {

    public static void main(String[] args) {
//        Car porsche = new Car();
//        //Car porsche;
//        porsche.model = "CarreraXX";
//
//        //porsche = null;
//        System.out.println("Model is : " + porsche.getModel());
//        porsche.setModel("922");
//        System.out.println("Model is : " + porsche.getModel());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }

}
