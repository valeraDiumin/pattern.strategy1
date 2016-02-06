package abstr_interf_Strategy.lock_Key;

/**
 * Created by Administrator on 2/2/16.
 */
public interface Lock {
    void unlock(Key key);
    boolean isOpened();
}
