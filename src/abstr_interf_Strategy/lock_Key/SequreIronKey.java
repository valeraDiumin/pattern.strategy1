package abstr_interf_Strategy.lock_Key;

import java.util.Arrays;

/**
 * Created by Administrator on 2/4/16.
 */
public class SequreIronKey extends IronBilletKey {
    private int[] notch;

    public SequreIronKey(int[] notch1, int... notch2) {
        this.notch = new int[notch1.length + notch2.length+1];
        for (int i = 0; i < 3; i++) {
            notch[i] = notch1[i];
        }
        notch[3] = 24;
        for (int i = 4; i < 7; i++) {
            notch[i] = notch2[i-4];
        }
    }

    @Override
    int[] getNotch() {
        return notch;
    }

    @Override
    public String toString() {
        return "SequreIronKey  with notches";
    }

    @Override
    public String getCode() {
        String result = Arrays.toString(getNotch());
        return result;
    }
}
