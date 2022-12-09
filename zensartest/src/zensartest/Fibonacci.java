package zensartest;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int f=0,s=1;
		System.out.println(f);
		System.out.println(s);
		for(int i=2;i<n;i++) {
			int third=f+s;
			f=s;
			s=third;
			System.out.println(third);
		}
		
	}
}
