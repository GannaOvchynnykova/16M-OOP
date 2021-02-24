public class Ingredient {
    private String title;
    private int liquid; // millilitr
    private int perCent;
    private boolean alcohol;

    public Ingredient(String title, int liquid, int perCent) {
        this.title = title;
        this.liquid = liquid;
        this.perCent = perCent;
        setAlcohol();
    }

    private void setAlcohol() {
        if (perCent > 2){
            alcohol = true;
        }
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "title='" + title + '\'' +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                ", alcohol=" + alcohol +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLiquid() {
        return liquid;
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

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }
}
