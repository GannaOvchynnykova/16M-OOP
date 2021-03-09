package data;
import dao.Math;
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator= " + numerator +
                ", denominator= " + denominator +
                '}';
    }

    public Fraction(Fraction a, Fraction b, char arithmeticOperationSymbol) {
        Fraction frResult = Math.addition(a, b);
        this.numerator = frResult.getNumerator();
        this.denominator = frResult.getDenominator();
    }

    public void addAnotherFraction(Fraction b) {
        int d = Math.leastCommonMultiple(this.denominator, b.getDenominator());
        int n = this.numerator * d / this.denominator + b.getNumerator() * d / b.getDenominator();
        this.denominator = d / reduction(n, d);
        this.numerator = n / reduction(n, d);
    }

    public void subtractFraction(Fraction b) {
        int d = Math.leastCommonMultiple(this.denominator, b.getDenominator());
        int n = this.numerator * d / this.denominator - b.getNumerator() * d / b.getDenominator();
        this.denominator = d / reduction(n, d);
        this.numerator = n / reduction(n, d);
    }

    public void multiplyFraction(Fraction b) {
        int d = this.denominator * b.getDenominator();
        int n = this.numerator * b.getNumerator();
        this.denominator = d / reduction(n, d);
        this.numerator = n / reduction(n, d);
    }

    public void divideFraction(Fraction b) {
        int d = this.denominator * b.getNumerator();
        int n = this.numerator * b.getDenominator();
        this.denominator = d / reduction(n, d);
        this.numerator = n / reduction(n, d);
    }


    private void reduction() {
        int indexReduction = reduction(this.numerator, this.denominator);
        setNumerator(this.numerator / indexReduction);
        setDenominator(this.denominator / indexReduction);
    }

    private int reduction(int n, int d) {
        int reduction = Math.gcdRecursionAlgorithm(n, d);
        //нод
        return reduction;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}