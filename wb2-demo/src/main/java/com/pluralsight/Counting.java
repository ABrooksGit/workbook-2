package com.pluralsight;

public class Counting {

    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;

            System.out.println("i  =" + i);
            System.out.println("sum = " + sum);
            System.out.println();

            i++;
        }
        System.out.println("-------------------------------------");
        System.out.println("Sum = " + sum);



    }
}
