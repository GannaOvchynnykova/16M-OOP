package homeWorkSwan;

public class Main {
    public static void main(String[] args) {
        Swans one = new Swans("Oleg", "m", "white", 1);
        Swans five = new Swans("Pedro", "m", "red", 5);
        Swans two = new Swans("Maria", "f", "pink", 2);
        Swans four = new Swans("Moisei", "m", "black", 4);
        Swans three = new Swans("Solomon", "m", "gold", 3);

        Swans [] group = new Swans [] {one, two, three, four, five};
        Swans fresh = new Swans("Rodrigas", "w", "gold", 40);

       printArray(bubbleSortArray(group));
       printArray(deleteElement(group, 2));
        printArray(addElement(group, 2, fresh));
        printArray(changeElement(group, 2, fresh));
    }

    private static Swans[] changeElement(Swans[] group, int index, Swans fresh) {
        Swans [] result = new Swans[group.length];
        for (int i = 0; i < index ; i++) {
            result[i] = group [i];
        }
        result [index] = fresh;
        for (int i = index + 1; i < result.length; i++) {
            result [i] = group[i];
        }
        return result;
    }


    private static Swans[] addElement(Swans[] group, int index, Swans fresh) {
        Swans [] result = new Swans[group.length + 1];
        for (int i = 0; i < index ; i++) {
            result[i] = group [i];
        }
        result [index] = fresh;
        for (int i = index + 1; i < result.length; i++) {
            result [i] = group[i - 1];
        }
        return result;
    }

    private static Swans[] deleteElement(Swans[] group, int index) {
        Swans [] result = new Swans[group.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = group[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = group[i + 1];
        }
        return result;
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
