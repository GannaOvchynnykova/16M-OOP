import java.util.Arrays;

public class Almanah {
    private Coctail [] coctails;
    private int size;

    public Almanah(int capacity) {
        coctails = new Coctail[capacity];
        size = 0;
    }

    //CRUD create; read; update; delete

    public boolean addCocktails (Coctail coctail){
        if (size < coctails.length){
            coctails[size] = coctail;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteCocktail(Coctail coctail){
        for (int i = 0; i < size; i++) {
            if (coctails[i].getTitle().equals(coctail.getTitle())){
                coctails [i] = coctails[size-1];
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean update(Coctail oldDrink, Coctail newDrink){
        for (int i = 0; i < size ; i++) {
            if (coctails[i].getTitle().equals(oldDrink.getTitle())){
                coctails[i] = newDrink;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Almanah{" +
                "coctails=" + Arrays.toString(coctails) +
                ", size=" + size + //stranica
                '}';
    }
}
