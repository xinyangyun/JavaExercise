package io;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2020/5/13 0013.
 */
public class InputStreamTest {

    public static void main(String[] args)  throws  Exception{
        //InputStream 是一个抽象类；
        InputStream inputStream =  new FileInputStream("c:/1.txt");
        //读文件，可以理解成吸
        /*System.out.println((char) inputStream.read());
        System.out.println((char) inputStream.read());
        System.out.println((char) inputStream.read());
        System.out.println(inputStream.read());*/
        int num =0;
        while ((num = inputStream.read())!=-1){
            System.out.println((char)num);
        }
        inputStream.close();

    }
}
