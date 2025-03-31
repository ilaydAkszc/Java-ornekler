package mypack;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
        int bakiye=1000,secim,miktar;
        System.out.println("KAZIKBANK'A HOSGELDINIZ!!!\n");
        System.out.println("Guncel bakiyeniz: \n"+bakiye);
      
        
        while(bakiye>0) {
   
            System.out.println("+-------------------+");
        	System.out.println("1-Para yatir \n"
        			+ "2-Para cek \n"
        			+ "3-Bakiye sorgula \n"
        			+ "4-Cikis yap");
        	
        	System.out.println("+-------------------+");
        	System.out.print("Yapmak istediginiz islemi giriniz: \n");
       
            secim=input.nextInt();
            if(secim==1) {
            	System.out.print("Yatirmak istediginiz miktar: ");
            	miktar=input.nextInt();
            	bakiye+=miktar;
            }else if(secim==2) {
            	
            	System.out.print("Cekmek istediginiz miktar: ");
            	miktar=input.nextInt();
            	if(miktar<bakiye) {
            	bakiye-=miktar;
            }else {
            	System.out.println("Yetersiz bakiye!!!");
            }
            }else if(secim==3) {
            	System.out.println("Bakiyeniz: "+bakiye);	
            }else if (secim==4) {
             System.out.println("Cikis yapiliyor....");
             break;
            }else {
            	System.out.println("Gecerli bir islem giriniz!");
            }
        }
        
	}

}
