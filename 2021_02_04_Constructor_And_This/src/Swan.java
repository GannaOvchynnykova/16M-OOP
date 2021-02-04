public class Swan {
    String name;
    String breed;
    int age;

    public Swan (String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
}
class SwanTest{
    public static void main(String[] args) {
        Swan swen = new Swan("oleg", "white", 3);
    }
}
