package telran.test;

import org.junit.Test;
import telran.items.MemoryService;

import static org.junit.Assert.assertTrue;

public class MemoryServiceTest {

    @Test
    public void memoryServiceTest(){

        Runtime runtime = Runtime.getRuntime();
        System.out.printf("max free memory %d, max memory %d, total memory %d\n",
                runtime.freeMemory(), runtime.maxMemory(), runtime.totalMemory());

        int max = MemoryService.getMaxAvailableMemory();
        byte [] ar = new byte[max];
        ar = null;

        boolean flag = false;
        try {
            ar = new byte[max + 1];
            flag = false;
        }catch (OutOfMemoryError e){
            flag = true;
        }

        assertTrue(flag);

        System.out.printf("max free memory %d, max memory %d, total memory %d\n",
                runtime.freeMemory(), runtime.maxMemory(), runtime.totalMemory());

    }
}
