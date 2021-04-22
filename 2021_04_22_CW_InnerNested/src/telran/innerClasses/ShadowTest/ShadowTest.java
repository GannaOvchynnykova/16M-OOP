package telran.innerClasses.ShadowTest;

public class ShadowTest {
    private int x = 0;
    private int y = 100500;

    class FirstLevel {
        private int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this x = " + this.x);
            System.out.println("ShadowTest this x = " + ShadowTest.this.x);
            System.out.println("ShadowTest y = " + y);
        }
    }
}
