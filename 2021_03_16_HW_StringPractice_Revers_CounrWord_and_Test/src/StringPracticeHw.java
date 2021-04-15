public class StringPracticeHw {

    public static String getStrReverse(String str) {
        if (str == null || str.trim().isEmpty())
            return null;
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev+=str.charAt(i);
        }
        return rev.trim();

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
        /*String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result; */
    }

    public static Integer getCountWords(String sent, String word) {
        if (sent.trim().isEmpty() || sent == null || word.trim().isEmpty() || word == null)
            return null;
        int count = 0;
        String[] sentArray = sent.split(" ");
        for (int i = 0; i < sentArray.length ; i++) {
            if (sentArray[i].equalsIgnoreCase(word.trim())) {
                count++;
            }
        }
        return count;
    }
}
