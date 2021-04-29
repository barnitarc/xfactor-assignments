package gh;

import java.util.Scanner;

public class Program2 {
	public static int divide(int numerator,int denominator) {
		int sign;
		if(numerator<0 && denominator<0) {
			sign=1;
		}
		else if(numerator>0 && denominator>0) {
			sign=1;
		}
		else
			sign=-1;
		int result=0;
		numerator=Math.abs(numerator);
		denominator=Math.abs(denominator);
		while(numerator>=denominator) {
			numerator=numerator-denominator;
			result++;
		}
		return sign*result;
	}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int m=sc.nextInt();
		 int d=sc.nextInt();
		 System.out.println("result:"+divide(m,d));
	 }
}
