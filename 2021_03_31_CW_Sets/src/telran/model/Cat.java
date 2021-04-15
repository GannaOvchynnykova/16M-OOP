package telran.model;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private char sex;

    public Cat(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return getAge() == cat.getAge() && getSex() == cat.getSex() && Objects.equals(getName(), cat.getName());
    }

    @Override
    public int hashCode() {
        /*final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0: name.hashCode());
        result = prime * result + sex;
        return result; */
        return Objects.hash(getName(), getAge(), getSex());

    }
}
