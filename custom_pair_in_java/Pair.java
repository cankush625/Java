public class Pair<T, U> implements Comparable<Pair<T, U>> {
    private T key;
    private U value;

    public void add(T firstValue, U secondValue) {
        this.key = firstValue;
        this.value = secondValue;
    }

    public T first() {
        return this.key;
    }

    public U second() {
        return this.value;
    }

    @Override
    public int compareTo(Pair<T, U> o) {
        int val = 0;
        try {
            if (key == o.key) {
                val = 0;
            } else {
                val = (Integer) key > (Integer) o.key ? 1 : -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }
}