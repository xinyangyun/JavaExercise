package io;

import java.io.*;

/**
 * Created by Administrator on 2020/5/13 0013.
 */
public class InputOutStreamArrayTest {

    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream =  new FileInputStream("c:/1.txt");
            outputStream = new FileOutputStream("c:/2.txt");

            //读入数据
            int size =0;
            byte[] store=  new byte[1024*4];
            while ((size =inputStream.read(store))!=-1){
                /*System.out.println(size);
                System.out.println(new String(store));*/
                /*outputStream.write(store,0,2);
                outputStream.write(store,0,1);*/
                // 写出数据
                /*outputStream.write(num);
                System.out.println(size);
                System.out.println(new String(store));
                outputStream.write(store);
                // b[] 为我们要写入的数组 off 为起始值， len 为 写入的长度
                /*write(byte b[], int off, int len)*/
                outputStream.write(store,0,size);

            }

        }catch (IOException e){
            e.printStackTrace();
        }
        // 关闭资源
        finally {
            if(inputStream!=null){
                try {
                    inputStream.close();
                }catch ( IOException e){
                    e.printStackTrace();
                }
            }
            if(outputStream!=null){
                try {
                    outputStream.close();
                }catch ( IOException e){
                    e.printStackTrace();
                }
            }

        }

    }
}
