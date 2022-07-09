/*                               EXPERIMENT-6

   NAME:NIRANJAN MANGESH KHEDKAR
  ROLL NO:26
  DIV:B
 * 
 * AIM:Write a program to take input for ‘N’ integers in an array and display only those 
integers that are greater than the average of all integers.
*/
import java.util.Scanner;

class ArrayDemo
{
	public static void main(String args[])
	{
		int n,i,sum=0;
		int avg;

		System.out.println("Enter number of elements");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter "+ n +" Elements");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		for(i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		avg = sum/n;
		System.out.println("Elements greater than average are :");
		for(i=0;i<n;i++)
		{
			if(arr[i]>=avg)
			{
				System.out.print(arr[i]+"\t");
			}
		}
	}
}
