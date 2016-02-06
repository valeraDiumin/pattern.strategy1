package abstr_interf_Strategy.pattern.from;

import abstr_interf_Strategy.lock_Key.Key;
import abstr_interf_Strategy.lock_Key.Lock;

import java.util.Arrays;

/**
 * Created by Administrator on 2/2/16.
 */
public class CNN_Impl implements CNN {
    private int[] secret = new int[7];
    protected boolean openOrLocked = true;

    public CNN_Impl(int[] lockZub) {
        this.secret = lockZub;
    }

    @Override
    public void Done(ABB key) {
        if ((key.getCode()).equals(Arrays.toString(secret))){
            openOrLocked = !openOrLocked;
        }
    }

    @Override
    public boolean isDone() {
        return openOrLocked;
    }
}
