package abstr_interf_Strategy.lock_Key;

/**
 * Created by 123 on 05.02.2016.
 */
public class SpesialLock  extends WeekLock implements Lock{

    private int countOfStrikes = 0;

    public SpesialLock(int[] lockZub) {
        super(lockZub);
    }

    @Override
    public void unlock(Key key) {
        if (key.getCode().equals("Bam-m-m")){
            countOfStrikes++;
            if (countOfStrikes < 3){
                System.out.print("Door was crashed " + countOfStrikes + " times ");
                System.out.println("After " + (3 - countOfStrikes) + " strikes door will be opened");
            }
            if (countOfStrikes >= 3) {
                openOrLocked = true;
                System.out.println("Door is crashed and opened");
            }
        } else {
            super.unlock(key);
        }
    }//

    @Override
    public boolean isOpened() {
        boolean result = true;
        if (countOfStrikes >= 3){
            result = true;
            System.out.println("Door has broken and cannot be closed already");
        } else {
            result = super.isOpened();
        }
        return result;
    }
}
