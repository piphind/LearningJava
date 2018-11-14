package com.company;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5;
        int intDivideValue = 5/3;

        float myFloatValue = 5F;
        float floatDivideValue = 5F / 3F;

        double myDoubleValue = 5D;
        double doubleDivideValue = 5D / 3D;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("intDivideValue = " + intDivideValue);
        System.out.println("floatDivideValue = " + floatDivideValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("doubleDivideValue = " + doubleDivideValue);

        System.out.println("CHALLENGE");

        double poundsValue = 200D;
        double kgValue = poundsValue * 0.45359237D;

        System.out.println(poundsValue + " lbs = " + kgValue + " Kg(s)");

    }
}
