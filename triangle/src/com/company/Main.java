package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int g=1;
        int j;
        //Scanner in=new Scanner(System.in);
        //int input=in.nextInt();
        int input=5; //del me
        for (int i = 0;i<input; i++) {
            j=0;
            for (int k = 0; k < input+input*2-i-i; k++) {

                    System.out.print(" ");

            }

            while (j!=g){
                System.out.print("/\\");
                j++;
            }
            g=g+2;
            System.out.println("");
        }
    }
}
