import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Comparator compare = new ToStringComparator();
//        [af, asd, fdff, fasdfg]
//        [true, true, false, false]
//        [1, 51, 721, 2111]

//        Comparator compare = new FirstFigureComparator();
//        [1, 2111, 51, 721]

        Comparator compare = new FirstLetterComparator();
//        [asd, af, fasdfg, fdff]
//        [false, false, true, true]
//        [1, 2111, 51, 721]

        BubbleSorterLowToHi bubbleSorterLowToHi =  new BubbleSorterLowToHi(compare);
        BubbleSorterHiToLow bubbleSorterHiToLow = new BubbleSorterHiToLow(compare);

        Object[] array3 = bubbleSorterLowToHi.sorting(new Integer[]{51, 2111, 721, 1});
        Object[] array4 = bubbleSorterHiToLow.sorting(new Integer[]{51, 2111, 721, 1});



        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
