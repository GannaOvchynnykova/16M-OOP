package hw_variant1.person;

public class Person2 {
    private int birthYear;
    private String name;

    public Person2() {
    }

    public Person2(int birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthYear=" + birthYear +
                ", name='" + name + '\'' +
                '}';
    }

}
