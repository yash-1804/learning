package module6;

import java.util.Scanner;

public class Graade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a =");
//		int a=sc.nextInt();
//		System.out.println("enter b =");
//		int b=sc.nextInt();
		
		
//		else if ledders
		System.out.println("enter marks");
		int m=sc.nextInt();
		if(m<40) {
				System.out.println("fail");
		}else if(m >=40 && m <=50) {
			System.out.println("D grade");
		}else if(m>= 51 && m<=60) {
			System.out.println("c grade	");
		}else if (m>=61 && m<=70) {
			System.out.println("B grade");
		}else if (m>=71 && m<=80) {
			System.out.println("B+ grade");
		}else if (m>=81 && m<=90) {
			System.out.println("A grade");
		}else if (m>=91 && m<=100) {
			System.out.println("A+ grade");
			
		}else {
			System.out.println("input invalid");
			
			
		
		}


	}

}
