package de.andron13.data;

public class Cat {
    private String name;
    private int age;
    private String breed;
    private boolean pass;

    Cat (String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void move(){
        System.out.println("I am move!!!");
    }
    void setName(String newName){
        this.name = newName;
    }
    void setAge(int newAge){
        this.age = newAge;
    }
    void setBreed(String newBreed){
        this.breed = newBreed;
    }
    void setPass (boolean newPass){
        this.pass = newPass;
    }
    public boolean isPass(){
        return pass;
    }
    public String getName (){
        return name;
    }
    public String getBreed (){
        return breed;
    }
    public int getAge(){
        return age;
    }
}

class TestCat{
    public static void main(String[] args) {
        Cat catchen = new Cat("Barsik", 1, "Pers");
        catchen.move();
        catchen.setName("Daria");
        System.out.println(catchen.isPass());
        System.out.println(catchen.getName());
    }
}
