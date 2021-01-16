package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 1. FileOutputStream("c:/2.txt") 默认创建文件夹
 * 2. 每次写会覆盖之前的文件
 */
public class OutputStreamTest {

    public static void main(String[] args) throws IOException{
        OutputStream outputStream =  new FileOutputStream("c:/2.txt");
        outputStream.write('a');
    }
}
