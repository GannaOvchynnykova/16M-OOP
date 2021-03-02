package lessonStart;

public class CalculatorMath {
    public static int arithmeticOperator(int a, int b, char c){
        switch (c){
            case '+':
                return addition(a,b);
            case '-':
                return substraction(a, b);
            case '/':
                return (int) devide(a,b);
            case '*':
                return multiply(a,b);
            default:
                return -1;
        }
    }

    private static int multiply(int a, int b) {
        return a*b;
    }

    private static double devide(int a, int b) {
        double x = a;
        double y = b;
        return a/b;
    }

    private static int substraction(int a, int b) {
        return a-b;
    }

    private static int addition(int a, int b) {
        return a+b;
    }
}

class Test{
    public static void main(String[] args) {
        CalculatorMath.arithmeticOperator(10, 20, '+');
        CalculatorMath.arithmeticOperator(30, 24, '-');
    }
}
