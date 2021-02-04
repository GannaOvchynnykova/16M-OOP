



public class MyTest {
    public static void main(String[] args) {
        Article artOne = new Article("Seite One",
                "Text Main");
        Article artTwo = new Article("Seite Two",
                "Text Main Two");

        System.out.println(artOne.title);
        System.out.println(artTwo.announce);
        //sosdali konstruktor s parametr

        Article artThree = new Article(13,
                "Very impotent seite",
                "Im created monument");
        System.out.println(artThree.title);
    }

}
