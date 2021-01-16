package com.snc.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Function;



public class test1 {
	public static void main(String[] args) {
		String s = "1234";
		change(s, (String str) -> {
			return Integer.parseInt(str);
		});
		
		
		Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -3);
        String format = dateFormat.format(calendar.getTime());
        
        System.out.println(format);
        
//        Request request = new Request.Builder()
//                .url("http://localhost:8080/hello")
//                .build();
        
        
	}

	public static void change(String s, Function<String, Integer> fun) {
		Integer i = fun.apply(s);
		System.out.println(i);
	}
}
