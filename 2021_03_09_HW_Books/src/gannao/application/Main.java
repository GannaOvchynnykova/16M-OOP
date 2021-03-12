package gannao.application;

import gannao.data.Books;

public class Main {
    public static void main(String[] args) {
        Books alphabet = new Books(9784260, "Vladimir Dal", "Alphabet", 250, 1.5);
        Books warAndPeace = new Books(4964562, "Lev Tolstoi", "War and Peace", 1300, 2.0);
        Books generation = new Books(7898978, "Victor Pelevin", "Generation P", 352, 1.8);
        Books onTheRoad = new Books(9895121, "Jack Kerouac", "On the roat", 500, 1.9);
        Books alteDama = new Books(1923780, "Friedrich Durrenmat", "Der Besuch der alten Dame", 650, 1.6);
        Books rye = new Books(3043983, "Jerome Salinger", "The Catcher in the Rye", 350, 1.8);

        Books[] array = new Books[]{alphabet, warAndPeace, generation, onTheRoad, alteDama, rye};

        printBooks(array);
        double result = getTotalPrice(array);
        System.out.printf("Total Price for Book = %.2f\n", result);

        //System.out.println("Total Price for Book = " + result);
        //int x = 123;
        //System.out.printf("x = %d\n", x);
        //System.out.printf("price = %.2f and x = %d\n", result, x);
    }

    private static double getTotalPrice(Books[] array) {
        double result = 0;
        //for (int i = 0; i < array.length; i++) {
        //  result += array[i].getTotalPriceForOne();
        //}
        //System.out.println(result + " euro");
        for (Books b : array) {
            result += b.getCountPages() * b.getPricePerPage();
        }
        return result;
    }

    private static void printBooks(Books[] array) {
        //for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        //}
        for (Books b : array) {
            System.out.println(b);
        }
    }
}
