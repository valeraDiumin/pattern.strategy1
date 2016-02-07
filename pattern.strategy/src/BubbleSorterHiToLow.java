
public class BubbleSorterHiToLow extends BubbleSorterLowToHi {
    public BubbleSorterHiToLow(Comparator compare) {
        super(compare);
    }

    @Override
    public Object[] sorting(Object[] income) {
        Object[] sort = newArray(income);

        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 1; j < sort.length - i; j++) {
                if (!compare.comparing(sort[j - 1], sort[j])) {
                    Object temp = sort[j - 1];
                    sort[j - 1] = sort[j];
                    sort[j] = temp;
                }
            }
        }
        return sort;
    }
}
