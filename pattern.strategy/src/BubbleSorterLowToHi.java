import java.util.Arrays;

public class BubbleSorterLowToHi {
    protected Comparator compare;

    public BubbleSorterLowToHi(Comparator compare) {
        this.compare = compare;
    }

    public Object[] sorting(Object[] income) {
        Object[] sort = newArray(income);


        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 1; j < sort.length - i; j++) {
                if (compare.comparing(sort[j - 1], sort[j])) {
                    Object temp = sort[j - 1];
                    sort[j - 1] = sort[j];
                    sort[j] = temp;
                }
            }
        }
        return sort;
    }

    protected Object[] newArray(Object[] income) {
        Object[] sort = new Object[income.length];
        System.arraycopy(income, 0, sort, 0, income.length);
        return sort;
    }
}
