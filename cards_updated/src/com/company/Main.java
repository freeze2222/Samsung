package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[52];
	int playerScore=0;
	int enemyScore=0;
	Boolean choose = true;
	String input;

// generate cards
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


	Scanner in = new Scanner( System.in );

        Random random=new Random();
							//random.setSeed();
        int Card=random.nextInt(0,51);
							//System.out.printf("array[51]=%d",array[51]);
        System.out.printf("You taked=%d\n",array[Card]);
	
		
	playerScore += array[Card];
	Card=random.nextInt(0,51);
	playerScore += array[Card];
	
	System.out.printf("You taked=%d\n",array[Card]);

	while ((choose) && playerScore<21){
		System.out.println("Do you want to take one more? Y\\N");
		input = in.next();
		if (input.toString().equals("Y")) { choose=true; }
		else if (input.toString().equals("N")) { choose=false; }
			else { 
				System.out.println("Bad input. We think you done");
				choose = false;
				break;
			}
		Card=random.nextInt(0,51);
		playerScore += array[Card];
		System.out.printf("You taked=%d\n",array[Card]);
	
	}
	
	System.out.printf("-------------------------------------------\n");

	if (playerScore>21) {System.out.printf(" You loose!");}
	else {

		System.out.printf("Computer start to play:\n");
		Card=random.nextInt(0,51);
		enemyScore += array[Card];
		System.out.printf("Computer taked=%d\n",array[Card]);

		Card=random.nextInt(0,51);
		enemyScore += array[Card];
		System.out.printf("Computer taked=%d\n",array[Card]);

		

		while ((choose) && enemyScore<21){
			if ( enemyScore > playerScore ) { choose = false; System.out.printf("You loose by com!");}
			else {
				Card=random.nextInt(0,51);
				enemyScore += array[Card];
				System.out.printf("Computer taked=%d\n",array[Card]);

			}	
				
		}
	
	}
	
	System.out.printf("playerScore: %d,ComputerScore: %d", playerScore, enemyScore);
	if(enemyScore>playerScore&&enemyScore<=21){
		System.out.println("You loose by dumb computer");
	}
	else if(playerScore>enemyScore&&playerScore<=21){
		System.out.printf("\nYou win!");
	}
	
	
	
    }
}
