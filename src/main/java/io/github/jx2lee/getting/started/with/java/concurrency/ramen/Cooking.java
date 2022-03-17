package io.github.jx2lee.getting.started.with.java.concurrency.ramen;

import java.util.Scanner;

public class Cooking {
    public static void main(String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("라면 몇 개 끓일까요?");

        num = input.nextInt();

        System.out.println(num + "개 주문 완료! 조리시작!");
        try
        {
            RamenCook ramenCook = new RamenCook(num);
            new Thread(ramenCook,"A").start();
            new Thread(ramenCook,"B").start();
            new Thread(ramenCook,"C").start();
            new Thread(ramenCook,"D").start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
