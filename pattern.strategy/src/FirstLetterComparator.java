
public class FirstLetterComparator implements Comparator{

    @Override
    public boolean comparing(Object object1, Object object2) {
        return object1.toString().charAt(0) > object2.toString().charAt(0);
    }
}
