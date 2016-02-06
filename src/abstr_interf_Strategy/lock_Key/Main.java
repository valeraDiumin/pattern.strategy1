package abstr_interf_Strategy.lock_Key;

/**
 * Created by Administrator on 2/2/16.
 */
public class Main {
    public static void main(String[] args) {
        Lock lock = new MyLock(new int[]{1, 2, 3, 4, 5, 6, 7});
        Lock weeklock = new WeekLock(new int[]{1, 2, 3, 4, 5, 6, 7});

        Key myKey = new ClassicIronKey(new int[]{1, 2, 3, 4, 5, 6, 7});
        Key otherKey = new ClassicIronKey(new int[]{1, 1, 3, 4, 5, 6, 7});
        Key spetialKey = new ClassicIronKey(new int[]{7, 6, 5, 4, 3, 2, 1});

        Key sequreKey = new SequreIronKey(new int[]{1, 2, 3}, new int[]{5, 6, 7});
        Key pinchBar = new PinchBar();
        Lock sequrelock = new SequreLock(new int[]{1, 2, 3}, new int[]{5, 6, 7});
        Lock spetialLock = new SpesialLock(new int[]{7, 6, 5, 4, 3, 2, 1});
//        test(lock, myKey, otherKey, sequreKey);
//
//
        System.out.println("Is door closed? " + spetialLock.isOpened());//true
        spetialLock.unlock(spetialKey);
        System.out.println("Is door closed? " + spetialLock.isOpened());//true
        spetialLock.unlock(myKey);
        System.out.println("Is door closed? " + spetialLock.isOpened());//true
        spetialLock.unlock(pinchBar);
        System.out.println("Is door closed? " + spetialLock.isOpened());//true
        spetialLock.unlock(pinchBar);
        spetialLock.unlock(pinchBar);
        System.out.println("");
        System.out.println("Is door closed? " + spetialLock.isOpened());//true
        spetialLock.unlock(pinchBar);
        System.out.println("Is door closed? " + spetialLock.isOpened());//true

        System.out.println("");
        spetialLock.unlock(spetialKey);
        System.out.println("Is door closed? " + spetialLock.isOpened());//true
    }

}
