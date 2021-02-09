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
        printArray(bubbleSortik(array));
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

    }
