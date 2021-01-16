package multiThread;

/**
 * Created by Administrator on 2020/5/25 0025.
 */
public class TiketRunableTest {

    public static void main(String[] args) {
        TiketRunable tiketRunable  = new TiketRunable();
        Thread thread =  new Thread(tiketRunable);
        Thread thread2 =  new Thread(tiketRunable);
        thread.start();
        thread2.start();
        System.out.println("main-end");
    }
}
