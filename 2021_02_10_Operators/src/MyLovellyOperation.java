public class MyLovellyOperation {
    public static void main(String[] args) {
        // go to, break, return, continue
        introBreak();
        introReturn();
        myFirstZone(true);
        introContinue();

    }

    private static void introContinue() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
            if (i % 10 == 0){
                continue;
            }
            System.out.println();
        }
    }

    private static void myFirstZone(boolean quarantine) {
        //create zone
        quarantineZone:
        {
            int a = 10;
            if (quarantine) {
                int b = 4;
                System.out.println("Quarantine");
                break quarantineZone; //vihod is quarantine
            }
            System.out.println(a);
            System.out.println("Exit our quarantine");
        }

    }

    private static int introReturn() {
        return 5+10;
    }

    private static void introBreak() {
        int n = 10;
        for (int i = 0; i < 10; i++) {
            if (n > 10) {
                break;
            }
        }
    }

}
