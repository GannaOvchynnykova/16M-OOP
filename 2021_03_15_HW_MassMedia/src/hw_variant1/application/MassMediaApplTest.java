package hw_variant1.application;

import org.junit.Test;
import hw_variant1.interfaces.IPrintable;
import hw_variant1.items.*;

import static org.junit.Assert.assertArrayEquals;

public class MassMediaApplTest {

    @Test
    public void getPrintableElements() {
        MassMedia [] input = {
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
        IPrintable [] exp = {
                new Newspaper("Kaif1", 98756789, 33),
                new Newspaper("Kaif2", 1267666789, 31),
                new Newspaper("Kaif3", 12256789, 30),
                new Journal("Bobr", 34521110, 45, true),
                new Journal("Bobr2", 345463640, 25, true),
                new Journal("Bobr3", 345536110, 15, false),
        };
        
        assertArrayEquals(exp, MassMediaAppl.getPrintableElements(input));
        }
    }