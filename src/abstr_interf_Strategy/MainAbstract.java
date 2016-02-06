package abstr_interf_Strategy;

/**
 * Created by Administrator on 2/1/16.
 */
public class MainAbstract {
    public static void main(String[] args) {
        AbstractClass a = new SubAbstractClass();
        System.out.println(a.toString());

        Object a1 = new SubAbstractClass();
        System.out.println(a1.toString());

        SubAbstractClass s = new SubAbstractClass();
        System.out.println(s.toString());

        //we can make instance from abstract, overrided it's abstract methods
        Object o = new AbstractClass() {
            @Override
            public String toString() {
                return "From anonimus class";
            }
        };
        System.out.println(o.toString());

        SubAbstractClass s1 = new SubAbstractClass() {
            @Override
            public String toString() {
          return "from subSubAbstractClass";
            }
        };
        System.out.println(s1.toString());
    }
}
