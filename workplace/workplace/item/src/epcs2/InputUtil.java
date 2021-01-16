package epcs2;

import java.util.Scanner;

/**
 * 输入帮助类
 */
public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * 获取整数
     */
    public static int getInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            e.printStackTrace();
            //递归
            return getInt();
        }
    }

    /**
     * 获取一个字符串
     *
     * @return
     */
    public static String getString() {
        return scanner.nextLine();
    }

    /**
     * 获取一个 小数
     *
     * @return
     */
    public static double getDouble() {

        return Double.parseDouble(scanner.nextLine());
    }

}
