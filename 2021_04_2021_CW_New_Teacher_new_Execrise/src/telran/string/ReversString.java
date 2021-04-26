package telran.string;

public class ReversString {
    public static String reversString(String str) {
        if (str == null || str.trim().isEmpty())
            return null;
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev+=str.charAt(i);
        }
        return rev.trim();
    }

}
