package telran.items;

public class MemoryService {
    public static int getMaxAvailableMemory(){
        int res = Integer.MAX_VALUE;
        while (true){
            try {
                byte[] ar = new byte[res];
                return res;
            }catch (OutOfMemoryError e){
                res--;
            }
        }
    }
}
