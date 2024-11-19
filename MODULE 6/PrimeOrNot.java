package module6;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");

		int h=sc.nextInt();
		int number=100;
		int count=0;
		
		for(int i=1;i<=number;i++) {
			if((number % i)==0){
				number++;
				
			}
			if(number==2) {
				System.out.println("Prime");
			}
			else
				System.out.println("not prime");
			
		}

	}

}
