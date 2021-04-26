public class ThrowTest {
    public static void main(String[] args) {

        int age = 15;
        try {
            boolean res = checkAge(age);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean checkAge(int age) throws Exception {
        if (age <= 18) throw new Exception("The age must be greater 18");
        return true;
    }
}
