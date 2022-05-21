package com.cme.beans;

public class PrintNumbers {

    static int n=0;
    
    public static void main(String[] args) throws InterruptedException {
        n = Integer.parseInt(args[0]);
        System.err.println("=======Environment variable N value passed is :"+n);
        
        for(int i=0; i< n; i++) {
            System.out.println("I value is :"+i);
            Thread.sleep(1000);

        }
    }
}
