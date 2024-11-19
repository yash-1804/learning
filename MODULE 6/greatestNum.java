package module6;

import java.util.Scanner;

public class greatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first no :");
		int a = sc.nextInt();
		System.out.println("enter the second no :");
		int b = sc.nextInt();
		System.out.println("ent the third no :");
		int c = sc.nextInt();

		if (a > b) {
		System.out.println("num "+a);
		} else if (b >c) {
			System.out.println("big num" + b);
		} else {
			System.out.println("big num " + c);
		}

	}

}
