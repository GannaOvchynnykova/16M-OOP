package gannao.application;

import gannao.data.Books;

public class Main {
    public static void main(String[] args) {
        Books alphabet = new Books(978 - 0 - 7334 - 2609 - 4, "Vladimir Dal", "Alphabet", 250, 1.5);
        Books warAndPeace = new Books(456 - 9 - 6432 - 5956 - 2, "Lev Tolstoi", "War and Peace", 1300, 2.0);
        Books generation = new Books(789 - 4 - 6789 - 1312 - 8, "Victor Pelevin", "Generation P", 352, 1.8);
        Books onTheRoad = new Books(989 - 1 - 5675 - 1212 - 1, "Jack Kerouac", "On the roat", 500, 1.9);
        Books alteDama = new Books(123 - 9 - 1234 - 7878 - 0, "Friedrich Durrenmat", "Der Besuch der alten Dame", 650, 1.6);
        Books rye = new Books(345 - 0 - 4343 - 8989 - 3, "The Catcher in the Rye", "Jerome Salinger", 350, 1.8);

        Books[] array = new Books[]{alphabet, warAndPeace, generation, onTheRoad, alteDama, rye};

        printBooks(array);
        setTotalPrice(array);

    }

    private static void setTotalPrice(Books[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i].getTotalPriceForOne();
        }
        System.out.println(result + " euro");
    }

    private static void printBooks(Books[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

}
