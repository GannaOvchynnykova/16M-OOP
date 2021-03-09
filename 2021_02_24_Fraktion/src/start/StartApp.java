package start;

import dao.Math;
import data.Fraction;

public class StartApp {
    public static void main(String[] args) {
        Fraction myFirstLovelyFraction = new Fraction(9, 100);
        System.out.println(myFirstLovelyFraction);

        Fraction mySecondLovelyFraction = new Fraction(7, 9);
        System.out.println(mySecondLovelyFraction);

        Fraction resultAddition = Math.addition(myFirstLovelyFraction, mySecondLovelyFraction);
        System.out.println("Addition - " + resultAddition);

        Fraction resultSubtraction = Math.subtraction(myFirstLovelyFraction, mySecondLovelyFraction);
        System.out.println("Subtraction - " + resultSubtraction);

        Fraction resultMultiplication = Math.multiplication(myFirstLovelyFraction, mySecondLovelyFraction);
        System.out.println("multiplication - " + resultMultiplication);

        Fraction resultDivision = Math.division(myFirstLovelyFraction, mySecondLovelyFraction);
        System.out.println("Division - " + resultDivision);

        Fraction resultExponentiation = Math.exponentiation(myFirstLovelyFraction, 3);
        System.out.println("Exponentiation - " + resultExponentiation);

        Fraction resultSquareRoot = Math.squareRoot(myFirstLovelyFraction);
        System.out.println("Extraction - " + resultSquareRoot);

    }
}
