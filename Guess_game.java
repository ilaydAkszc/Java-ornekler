package mypack;

import java.util.Scanner;

public class Guess_game {
	public static void main(String[] args) throws InterruptedException {
		Scanner input=new Scanner(System.in);
		System.out.println("Guess a number between 0 and 100\n");
		
		int random=(int)(Math.random()*100);
		
		int player=-1;
		//Guess of computer
		int comp=-1;
		//Let's assign low and high values ​​to determine the computer's prediction range	
		
		int low=0,high=100;
		
		while(player!=random && comp!=random) {
			System.out.println("Enter your guess: ");
			
			player=input.nextInt();
		
			
			if(player==random) {
				System.out.println("You won.....:)");
				break;
			}
			if (player<random) {
				System.out.println("Your guess is low. Player 2 guess....");
				//Let's increase the number by 1 so that the computer does not guess the same number.
				low=player+1;
			}else {
				System.out.println("Your guess is high.Player 2 guess....");
				//Let's decrease the number by 1 so that the computer does not guess the same number.
				high=player-1;
			}
		
			//Let's wait 1 second for the computer to guess
			Thread.sleep(1000);
			//the computer makes an intelligent guess based on the guess range
			if(low<random && random<high) {
				comp=low+(int)(Math.random()*(high-low));
			}
			
			System.out.println("Player 2's guess: "+comp);
			
			if(comp==random) {
				System.out.println("Player 2 won...");
				break;
			}
			
			if (comp<random) {
				System.out.println("Player 2's guess is low.");
				low=comp+1;
			}else {
				System.out.println("Player 2's guess is high.");
				high=comp-1;
			}
			
			
		}
		//input.close(); Enables the Scanner object to be closed and prevents resource leakage. But before closing you need to make sure that the program will not receive any more input!
		   input.close();
		

      }
}
