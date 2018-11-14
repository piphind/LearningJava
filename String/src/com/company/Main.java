package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "Hello, This is a string";
        System.out.println("myString is equal to... " + myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00AE 2015";
        System.out.println(myString);

        String numberString1 = "100";
        String numberString2 = "200";
        System.out.println(numberString1 + numberString2);

        String lastString = "10";
        int myInt = 50;
        lastString = myInt + lastString;

        System.out.println(lastString);
    }
}
