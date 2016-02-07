
public class FirstFigureComparator implements Comparator {

    @Override
    public boolean comparing(Object object1, Object object2) {//compare with first figure of income Object
        return (Integer.valueOf(object1.toString().substring(0,1)) > Integer.valueOf(object2.toString().substring(0,1)));
    }
}
