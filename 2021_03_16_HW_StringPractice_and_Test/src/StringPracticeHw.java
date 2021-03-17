public class StringPracticeHw {

    public static String getStrReverse(String str) {
        if (str.isEmpty() || str == null)
            return null;
        char[] charArray = str.toCharArray();
        String result = "";
        if (str.isEmpty() || str == null)
            return null;
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }
        return result;
    }

    public static int getCountWords(String sent, String word) {
        if (sent.isEmpty()||sent==null||word.isEmpty()||word==null)
            return -1;
        int count = 0;
        String[] sentArray = sent.split(" ");
        for (String s : sentArray) {
            if (s.equals(word)) count++;
        }
        return count;
    }
}
