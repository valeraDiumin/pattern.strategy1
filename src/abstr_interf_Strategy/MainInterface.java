package abstr_interf_Strategy;

/**
 * Created by Administrator on 2/1/16.
 */
public class MainInterface {
    public static void main(String[] args) {
        Interface1 i = new SubInterface();
        System.out.println(i.hello());
    }
}
