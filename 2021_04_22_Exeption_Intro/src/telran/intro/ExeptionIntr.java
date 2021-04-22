package telran.intro;

public class ExeptionIntr {

    public static void main(String[] args) {
        System.out.println("Start program");

        try {
            Integer number = getNumber(args[0]);
            System.out.println(number + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " Index 0 out of bounds for length 0");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Args not number");
        } catch (Exception e) {
            System.out.println(" All exception");
        }
        System.out.println("End program");
        System.out.println("//===============================================");

        try {
            boolean res = isNumber(args[0]);
            System.out.println(res);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("End and end program!!!!!!");
        }
    }

    private static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static Integer getNumber(String arg) {
        return Integer.parseInt(arg);
    }
}
