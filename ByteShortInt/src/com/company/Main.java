package com.company;

public class Main {

    public static void main(String[] args) {


    int myMinValue = -2_147_483_648;
    int myMaxValue = 2_147_483_647;
    int intResult = (myMinValue/2);

    System.out.println("Minimum 'int' value = " + myMinValue);
    System.out.println("Maximum 'int' value = " + myMaxValue);
    System.out.println("Divide 'Minimum Value' by 2 = " + intResult);

    byte myByteMin = -128;
    byte myByteMax = 127;
    byte byteResult = (byte) (myByteMin/2);

    System.out.println("Minimum 'byte' value = " + myByteMin);
    System.out.println("Maximum 'byte' value = " + myByteMax);
    System.out.println("Divide 'Minimum Value' by 2 = " + byteResult + " (Cast Required to store value in a 'byte' field");

    short myShortMin = -32_768;
    short mySHortMax = 32_767;

    System.out.println("Minimum 'short' value = " + myShortMin);
    System.out.println("Maximum 'short' value = " + mySHortMax);

    long myLongMin = -9_223_372_036_854_775_808L;
    long myLongMax = 9_223_372_036_854_775_807L;

    System.out.println("Minimum 'long' value = " + myLongMin);
    System.out.println("Maximum 'long' value = " + myLongMax);

    System.out.println("CHALLENGE");

    byte byteVar = 1;
    short shortVar = 1;
    int intVar = 1;

    long longVar = (50000L + 10L * (byteVar + shortVar + intVar));

    System.out.println("My answer is " + longVar);


    }
}
