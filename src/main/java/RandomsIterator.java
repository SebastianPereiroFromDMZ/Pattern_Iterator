import java.util.Iterator;

public class RandomsIterator implements Iterator<Integer> {

    private Randoms randoms;

    public RandomsIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {//один из двех основных методов итератора, смотрит что дальше
        return true;
    }


    @Override
    public Integer next() {
        return randoms.random.nextInt(randoms.max - randoms.min + 1) + randoms.min;
    }
}
