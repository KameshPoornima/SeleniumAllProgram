package com.day2.org;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Mark {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the m1:");
		int m1 = sc.nextInt();
		System.out.println("Empid is:"+m1);
		
		System.out.println("Enter the m2:");
		int m2 = sc.nextInt();
		System.out.println("Empid is:"+m2);
		
		System.out.println("Enter the m3:");
		int m3 = sc.nextInt();
		System.out.println("Empid is:"+m3);
		
		System.out.println("Enter the m4:");
		int m4 = sc.nextInt();
		System.out.println("Empid is:"+m4);
		
		System.out.println("Enter the m5:");
		int m5 = sc.nextInt();
		System.out.println("Empid is:"+m5);
		
		System.out.println("Sum of all Number:"+(m1+m2+m3+m4+m5));
		System.out.println("Avg og all Number:"+((m1+m2+m3+m4+m5)%100));
	}

}
