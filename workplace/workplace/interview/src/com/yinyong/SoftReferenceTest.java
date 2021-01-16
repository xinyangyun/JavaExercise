package com.yinyong;

import java.lang.ref.SoftReference;

public class SoftReferenceTest {
	public static void main(String[] args) {
		SoftReference<byte[]> m = new SoftReference<>(new byte[1024*1024*10]);
		
	}
}
