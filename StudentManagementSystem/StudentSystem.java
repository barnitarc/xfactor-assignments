package gh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	String name,gender,address;
	int age;
	Student(String n ,int a,String g,String add){
		this.name=n;
		this.age=a;
		this.gender=g;
		this.address=add;
	}
}
class Department{
	String dname,hod;
	Department(String n,String h){
		this.dname=n;
		this.hod=h;
	}
}
public class StudentSystem {
	public static Student addStudent(Scanner sc) {
		
		return null;
		
		
			
		
	}
	public static void main(String[] args) {
		int choice;
		System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM");
		Scanner sc =new Scanner(System.in);
		List<Student> sList=new ArrayList<Student>();
		List<Department> dList=new ArrayList<Department>();
		while(true) {
			System.out.println("1.Add Student\n2.List Student\n3.Add department\n4.List Department\n5."
					+ "Remove Student \n6.Remove Department\n");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Selected to add a Student :");
				System.out.println("Enter the details of the Student:");
				try {
					System.out.print("Name:");
					sc.nextLine();
					String name=sc.nextLine();
					//sc.nextLine();
					System.out.print("Age:");
					int age=sc.nextInt();
					sc.nextLine();
					System.out.print("Gender(Male/Female):");
					String gender=sc.nextLine();
					
					System.out.print("Address:");
					String address=sc.nextLine();
					Student s=new Student(name,age,gender,address);
					sList.add(s);
				}
				catch(Exception e){
					System.out.println("entered wrong input:try again");
					addStudent(sc);
				}
				
				
				System.out.println("Student added successfully");
				break;
			case 2:
				System.out.println("Selected to list all Students:");
				System.out.println("-----------------------------------------------------");
				System.out.printf("%25s |%2s |%7s |%5s", "NAME", "AGE", "GENDER", "ADDRESS");
				System.out.println("");
				System.out.println("-----------------------------------------------------");
			    
				for(Student s1:sList) {
					System.out.format("%25s |%3d |%7s |%5s",s1.name,s1.age,s1.gender,s1.address);
					System.out.println();
					//System.out.println(s1.name+"|"+"|"+s1.gender+"|"+s1.address);
				}
				break;
			case 3:
				System.out.println("Selected to add a Department :");
				System.out.println("Enter the details of the Department:");
				try {
					System.out.print("Name:");
					sc.nextLine();
					String name=sc.nextLine();
					//sc.nextLine();
					System.out.print("HOD:");
					String hod=sc.nextLine();
					dList.add(new Department(name,hod));
				}
				catch(Exception e) {
					System.out.println("entered wrong input:try again");
				}
				System.out.println("Department added succesfully");
				break;
			case 4:
				System.out.println("Selected to list all Departments:");
				System.out.println("----------------------------------------");
				System.out.printf("%25s |%5s", "NAME", "HOD");
				System.out.println("");
				System.out.println("----------------------------------------");
			    
				for(Department s1:dList) {
					System.out.format("%25s |%5s",s1.dname,s1.hod);
					System.out.println();}
				break;
			case 5:
				System.out.println("Selected to remove a Student:");
				System.out.println("Enter the name of Student");
				sc.nextLine();
				int flag=0;
				String n=sc.nextLine();
				//System.out.println(n);
				for(Student s2:sList) {
					//System.out.println(s2.name);
					if(n.equals(s2.name)) {
						//System.out.println(s2.name);
						sList.remove(sList.indexOf(s2));
						flag=1;
						break;
					}
				}
				if(flag==0)
					System.out.println("no Student with this name found");
				else
					System.out.println("Successfully removed");
				break;
					
			case 6:
				System.out.println("Selected to remove a department:");
				System.out.println("Enter the name of Department");
				sc.nextLine();
				int flag1=0;
				String n1=sc.nextLine();
				for(Department s2:dList) {
					if(n1.equals(s2.dname)) {
						dList.remove(s2);
						flag1=1;
						break;
					}
				}
				if(flag1==0)
					System.out.println("no Department with this name found");
				else
					System.out.println("Successfully removed");
				break;
			default:
				System.out.println("invalid choice");
				System.exit(0);
				break;
				
			}
				
		}
	}
	

}
