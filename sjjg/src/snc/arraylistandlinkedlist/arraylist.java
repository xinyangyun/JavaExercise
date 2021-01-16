package snc.arraylistandlinkedlist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import org.joda.time.DateTime;

public class arraylist {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("235");
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("235");
		linkedList.add(0, "ggg");
		
		Calendar now =  Calendar.getInstance();
		String key = now.get(Calendar.YEAR) +"-"+(now.get(Calendar.MONTH) + 1)+"-" + now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(key);  
		
		System.out.println(now.getTime().toString());
		
		
		System.out.println(list.contains("123"));
		
		String key1 = String.format(now.get(Calendar.YEAR) +"-"+(now.get(Calendar.MONTH) + 1)+"-" + now.get(Calendar.DAY_OF_MONTH));
		System.out.println(key1);
		
		String key2 = String.format("%s%s%s",now.get(Calendar.YEAR),(now.get(Calendar.MONTH) + 1), now.get(Calendar.DAY_OF_MONTH));
		System.out.println(key2);
		
		String key3 = DateTime.now().toString("yyyyMMddHH");
		System.out.println(key3);
		
	}
}
