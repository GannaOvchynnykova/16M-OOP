package de.reverse;

public class StringService {
    /**
     * The method returns reversed String.
     *
     * @param text - string to reverse. The argument must not be null. Other wise the behavior is undefined.
     * @return reversed string
     */
    public String reverse(String text) {
        //StringBuffer buffer = new StringBuffer(text);
        //return buffer.reverse().toString();

        char[] chars = text.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - i - 1];
            chars[length - i - 1] = temp;
        }
        return new String(chars);
    }
}
