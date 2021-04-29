package de.numbers;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NumbersServiceTest {

    NumbersService numbersService = new NumbersService();

    @Test
    void testGetNumberOfMaxOccurrenceEmptyListThrowsNoSuchElementException() {
        List<Integer> emptyList = new ArrayList<>();
        assertThrows(NoSuchElementException.class, ()-> numbersService.getNumberOfMaxOccurrence(emptyList));
    }

    @Test
    void testGetNumberOfMaxOccurrenceOneNumber() {
        List<Integer> integerList = Arrays.asList(2);
        assertEquals(2, numbersService.getNumberOfMaxOccurrence(integerList));
    }

    @Test
    void testGetNumberOfMaxOccurrenceSeveralDifferentNumbersAny() {
        List<Integer> integerList = Arrays.asList(2, 8, 10);
        int res = numbersService.getNumberOfMaxOccurrence(integerList);
        assertTrue(2 == res || 8 == res || -10 == res);
    }

    @Test
    void testGetNumberOfMaxOccurrenceSeveralNumbersSeveralTimesAny() {
        List<Integer> integerList = Arrays.asList(2, 8, -10, 8, -10, 3);
        int res = numbersService.getNumberOfMaxOccurrence(integerList);
        assertTrue(8 == res || -10 == res);
    }

    @Test
    void testIsPrime1(){
        assertFalse(numbersService.isPrime(1));
    }

    @Test
    void testIsPrime2(){
        assertTrue(numbersService.isPrime(2));
    }

    @Test
    void testIsPrime3(){
        assertTrue(numbersService.isPrime(3));
    }

    @Test
    void testIsPrime4(){
        assertFalse(numbersService.isPrime(4));
    }

    @Test
    void testIsPrime239(){
        assertTrue(numbersService.isPrime(239));
    }

    @Test
    void testIsPrime10(){
        assertFalse(numbersService.isPrime(10));
    }

    @Test
    void testGetAllPrime1(){
        List<Integer> res = numbersService.getAllPrimesTo(1);
        assertTrue(res.isEmpty());

        assertEquals(Collections.emptyList(), numbersService.getAllPrimesTo(1));
    }

    @Test
    void testGetAllPrime2(){
        List<Integer> res = numbersService.getAllPrimesTo(2);
        List<Integer> expected = Arrays.asList(2);
       assertEquals(expected, res);
    }

    @Test
    void testGetAllPrime3(){
        List<Integer> res = numbersService.getAllPrimesTo(3);
        List<Integer> expected = Arrays.asList(2, 3);
        assertEquals(expected, res);
    }

    @Test
    void testGetAllPrime4(){
        List<Integer> res = numbersService.getAllPrimesTo(4);
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        assertEquals(expected, res);
    }

    @Test
    void testGetMaxCoveredNumbersGeneral(){
        List<Integer> numbers = Arrays.asList(5, 1, -10, -8, 4, 3);
        assertEquals(3, numbersService.getCoveredNumbers(numbers, 2));
    }
}