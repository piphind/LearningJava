package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;

        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result -1;

        System.out.println(previousResult + " - 1  = " + result);

        previousResult = result;

        result = result * 10;

        System.out.println(previousResult + " * 10  = " + result);

        previousResult = result;

        result = result / 5;

        System.out.println(previousResult + " / 5  = " + result);

        previousResult = result;

        result = result % 3;

        System.out.println(previousResult + " % 3  = " + result);

        previousResult = result;

        result = result + 1;

        System.out.println(previousResult + " + 1  = " + result);

        previousResult = result;

        result++;

        System.out.println(previousResult + " ++  = " + result);

        previousResult = result;

        result--;

        System.out.println(previousResult + " --  = " + result);

        previousResult = result;

        result += 2;

        System.out.println(previousResult + " += 2  = " + result);

        previousResult = result;

        result *= 10;

        System.out.println(previousResult + " *= 10  = " + result);

        previousResult = result;

        result -= 10;

        System.out.println(previousResult + " -= 10  = " + result);

        previousResult = result;

        result /= 10;

        System.out.println(previousResult + " /= 10  = " + result);

        int topScore = 100;

        if (topScore == 100)
            System.out.println("Well done. You got the top score");


        int lowerBoundary = 10;
        int higherBoundary = 20;

        int score = 9;

        if ((score < higherBoundary) && (score>lowerBoundary))
            System.out.println("Your Score of  " + score + " is between " + lowerBoundary + " and " + higherBoundary);

        if (score < lowerBoundary)
            System.out.println("Your Score of  " + score + " is lower than  " + lowerBoundary);

        boolean isMale = true;

        if (isMale)
            System.out.println("I am a man!!");

        boolean himMale = isMale ? true : false;

        System.out.println(himMale);
    }

}
