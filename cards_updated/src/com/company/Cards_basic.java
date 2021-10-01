package com.company;

import java.util.Random;

public class Cards_basic {

    public static void main(String[] args) {
        int[] array = new int[52];

        for (int i=2; i<54; i++) {
            if ((i-2) % 13 < 9) {
                array[i-2] = i %13;
            }
            else if((i-2)%13==9){
                array[i-2] = 2;
            }
            else if((i-2)%13==10){
                array[i-2] = 3;
            }
            else if((i-2)%13==11){
                array[i-2] = 4;
            }
            else if((i-2)%13==12){
                array[i-2] = 1;
            }



        }
        Random random=new Random();
        int Card=random.nextInt(0,51);
        //System.out.printf("array[51]=%d",array[51]);
        System.out.printf("We taked=%d card",Card);
    }
}
