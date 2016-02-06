package abstr_interf_Strategy.lock_Key;

import java.util.Arrays;

/**
 * Created by Administrator on 2/2/16.
 */
public abstract class IronBilletKey implements Key {
    abstract int[] getNotch();

    public String getCode() {
        return Arrays.toString(getNotch());
    }
}
