public class StringPracticeHw {

    public static String getStrReverse(String str) {
        if (str == null || str.trim().isEmpty()) return null;

        //_________1 variant________
        //return new StringBuffer(str).reverse().toString  - reshenie v odny stroky

        //----------2 variant-------
        //char[] charArray = str.toCharArray();
        //char temp;
        // for (int i = 0, j = charArray.length-1; i < j;  i++, j--){
        // temp = charArray[i];
        // charArray[i] = charArray[j];
        //charArray[j] = temp;
        //}
        //return new String(charArray);

        //----------3 variant----------
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static int getCountWords(String sent, String word) {
        if (sent.trim().isEmpty() || sent == null || word.trim().isEmpty() || word == null) return -1;
        String[] sentArray = sent.split(" ");
        int count = 0;
        word = word.trim();
        for (String s : sentArray) {
            if (s.equals(word)) count++;
        }
        return count;
    }
}
