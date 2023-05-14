package InternSavy;

import java.util.Scanner;

public class TemparatureConversion {

	public static void main(String[] args) {
		
		/**
		 *  Temperature in celsius 45C
		 *  Temperature in Fahrenheit 98F 
		 *  To convert celsius formula c=f-32 * 5/9 
		 *   c=98-32 * 5/9
		 *   c=64 * 5/9 320/9
		 *   36.67 C  
		 *   two decimal points 35.57 C
		 *  To convert fahrenheit formula  f=c*9/5 + 32   
		 *  F=36.67*9/5 +32  
		 *   = 66.006+32
		 *   = 98.006 ~ 98.00 
		 *  
		 *    
		 */ 
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Temparature Conversion");
		System.out.println("Enter 1 for celsius conversion or enter 2 for fahrenheit  conversion"); 
		int chooseNum=sc.nextInt();
		
		switch(chooseNum)
		{
		case 1:System.out.println("Enter fahrenheit temparatue to convert celsius temparature Conversion"); 
				double fahrenheit1=sc.nextDouble();
				double celsius1=(fahrenheit1-32)*5/9 ; 
				System.out.println(Math.round(celsius1*100.0)/100.0); 
				break;
		case 2:System.out.println("Enter celsius temparatue to convert fahrenheit temparature Conversion"); 
				double celsius2=sc.nextDouble();
				double fahrenheit2=(celsius2 * 9/5) + 32 ; 
				System.out.println(Math.round(fahrenheit2*100.0)/100.0);  
				break;
		default:System.out.println("Enter the correct chooseNum for getting the best output"); 
				break;
		}
		sc.close();
		
		
	}

}
