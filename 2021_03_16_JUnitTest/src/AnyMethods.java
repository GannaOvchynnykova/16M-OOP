public class AnyMethods {
    public static int searchStr(String[] ar, String str) {
        if (ar == null || str == null || ar.length == 0 || str.isEmpty())
            return -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == null) continue;
            if (ar[i].equalsIgnoreCase(str.trim())) return i;
        }
        return -1;
    }
}
