

public class StringBuilder {
    public static void main(String[] args) {

        //insert() dobav stroky ili simvol po index
        //getChars() nabor mejdy index
        //append() dobav v konec
        //delete() ydaliaet vse s indexa
        //deleteCharAt() ydaliaet odin po index
        // substring() obresaet stroky s index do konca ili do indexa
        //setLength() obreska
        //replace() samena po indexam
        //reverse () obratnii poriadok

        StringBuffer sb = new StringBuffer();
        System.out.println("sb length = " + sb.capacity());

        long timeNow = System.currentTimeMillis();
        System.out.println(timeNow);

        int maxIterations = 100_000;
        long timeStamp = System.currentTimeMillis();
        concatUsingString(maxIterations);
        System.out.println("Time String: " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        concatUsingStringBuilder(maxIterations);
        System.out.println("Time StringBuilder: " + (System.currentTimeMillis() - timeStamp));

    }

    private static void concatUsingString (int maxIteration){
        String str = new String();
        while (maxIteration > 0){
            str += "a";
            maxIteration--;
        }
    }

    private static void concatUsingStringBuilder (int maxIteration){
        StringBuffer sb = new StringBuffer();
        while (maxIteration > 0){
            sb.append ("a");
            maxIteration--;
        }
    }
}
