package module6;

import java.util.Scanner;

public class eleArray {

	public static void main(String[] args) {
		int[]i= {1,2,3,4,5,6};
		System.out.println("length of array"+i.length);
		for(int index=0;index<i.length;index++) {
			System.out.println(i[index]);
		}
			Scanner sc=new Scanner(System.in);
			System.out.println("size of array :");
			int size=sc.nextInt();
			int a[]=new int[size];
			for(int index=0;index<a.length;index++) {
				System.err.println("enter of ele a["+index+"]  :");
				a[index]=sc.nextInt();
				
			}
		// TODO Auto-generated method stub

	}

}
