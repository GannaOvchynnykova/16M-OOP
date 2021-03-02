package Exercise;

public class TestSolution {
    public static void main(String[] args) {

        Solution sol1 = new Solution();

        sol1.firstHalf("WooHoo");
        if (sol1.firstHalf("WooHoo").equals("Woo")){
            System.out.println("Ok");
        }else {
            System.out.println("Defect");
        }

        if (!sol1.firstHalf("WooHoo").equals("Andrei")){
            System.out.println("Ok");
        }else {
            System.out.println("Defect");
        }
        sol1.nonStart("Hello", "There");
    }
}
