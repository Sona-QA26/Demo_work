package Assignmentquest;//java package

import java.util.Scanner;

public class findfactorial {

	public static void main(String[] args) {
		//finding factorials using loops
//		int a=5;
//		long fact=1;
//		for(int i=1;i<=a;i++)
//		{
//			fact=fact*i;
//			
//		}
//		System.out.println("factorial of 5 = "+fact);
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int x=Integer.parseInt(a);
		long f=1;
		for(int i=1;i<=x;i++)
		{
			f=f*i;
		}
		System.out.println("factorial of "+a+" is "+f);
		
		
	}

}
