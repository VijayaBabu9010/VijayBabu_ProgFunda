package com.gradedproject.q2;

import java.util.Scanner;

public class PowerOfN {
	static int power(int X,int N ) {
		if (N==0)
			return 1;
		int r=power(X,N/2);
		if (N%2==0) 
			return r*r;
		else 
			return r*r*X;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base number X:");
		int X=sc.nextInt();
		System.out.println("enter the power N:");
		int N=sc.nextInt();
		sc.close();
		System.out.println("X power N is :"+power(X, N));
	}

}