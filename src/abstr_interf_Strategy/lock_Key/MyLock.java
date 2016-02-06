package abstr_interf_Strategy.lock_Key;

import java.util.Arrays;

/**
 * Created by Administrator on 2/2/16.
 */
public class MyLock implements Lock{
    private int[] secret = new int[7];
    protected boolean openOrLocked = true;

    public MyLock(int[] lockZub) {
        this.secret = lockZub;
    }

    @Override
    public void unlock(Key key) {
        if ((key.getCode()).equals(Arrays.toString(secret))){
            openOrLocked = !openOrLocked;
        }
    }

    @Override
    public boolean isOpened() {
        return openOrLocked;
    }
}
