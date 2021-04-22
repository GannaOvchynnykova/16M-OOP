package telran.innerClasses.ShadowTest;

public class ShadowAppl {
    public static void main(String[] args) {

        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel firstLevel = st.new FirstLevel();
        firstLevel.methodInFirstLevel(333);
    }
}
