package com.lianxi2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class APP {
    public static void main(String[] args) {
        //ͨ��������ָ���������
        PriorityQueue<Integer> q = new PriorityQueue<>((x, y) -> (y - x));
        //����
        q.add(5);
        q.add(3);
        q.add(9);
        q.add(7);
        //����
        while(!q.isEmpty())
        {
            System.out.print(q.poll()+" ");
        }
        
    }
}

