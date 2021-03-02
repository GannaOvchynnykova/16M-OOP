package lessonStart;

public class String01Solution {
    public String helloName (String name){
        return "Hello " + name + "!";
    }

    /*public static void main(String[] args) {
        System.out.println(helloName("Bob"));*/
    }

    class TestString01{
        public static void main(String[] args) {
            String01Solution myFirstAngryObject = new String01Solution();
            System.out.println(myFirstAngryObject.helloName("Anna"));
            System.out.println(myFirstAngryObject.helloName("Victor"));
        }
}
