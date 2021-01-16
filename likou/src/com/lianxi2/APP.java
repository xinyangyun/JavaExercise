package com.lianxi2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class APP {
    public static void main(String[] args) {
        //通过改造器指定排序规则
        PriorityQueue<Integer> q = new PriorityQueue<>((x, y) -> (y - x));
        //入列
        q.add(5);
        q.add(3);
        q.add(9);
        q.add(7);
        //出列
        while(!q.isEmpty())
        {
            System.out.print(q.poll()+" ");
        }
        
    }
}

