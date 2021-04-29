package de.numbers;

import java.util.*;

public class NumbersService {
    /**
     * The method finds the number in the 'numbers' which is the most repeatable number.
     *
     * @param numb a list of numbers. If the list is null, the behavior is undefined.
     * @return the most repeatable number. If there are several numbers which satisfy the requirement, the method should return any of these.
     * @throws java.util.NoSuchElementException will be throw if the list is empty
     */
    public int getNumberOfMaxOccurrence(List<Integer> numb) {
        if (numb.isEmpty())
            throw new NoSuchElementException();
        Map<Integer, Integer> qtyByNumber = new HashMap<>();
        for (Integer number : numb) {
            int oldQty = qtyByNumber.getOrDefault(number, 0);
            qtyByNumber.put(number, ++oldQty);
        }

        int res = 0;
        int max = 0;

        for (int key : qtyByNumber.keySet()) {
            int qty = qtyByNumber.get(key);
            if (qty > max) {
                max = qty;
                res = key;
            }
        }
        return res;
    }

    public boolean isPrime(int number) {
        if (number < 2) return false;

        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    /**
     * The method finds all primes up to n
     *
     * @param n must be greater than zero.
     * @return list of all primes non greater than the n
     */
    public List<Integer> getAllPrimesTo(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (isPrime(i))
                res.add(i);
        }
        return res;
    }


    // interval

    public int getCoveredNumbers(List<Integer> integerList, int cut) {
        int res = 0;
        for (int curNumber : integerList) {
            int coveredPoints = 0;
            int leftEnd = curNumber;
            int rightEnd = curNumber + cut;
            for (int number : integerList) {
                if (leftEnd <= number && number <= rightEnd) {
                    coveredPoints++;
                }
            }
            if (coveredPoints > res)
                res = coveredPoints;
        }
        return res;
    }
}
