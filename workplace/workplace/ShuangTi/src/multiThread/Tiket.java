package multiThread;

/**
 * CREATED BY ADMINISTRATOR ON 2020/5/25 0025.
 */
public class Tiket extends Thread {
//    public Tiket(Object object) {
//        this.object = object;
//    }
//    private Object object ;
    private static int i = 10;
//    @Override
//    public void run() {
//        //线程同步 锁
//        while (true) {
//            //1.OBJECT 对象(显示)
//            //2. THIS( 只当前对象)
//            //3. 类 TIKET.CLASS
//            synchronized (Tiket.class) {
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
//        }
//
//    }
    
    @Override
    public void run() {
        //线程同步 锁
        while (true) {
            //1.OBJECT 对象(显示)
            //2. THIS( 只当前对象)
            //3. 类 TIKET.CLASS
            synchronized (this) {
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
                    break;
                }
            }
        }

    }


    private void sell(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //t2
        System.out.println(Thread.currentThread().getName() + "--" + i);
        i--;

    }
}
