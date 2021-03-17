public class WrapperAppl {
    // byte - Byte
    // short - Short
    // int - Integer
    // long - Long
    // float - Float
    // double - Double
    // char - Character
    // boolean - Boolean

    public static void main(String[] args) {
        Integer a = 6; // auto pack autoypakovka
        System.out.println(a + 10); // auto raspakovka
        System.out.println(a > 10); // auto raspakovka
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //================================================
        int x = 10;
        String str = "1234";
        x = Integer.parseInt(str); //"1234" -> 1234
        System.out.println(x + 10); // -> 1244
        //-----------------------------------------------
        Long b = 12L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        Long c = Long.parseLong("466789");
        System.out.println(c - 466789); //0
        //------------------------------------------------
        Double d = 3.14;
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        double d2 = Double.parseDouble("12.1");
        System.out.println(d2); //12.1
        //------------------------------------------------
        boolean bo = Boolean.parseBoolean("True");
        System.out.println(bo);
        //------------------------------------------------
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
    }
}
