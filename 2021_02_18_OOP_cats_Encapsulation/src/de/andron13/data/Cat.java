package de.andron13.data;

public class Cat {
    private String name;
    private int age;
    private String breed;
    private boolean pass;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void move() {
        System.out.println("I am move!!!");
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    public void setPass(boolean newPass) {
        this.pass = newPass;
    }

    public boolean isPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
    public String toDisplay() {
        return "{ " + "Name " + name + "; Age " + age + "; Breed" + breed + "; Pass = " + pass + "}";
    }
}

