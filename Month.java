/*                               EXPERIMENT-12

   NAME:NIRANJAN MANGESH KHEDKAR
  ROLL NO:26
  DIV:B
 * 
 * AIM:Write a program to accept the month number from the user and display the month name.
 *  Throw an exception if an improper month number is entered. Make your own exception 
 * class to handle this exception.
*/
import java.util.*;

class MonthNumberException extends Exception
{
	String msg;
	MonthNumberException()
	{
		msg = "Invalid month number. Please enter a valid number between 1 to 12 ";
	}
}

class Month
{
	public static void main(String args[])
	{
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month number");
		m = sc.nextInt();
		try
		{
			if(m>=1 && m<=12)
			{
				System.out.print("It is valid month number and month name is ");
				switch(m)
				{
					case 1: System.out.println("January");
							break;
							
					case 2: System.out.println("February");
							break;
					
					case 3: System.out.println("March");
							break;
					
					case 4: System.out.println("April");
							break;
							
					case 5: System.out.println("May");
							break;
							
					case 6: System.out.println("June");
							break;
							
					case 7: System.out.println("July");
							break;
					
					case 8: System.out.println("August");
							break;
					
					case 9: System.out.println("September");
							break;
							
					case 10: System.out.println("October");
							break;
							
					case 11: System.out.println("November");
							break;
							
					case 12: System.out.println("December");
							break;
				}
			}
			else
			{
				throw new MonthNumberException();
				
			}
		}
		catch(MonthNumberException e)
		{
			System.out.println(e.msg);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
	}
}
