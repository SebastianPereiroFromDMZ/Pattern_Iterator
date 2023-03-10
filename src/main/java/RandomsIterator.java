import java.util.Iterator;

public class RandomsIterator implements Iterator<Integer> {

    private Randoms randoms;

    public RandomsIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int i = randoms.random.nextInt(randoms.max + 1);
        while (i < randoms.min) {
            i = randoms.random.nextInt(randoms.max + 1);
        }
        return i;
    }
}
