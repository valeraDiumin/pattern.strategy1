import java.util.Arrays;

public class ToStringComparator implements Comparator {
    @Override
    public boolean comparing(Object object1, Object object2) {
        return String.valueOf(object1).length() > (String.valueOf(object2)).length();
    }
}
