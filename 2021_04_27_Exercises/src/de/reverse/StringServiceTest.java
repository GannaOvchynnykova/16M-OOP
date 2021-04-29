package de.reverse;

import static org.junit.jupiter.api.Assertions.*;

class StringServiceTest {

    StringService service = new StringService();

    @org.junit.jupiter.api.Test
    void testReverseEmptyString() {
        assertEquals("", service.reverse(""));
    }

    @org.junit.jupiter.api.Test
    void testReverseSymmetricString() {
        assertEquals("HelleH", service.reverse("HelleH"));
        assertEquals("aga", service.reverse("aga"));
    }

    @org.junit.jupiter.api.Test
    void testReverseAnyString() {
        assertEquals("Hello", service.reverse("olleH"));
        assertEquals("Hello world", service.reverse("dlrow olleH"));
    }
}