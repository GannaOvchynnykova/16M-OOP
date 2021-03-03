package dao;

import data.Fraction;

public class Math {
    public static Fraction squareRoot(Fraction a){  // kvadratnii koren
        int cNumerator = 0;
        int cDenominator = 0;
        for (int i = 1; i <= 99; i++) {
            if (a.getNumerator() / i == i){
                cNumerator = i;
            }
        }
        for (int i = 1; i <= 99; i++) {
            if (a.getDenominator() / i == i){
                cDenominator = i;
            }
        }

        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction exponentiation (Fraction a, int exponent){  // vosvedenie v stepen
        int cNumerator = 1;
        int cDenominator = 1;
        for (int i = 1; i <= exponent; i++) {
            cNumerator = cNumerator * a.getNumerator();
        }
        for (int i = 1; i <= exponent; i++) {
            cDenominator = cDenominator * a.getDenominator();
        }

        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction division (Fraction a, Fraction b){  // delenie
        int cNumerator;
        int cDenominator;

        cNumerator = (a.getNumerator()*b.getDenominator());
        cDenominator = (a.getDenominator()*b.getNumerator());

        int reduction = gcdRecursionAlgorithm(cNumerator, cDenominator);

        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator / reduction;

        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction multiplication (Fraction a, Fraction b){ // ymnojenie
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

    public static Fraction subtraction (Fraction a, Fraction b){  // vichitanie
        int cNumerator;
        int cDenominator;

        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        cNumerator = a.getNumerator()* cDenominator /
                a.getDenominator() - b.getNumerator() * cDenominator / b.getDenominator();

        int reduction = gcdRecursionAlgorithm(cNumerator, cDenominator);

        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator / reduction;

        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction addition(Fraction a, Fraction b){  // summa
        int cNumerator;
        int cDenominator;

        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator()); //polychili c
        cNumerator = a.getNumerator() * cDenominator /
                a.getDenominator() + b.getNumerator() * cDenominator / b.getDenominator(); //summa chislitel

        int reduction = gcdRecursionAlgorithm(cNumerator, cDenominator);

        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator / reduction;

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
