package telran.application;

import telran.interfaces.IPrintable;
import telran.model.*;

import java.util.Arrays;

public class MassMediaAppl {
    public static void main(String[] args) {
        MassMedia[] array = {
                new Newspaper("Kaif1", 98756789, 33),
                new Newspaper("Kaif2", 1267666789, 31),
                new Newspaper("Kaif3", 12256789, 30),
                new Journal("Bobr", 34521110, 45, true),
                new Journal("Bobr2", 345463640, 25, true),
                new Journal("Bobr3", 345536110, 15, false),
                new NewsPortal("New", "www.new.com"),
                new NewsPortal("New2", "www.new2.com"),
                new NewsPortal("New3", "www.new3.com"),
                new WebSite("Site", "www.site.com", "MakMafia"),
        };

        displayPrintable(array);

        IPrintable[] arr = getPrintableElements(array);
        System.out.println(Arrays.toString(arr));
    }

    public static IPrintable[] getPrintableElements(MassMedia[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Wrong MassMedia array");
            return null;
        }
        int length = countPrintable(array);
        IPrintable[] arr = new IPrintable[length];
        // for (int i = 0, j = 0; i < array.length; i++){         // 1 variant
        //if (array [i] instanceof IPrintable)
        // arr[j++] = (IPrintable) array [i];
        //}
        //return arr;
        int i = 0;
        for (MassMedia m : array) {                 // 2 variant
            if (m instanceof IPrintable) {
                // arr[i++] = (IPrintable) m;     tak i tak ili tak
                arr[i] = (IPrintable) m;
                i++;
            }
        }
        return arr;
    }

    public static int countPrintable(MassMedia[] array) {
        int count = 0;
        if (array == null || array.length == 0)
            System.out.println("Wrong !!!");
        for (MassMedia i: array) {
            if (i instanceof IPrintable)
                count++;
        }
        return count;
    }

    public static void displayPrintable(MassMedia[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Wrong MassMadia array");
            return;
        }
        for (MassMedia i : array) {
            if (i instanceof IPrintable) {
                ((IPrintable) i).print();
            }
        }
    }
}
