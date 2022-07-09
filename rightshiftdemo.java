/*                          EXPERIMENT-1

NAME:NIRANJAN MANGESH KHEDKAR
ROLL NO:26
DIV:B

AIM:Write a program to take input for an integer from the user and perform 
*   both bitwise right shift operations. Take input
*   for the no. of positions to be shifted. (Use Scanner class to accept user input)
*/

import java.util.Scanner;
// import java.util.*;
class rightshiftdemo
{ public static void main(String args[])
     {  int n,b,res;
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter an integer");
        n=s.nextInt();
        
        System.out.println("Enter no of bits by which number to be right shifted");
        b=s.nextInt();
        
        res=n>>b;// signed right shift
        System.out.println("After signed right shifting ouptut is:");
        System.out.println(n+">>"+b+"="+res);
        
        
        res=n>>>b;//unsigned right shift
        System.out.println("after unsigned right shifting output is:");
        System.out.println(n+">>>"+b+"="+res);
      }
}  


/*output 1
 * Enter an integer
5
Enter no of bits by which number to be right shifted
3
After signed right shifting ouptut is:
5>>3=0
after unsigned right shifting output is:
5>>>3=0
*/
 
