package abstr_interf_Strategy.lock_Key;

import java.util.Arrays;

/**
 * Created by Administrator on 2/2/16.
 */
public class ClassicIronKey extends IronBilletKey implements Key {

    private final int[] notch;

    ClassicIronKey(int... notch) {
        this.notch = notch;
    };

public String getCode(){
    String result = Arrays.toString(getNotch());
    return result;
}

    @Override
    int[] getNotch() {
        return notch;
    }
    public String toString(){
        return "I am ClassicIronKey with notches";
    }

}//We pull our Lock in unlock() method, after it pull getNotch() that turn back int [] notch
// and getCode turn back code to Lock.
