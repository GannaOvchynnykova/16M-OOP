package telran.appl;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Start program");
        Integer x;
        Integer y;
        try {
            x = getNumbers(args[0]);
            y = getNumbers(args[1]);
            System.out.println("Number x =  " + x);
            System.out.println("Number y =  " + y);
            System.out.println("Sum : x + y =  " + (x + y));
            System.out.println("Subtraction : x - y =  " + (x - y));
            System.out.println("Division : x / y =  " + (x / (y * 1.)));
            System.out.println("Multiplication : x * y =  " + x * y);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " Index 0 out of bounds for length 0");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Args not number");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage() + " Arithmetic Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " All exception");
        }
        System.out.println("End program");
    }

    private static Integer getNumbers(String arg) {
        return Integer.parseInt(arg);
    }
}
