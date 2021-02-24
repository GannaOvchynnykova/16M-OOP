package Calculator;

import Data.Fraction;

public class Math {
    public static Fraction division (Fraction a, Fraction b){
        int cNumerator;
        int cDenominator;
        cNumerator = (a.getNumerator()*b.getDenominator());
        cDenominator = (a.getDenominator()*b.getNumerator());

        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction multiplication (Fraction a, Fraction b){
        int cNumerator;
        int cDenominator;
        cNumerator = (a.getNumerator() * b.getNumerator());
        cDenominator = (a.getDenominator() * b.getDenominator());
        int reduction = gcdRecursionAlgorithm(cNumerator, cDenominator);
        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator / reduction;
                Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction subtraction (Fraction a, Fraction b){
        int cNumerator;
        int cDenominator;

        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        cNumerator = (a.getNumerator()*a.getDenominator() - b.getNumerator());

        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction addition(Fraction a, Fraction b){
        int cNumerator;
        int cDenominator;

        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator()); //polychili c

        cNumerator = (a.getNumerator() * b.getDenominator()) + (b.getNumerator() * a.getDenominator()); //summa chislitel

        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static int gcdRecursionAlgorithm(int aDenominator, int bDenominator) {
        if (bDenominator == 0) {
            return aDenominator;
        }
        return gcdRecursionAlgorithm(bDenominator, aDenominator % bDenominator);
    }

    // нахождение НОК
    public static int leastCommonMultiple(int aDenominator, int bDenominator) {
        return aDenominator / gcdRecursionAlgorithm(aDenominator, bDenominator) * bDenominator;
    }

}
