public class Coctail {
    private String title;
    private Ingredient[] ingredients;
    private int liquid;
    private int perCent;

    public Coctail(String title, Ingredient... ingredients) {
        this.title = title;
        this.ingredients = ingredients;
    }

    public void setPerCent(){
        int result = 0;
        for (int i = 0; i < ingredients.length; i++) {
            result+=ingredients[i].getPerCent()*ingredients[i].getLiquid();
        }
        perCent = result / getLiquid();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setLiquid(int liquid) {
        this.liquid = liquid;
    }

    public int getPerCent() {
        return perCent;
    }

    public void setPerCent(int perCent) {
        this.perCent = perCent;
    }

    public int getLiquid() {
        return liquid;
    }

    private void setLiquid(){
        int result = 0;
        for (int i = 0; i < ingredients.length; i++) {
            result+= ingredients[i].getLiquid();
        }
        liquid = result;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < ingredients.length; i++) {
            result += ingredients[i].toString();
        }
        return "Coctail{" +
                "title='" + title + '\'' +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                ", ingredients with =" + result +
                '}';
    }
}
