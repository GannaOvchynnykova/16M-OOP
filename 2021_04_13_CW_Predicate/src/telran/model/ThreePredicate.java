package telran.model;

import java.util.function.Predicate;

public class ThreePredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer % 3 == 0;
    }
}
