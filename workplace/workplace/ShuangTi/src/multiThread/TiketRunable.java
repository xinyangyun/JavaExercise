package multiThread;

/**
 * Created by Administrator on 2020/5/25 0025.
 */
public class TiketRunable implements Runnable {
    private static int i = 1000;

    @Override
    public void run() {
        //线程同步 锁
        while (true) {
//            synchronized (this) {
//                if(i>0){
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    //t2
//                    System.out.println(Thread.currentThread().getName() + "--" + i);
//                    i--;
//                }else {
//                    break;
//                }
//            }
            test();
            if (i<1) {
            	break;
            }
        }

    }
    
    public static synchronized void test() {
    	if(i>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //t2
            System.out.println(Thread.currentThread().getName() + "--" + i);
            i--;
        }else {
            return;
        }
    }
}
