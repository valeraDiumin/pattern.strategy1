package abstr_interf_Strategy.lock_Key;

/**
 * Created by Administrator on 2/5/16.
 */
public class PinchBar implements Key {
    @Override
    public String getCode() {
        System.out.println("Bam-m-m");
        return "Bam-m-m";
    }
}
