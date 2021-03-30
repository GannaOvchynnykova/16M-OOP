package hw_variant1.data;

public abstract class Person {
    String name;
    long id;
    int age;

    public Person() {
        this.name = "Not defined";
    }

    public Person(String name, long id, int age) {
        if (name != null)
            this.name = name;
        else
            this.name = "Not defined!";
        setId(id);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
            this.name = name;
        else
            System.out.println("Wrong name");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id > 0)
            this.id = id;
        else
            System.out.println("Wrong id");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 85)
            this.age = age;
        else
            System.out.println("Wrong age");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
