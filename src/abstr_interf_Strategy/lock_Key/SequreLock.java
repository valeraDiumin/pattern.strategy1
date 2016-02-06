package abstr_interf_Strategy.lock_Key;

import java.util.Arrays;

/**
 * Created by Administrator on 2/4/16.
 */
public class SequreLock implements Lock {
    private int[] secret = new int[7];
    private boolean openOrLocked = true;

    SequreLock(int[] lockZub1, int[] lockZub2){
        this.secret = new int[lockZub1.length + lockZub2.length + 1];
        for (int i = 0; i < 3; i++) {
            secret[i] = lockZub1[i];
        }
        secret[3] = 24;

        for (int i = 4; i < 7; i++) {
            secret[i] = lockZub2[i-4];
        }
    }
    @Override
    public void unlock(Key key) {
        System.out.println("Someboby tryed to open/closed me");
        if ((key.getCode()).equals(Arrays.toString(secret))){
            openOrLocked = !openOrLocked;
        }
    }

    @Override
    public boolean isOpened() {
        return openOrLocked;
    }
}
