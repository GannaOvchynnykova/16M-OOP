package homeWorkSwan;

public class Main {
    public static void main(String[] args) {
        Swans one = new Swans("Oleg", "m", "white", 1);
        Swans five = new Swans("Pedro", "m", "red", 5);
        Swans two = new Swans("Maria", "f", "pink", 2);
        Swans four = new Swans("Moisei", "m", "black", 4);
        Swans three = new Swans("Solomon", "m", "gold", 3);

        Swans [] group = new Swans [] {one, two, three, four, five};

       printArray(bubbleSortArray(group));

    }
    private static Swans[] bubbleSortArray(Swans [] input) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < input.length -1; i++) {
                if (input[i].age > input[i + 1].age) {
                    Swans temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
        return input;
    }
    private static void printArray (Swans [] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1 ; i++) {
            System.out.print((array [i].age) + ", ");
        }
        System.out.print((array[array.length - 1]));
        System.out.println(" ]");
    }
}
