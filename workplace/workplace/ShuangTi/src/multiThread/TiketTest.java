package multiThread;

/**
 * Created by Administrator on 2020/5/25 0025.
 */
public class TiketTest {

    public static void main(String[] args) {
    	//开一个窗口
        Object obj = new Object();

//        Tiket tiket = new Tiket(obj);
        Tiket tiket = new Tiket();
        tiket.start();
//        Tiket tiket1 = new Tiket(obj);
        Tiket tiket1 = new Tiket();
        tiket1.start();
    }
}
