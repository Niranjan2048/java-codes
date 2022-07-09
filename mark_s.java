/*                               EXPERIMENT-8

   NAME:NIRANJAN MANGESH KHEDKAR
  ROLL NO:26
  DIV:B
 * 
 * AIM:


*/
import java.util.*;
class Student
{
	String name;
	int roll_no;
	Student(String n,int r)
	{
		name = n;
		roll_no = r;
	}
	void display()
	{
		System.out.println("Student name : "+name);
		System.out.println("Roll No. : "+roll_no);
	}
}

class Exam extends Student
{
	int m1,m2,m3;
	Exam(String n,int r, int x,int y,int z)
	{
		super(n,r);
		m1=x;
		m2=y;
		m3=z;
	}
	void display()
	{
		super.display();
		System.out.println("Marks of Subject 1 : "+m1);
		System.out.println("Marks of Subject 2 : "+m2);
		System.out.println("Marks of Subject 3 : "+m3);
	}
}

class Results extends Exam
{
	int total_marks;
	Results(String n,int r, int a,int b,int c)
	{
		super(n,r,a,b,c);
		total_marks = a+b+c;
	}
	void display()
	{
		super.display();
		System.out.println("Total Marks : "+total_marks);
	}
}

class mark_s
{
	public static void main(String args[])
	{
		String sname;
		int rn,sub1,sub2,sub3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the student : ");
		sname = sc.nextLine();
		System.out.print("Enter the Roll Number : ");
		rn = sc.nextInt();
		System.out.print("Enter marks of subject 1 : ");
		sub1 = sc.nextInt();
		System.out.print("Enter marks of subject 2 : ");
		sub2 = sc.nextInt();
		System.out.print("Enter marks of subject 3 : ");
		sub3 = sc.nextInt();
		
		System.out.println("\n*****MARKSHEET***\n");
		Results r = new Results(sname,rn,sub1,sub2,sub3);
		r.display();
	}
}
/*OUTPUT
Enter the name of the student : NIRANJAN MANGESH KHEDKAR
Enter the Roll Number : 26
Enter marks of subject 1 : 20
Enter marks of subject 2 : 30
Enter marks of subject 3 : 30

*****MARKSHEET***

Student name : NIRANJAN MANGESH KHEDKAR
Roll No. : 26
Marks of Subject 1 : 20
Marks of Subject 2 : 30
Marks of Subject 3 : 30
Total Marks : 80
*/
