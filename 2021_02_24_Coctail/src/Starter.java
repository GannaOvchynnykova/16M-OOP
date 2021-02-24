public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("vodka", 100, 40);
        Ingredient tomatojuce = new Ingredient("tomato", 100, 0);
        Ingredient cola = new Ingredient("Cola", 100, 0);
        Ingredient energiser = new Ingredient("RedBull", 100, 0);
        Coctail bloodyMary = new Coctail("BloodyMary", vodka, tomatojuce);
        Coctail disko = new Coctail("Disko", energiser, vodka);
        Coctail berlinNull = new Coctail("Zero", cola, energiser);

        System.out.println(disko);

        System.out.println(berlinNull);

        Almanah best100Cocktail = new Almanah(100);
        best100Cocktail.addCocktails(disko);
    }
}
