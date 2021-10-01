package com.company;

import java.util.Arrays;

public class Cards {

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
        System.out.println(Arrays.toString(array));
        }
    }

