package com.company.loop;

public class DoWhile {
    public static void main(String[] args) {
        int iVal = 5;
        do {
            System.out.println(iVal);
            System.out.println(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);


        } while (iVal < 25);
    }
}
