public class Factorial {
    // 7! = 7 * (8-1) * 5 * 4 * 3 * 2 * 1
    public int findFactorial( int n){
        if (n == 1) return 1;
        return n * findFactorial(n - 1);
    }
}

class TestFactorial{
    public static void main(String[] args) {
        Factorial fac1 = new Factorial();
        System.out.println(fac1.findFactorial(1));
        System.out.println(fac1.findFactorial(2));
        System.out.println(fac1.findFactorial(3));
    }
}
