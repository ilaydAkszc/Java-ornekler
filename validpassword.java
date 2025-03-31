package mypack;

import java.util.Scanner;

public class week9ex5validpassword {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("1. A password must have at least ten characters.");
		System.out.println("2. A password consists of only letters and digits.");
		System.out.println("3. A password must contain at least two digit.");
		System.out.println("Input a password: ");
		String password=input.nextLine();
		if(checkPassword(password))
			System.out.println("Password is valid :"+password);
		else
			System.out.println("Password is not valid.");

	}public static boolean checkPassword(String metin) {
		int n=metin.length();
		int sayi=0;
		int charsayi=0;
		if (n<10)
			return false;
		for(int i =0;i<n;i++) {
			
		char a=metin.charAt(i);
			
				if(Character.isDigit(a)) {
				  sayi++;
				}else if(Character.isLetter(a)) {
					charsayi++;
				}else
				return false;
			
		}
		if(sayi<2 && charsayi<2) {
			return false;
		}
		
		return true;
	}

}
