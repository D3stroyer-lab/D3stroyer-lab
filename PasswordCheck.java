package com.javaprojects;

import java.util.Scanner;

public class PasswordCheck {
public static int checkPassword(String str,int n) {
	if(n<4) {
		return 0;
	}
	    if(str.charAt(0)>=0 && str.charAt(0)<=9) {
		return 0;
	}
	int cap=0,num=0;
	for(int i=0;i<n;i++) {
		   if(str.charAt(i)==' ' || str.charAt(i)=='/') {
			return 0;
		}
		   if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			cap++;
		}
		   if(str.charAt(i)>=0 && str.charAt(i)<=9) {
			num++;
		}		
	}
	if(cap>0 && num>0) {
		return 1;
	}
	return 0;
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Password");
		String pass= s.next();
		System.out.println(checkPassword(pass,pass.length()));	
	}
}
