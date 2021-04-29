package gh;

import java.util.Scanner;

public class Program3 {
	public static double taxCalculator(int salary) {
		double tax;
		double sal =(double)salary;
		if(sal<=200000)
			tax=0;
		else if(sal<=300000)
			tax=0.1*(sal-200000);
		else if(sal<=500000)
			tax=(0.2*(sal-300000))+(0.1*100000);
		else if(sal<=1000000)
			tax=(0.3*(sal-500000))+(0.2*200000)+(0.1*100000);
		else
			tax=(0.4*(sal-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
		return tax;
	}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int salary=sc.nextInt();
		 
		 System.out.println("tax:"+taxCalculator(salary));
	 }
}
