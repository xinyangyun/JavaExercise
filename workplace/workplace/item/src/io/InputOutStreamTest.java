package io;

import java.io.*;

/**
 * Created by Administrator on 2020/5/13 0013.
 */
public class InputOutStreamTest {

    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream =  new FileInputStream("c:/1.txt");
            outputStream = new FileOutputStream("c:/2.txt");

            //读入数据
            int num =0;
            while ((num =inputStream.read())!=-1){
                // 写出数据
                outputStream.write(num);
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
