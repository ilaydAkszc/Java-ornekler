package mypack;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");	
		int number=input.nextInt();
		int s1=1;
		int s2=1;
		int toplam ;
		System.out.print("Fibonacci :");
	
		for(int i=1;i<=number;i++) {
			System.out.print(s1+",");
			toplam=s1+s2;
			s1=s2;
		    s2=toplam;
		    }
	}

}
