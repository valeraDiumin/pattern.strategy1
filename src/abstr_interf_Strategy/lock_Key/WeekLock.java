package abstr_interf_Strategy.lock_Key;

import java.util.Arrays;

/**
 * Created by Administrator on 2/4/16.
 */
public class WeekLock extends MyLock implements Lock{


    public WeekLock(int[] lockZub) {
        super(lockZub);
    }

    @Override
    public void unlock(Key key) {
        if (key.getCode().equals("Bam-m-m")){
            openOrLocked = true;
        } else {
            super.unlock(key);
        }
    }
}
