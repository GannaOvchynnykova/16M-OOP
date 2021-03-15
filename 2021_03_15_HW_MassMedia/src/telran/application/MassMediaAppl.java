package telran.application;

import telran.interfaces.IPrintable;
import telran.items.*;

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

    private static IPrintable[] getPrintableElements(MassMedia[] array) {
        IPrintable[] arr = new IPrintable[array.length];
        for (MassMedia i : array) {
            if (i instanceof IPrintable) {
                IPrintable temp = (IPrintable) i;
                temp.print();
                System.out.println(i);
            }
        }
        return arr;
    }

    private static void displayPrintable(MassMedia[] array) {
        for (MassMedia i : array) {
            if (i instanceof IPrintable) {
                IPrintable temp = (IPrintable) i;
                temp.print();
                System.out.println(i);
            }
        }
    }
}
