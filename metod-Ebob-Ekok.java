package mypack;

import java.util.Scanner;

public class week9ex2metodebob {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter two numbers: ");
		n1=input.nextInt();
		n2=input.nextInt();
		System.out.println("EBOB ( "+n1+","+n2+"):"+Ebob(n1,n2));
        System.out.println("EKOK ( "+n1+","+n2+"):"+ekok(n1,n2));
      
        
	}public static int Ebob(int a,int b) {
		int min =(a<b)? a : b;	
		int ebob=1;
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b %i==0)
				ebob=i;
		}
		return ebob;
	}public static int ekok(int x,int y) {
		int ekok=1;
		int max=(x>y)? x:y;
		for (int carpım=max;carpım<=x*y;carpım++) {
			
			if(carpım%x==0 && carpım%y==0) {
				ekok=carpım;
				break;
				}
		}
		return ekok;
	}

}
