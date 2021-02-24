package inherit;

import java.util.Arrays;

public class Personal {
    public Person[] persons;
    public int staff;

    public Personal(int capacity){
        staff = 0;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < staff; i++) {
            result += persons[i];
        }
        return "Personal{" +
                "persons=" + Arrays.toString(persons) +
                ", staff=" + staff +
                '}';
    }
}
