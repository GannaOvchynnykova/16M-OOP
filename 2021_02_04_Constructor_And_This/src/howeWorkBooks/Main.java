package howeWorkBooks;

public class Main {
    public static void main(String[] args) {
        Books alphabet = new Books(4.5, 25);
        Books warAndPeace = new Books("978-3-16-148410-0");
        Books generation = new Books("Generation P", "Victor Pelevin", "roman", 1984);
        Books onTheRoad = new Books("On the roat", "Jack Kerouac", "roman", 1957);
        Books alteDama = new Books("Der Besuch der alten Dame", "Friedrich Durrenmat", "tragic comedy", 1956);
        Books rye = new Books("The Catcher in the Rye", "Jerome Salinger", "roman", 1951);

        Books[] array = new Books[]{generation, onTheRoad, alteDama, rye};
        Books fresh = new Books("The Catcher in the Rye", "Jerome Salinger", "roman", 1954);

        System.out.println(alphabet.toDisplay());
        printArray(bubbleSortik(array));
        printArray(deleteElement(array, 2));
        printArray(addElement(array, 2, fresh));
        printArray(changeElement(array, 2, fresh));
        System.out.println(array[2].author);
        booksPrint(array);

    }
    private static Books[] changeElement(Books[] array, int index, Books fresh) {
        Books [] result = new Books[array.length];
        for (int i = 0; i < index ; i++) {
            result[i] = array [i];
        }
        result [index] = fresh;
        for (int i = index + 1
             ; i < result.length; i++) {
            result [i] = array[i];
        }
        return result;
    }

    private static Books[] addElement(Books[] array, int index, Books fresh) {
        Books [] result = new Books[array.length + 1];
        for (int i = 0; i < index ; i++) {
            result[i] = array [i];
        }
        result [index] = fresh;
        for (int i = index + 1; i < result.length; i++) {
            result [i] = array[i - 1];
        }
        return result;
    }

    private static Books[] deleteElement(Books[] array, int index) {
        Books [] result = new Books[array.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = array[i + 1];
        }
        return result;
    }

        public static Books[] bubbleSortik (Books[]input) {
            boolean unsorted = true;
            while (unsorted) {
                unsorted = false;
                for (int i = 0; i < input.length - 1; i++) {
                    if (input[i].year > input[i + 1].year) {
                        Books temp = input[i];
                        input[i] = input[i + 1];
                        input[i + 1] = temp;
                        unsorted = true;
                    }
                }
            }
            return input;
        }

        public static void printArray (Books[]array){
            System.out.print("[ ");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print((array[i].year) + ", ");
            }
            System.out.print((array[array.length - 1]));
            System.out.println(" ]");
        }

    public static void booksPrint(Books [] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i].toDisplay());
        }
    }

    }
