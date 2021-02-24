package start;

import Calculator.Math;
import Data.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction myFirstLovelyFraction = new Fraction(3, 5);
        System.out.println(myFirstLovelyFraction);

        Fraction fr2 = new Fraction(7, 9);
        System.out.println(fr2);

        Fraction resultAddition = Math.addition(myFirstLovelyFraction, fr2);
        System.out.println("Addition - " + resultAddition);

        Fraction resultSubtraction = Math.subtraction(myFirstLovelyFraction, fr2);
        System.out.println("Subtraction - " + resultSubtraction);

        Fraction resultMultiplication = Math.multiplication(myFirstLovelyFraction, fr2);
        System.out.println("multiplication - " + resultMultiplication);

        Fraction resultDivision = Math.division(myFirstLovelyFraction, fr2);
        System.out.println("Division - " + resultDivision);

    }
}
