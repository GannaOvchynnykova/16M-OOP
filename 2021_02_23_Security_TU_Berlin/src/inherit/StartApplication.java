package inherit;

public class StartApplication {
    public static void main(String[] args) {
        Student sasha = new Student("Sasha", "Olegovich", "78-12",
                "04.04.90", "F", "01.09.18",
                "77-23-56", "Lenovo Str. 56/12",
                19, 5.4, "Math", "Mai" );
        Student lisa = new Student("Lisa", "Petrova", "67-78",
                "04.08.23", "F", "14.01.12",
                "66-32-12", "Lenina Str. 21/45",
                19, 5.4, "Math", "Mai");
        Student pasha = new Student("Pasha", "Alekseev", "77-999",
                "09.18.63", "M", "02.01.22",
                "11-02-82", "Penina Str. 91/405",
                19, 5.4, "Math", "Mai");
        Student dasha = new Student("Dasha", "Semenov", "66-99",
                "24.11.13", "F", "04.06.12",
                "26-42-72", "Tenina Str. 123/65",
                19, 5.4, "Math", "Mai");
        Student rita = new Student("Rita", "Ivanova", "66-77",
                "14.12.23", "F", "04.06.12",
                "66-32-12", "Nenina Str. 821/345",
                19, 5.4, "Math", "Mai");
        dasha.eats();
        rita.goingTo();
        System.out.println(sasha.toString());
        System.out.println(lisa);

        Teacher chemistry = new Teacher("Alla", "Melich", "97-08",
                "24.06.23", "F", "11.06.29",
                "16-82-32", "Zilly Str. 21/45",
                39, 5.400, "Math", "Courses 2005");
        Teacher math = new Teacher("Leopold", "Petrovich", "17-48",
                "14.04.13", "M", "14.04.19",
                "86-82-32", "Engelsa Str. 21/45",
                45,6.000, "Maths", "Courses 2007");
        Teacher physics = new Teacher("Neon", "Prolomov", "07-41",
                "17.02.19", "M", "16.08.29",
                "56-22-39", "Potsdamer Str. 21/45",
                50,5.000, "Physics", "Courses 2008");
        System.out.println(chemistry.toString());
        physics.advancedTraining();
        math.paymentOfWages();

        Worker clean = new Worker("Marina", "Svetlova", "06-9889",
                "11.11.13", "F", "07.06.12",
                "26-44-72", "Trenina Str. 123/65", "29", "night", 60);
        Worker wash = new Worker("Lilia", "Matz", "126-959",
                "24.01.13", "F", "14.06.22",
                "86-42-72", "Kerina Str. 123/65", "30", "day", 59);
        clean.ovettimeWork();
        wash.setShift("night");

        Person[] myPlace = new Person[] {sasha, lisa, pasha, chemistry, math, physics, clean, wash, dasha};

    }

    public static Person[] addElement(Person[] input, int index, Person person) {
        Person[] result = new Person[input.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = input[i];
        }
        result[index] = person;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = input[i - 1];
        }
        return result;
    }

    public static Person[] deleteElement(Person[] input, int index) {
        Person[] result = new Person[input.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = input[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = input[i + 1];
        }
        return result;
    }

    public static Person[] updateElement(Person[] input, int index, Person person) {
        Person[] result = new Person[input.length];
        for (int i = 0; i < index; i++) {
            result[i] = input[i];
        }
        result[index] = person;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = input[i];
        }
        return result;
    }

    public static Person[] bubbleSort(Person[] input) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i].age > input[i + 1].age) {
                    Person temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
        return input;
    }

    public static void printArray(Person[] input) {
        System.out.print("[ ");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i].age + " , ");
        }
        System.out.println(" ]");
    }

}
