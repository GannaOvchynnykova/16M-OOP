package telran.model;

import java.util.function.Predicate;

public class OddPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {

        return integer % 2 != 0;
    }
}
