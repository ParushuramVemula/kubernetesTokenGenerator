package com.cme.beans;

public class PrintNumbers {

    static int n=0;
    
    public static void main(String[] args) throws InterruptedException {
        //n = Integer.parseInt(System.getenv("N"));
        System.err.println("==============="+n);
        n = Integer.parseInt("30");
        for(int i=0; i< n; i++) {
            System.out.println("I value is :"+i);
            Thread.sleep(1000);

        }
    }
}
