package homeWorkSwan;

public class Swans {
    String gender;
    String name;
    int age;
    String color;

    public Swans(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Swans (String name, int age, String gender){
        this.name = name;
        this. gender = gender;
        this.age = age;
    }
    public Swans (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Swans (String name, String gender, String color, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }
}
