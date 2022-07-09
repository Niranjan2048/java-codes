/*                              EXPERIMENT-5

   NAME:NIRANJAN MANGESH KHEDKAR
  ROLL NO:26
  DIV:B
 * Write a program to implement a menu driven Calculator to perform addition, 
 * subtraction, multiplication and division functions.
 *  Create a user defined package to implement the above functions and 
 * import the same to invoke the above functions.
 */ 



import maths.Calc;
import java.util.Scanner;

class Calculator{
	public static void main(String args[]){
		int ch,a,b;
		  do{
			Calc c = new Calc();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two Numbers:");
					a= sc.nextInt();
					b =sc.nextInt();
			
			System.out.println("--------MENU---------");
			System.out.println("Enter choice:\n1.Add\n2.Sub\n5.Exit");
			ch= sc.nextInt();
			switch(ch){
				case 1:
					c.add(a,b);
					break;
				case 2:
					c.sub(a,b);
					break;
				case 3:
					c.mul(a,b);
					break;	
				case 4:
				    c.div(a,b);
				    break;
				 				
				case 5:
				    System.exit(0);		
			}
		}while(ch!=5);
	}
}
/*OUTPUT
Enter two Numbers:
15
12
--------MENU---------
Enter choice:
1.Add
2.Sub
5.Exit
1
Addition is : 27
Enter two Numbers:
33
34
--------MENU---------
Enter choice:
1.Add
2.Sub
5.Exit
2
Susbtraction is : -1
* */
