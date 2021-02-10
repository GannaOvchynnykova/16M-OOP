public class StartApplication {
    public static void main(String[] args) {
        //SPA
        Person p1 = new Person("Andrei", 18, 100);
        Person p2 = new Person("Merkel", 28, 101);
        Person p3 = new Person("Alex", 38, 102);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        Person p4 = p1;
        p4.firstName = "Sergi";
        System.out.println(p4.firstName);

        Person p5 = new Person();
        p5 = p1;
        p5.firstName = "Svetlana";
        System.out.println(p1.firstName);

    }
}
