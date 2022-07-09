/*                                    EXPERIMENT-5

  NAME:NIRANJAN MANGESH KHEDKAR
  ROLL NO:26
  DIV:B


AIM:Write a program to add two numbers (two
integers, two floating point, one integer and
one float) using method overloading.
*/


import java.util.*;
class Method_demo
{ 

    int add(int a,int b)
    { return a+b;
    }
    float add(float a,float b)
    {  return a+b;
    }
    void add(int a,float b)
    {    
         float res;
         res=a+b;
         System.out.println("the addition of one integer and one float is: "+res);
      
    }
    void add(float a,int b)
     { 
        float res;
        res=a+b;
        System.out.println("the addition of one integer and one float is: "+res);
      
    }
    
}
class Overload_demo
{
  public static void main(String args[])
   {
     int a,b;
     float x,y;
     Method_demo m = new Method_demo();
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the value of two integers");
     a=s.nextInt();
     b=s.nextInt();
     System.out.println("Enter the value of two floating point numbers");
     x=s.nextFloat();
     y=s.nextFloat();
     System.out.println("the addition of both integers is : "+m.add(a,b));
     System.out.println("the addition of both floats is : "+m.add(x,y));
     m.add(x,a);
     m.add(b,y);
     
   }
}    
/*
 * output: Enter the value of two integers
4
5
Enter the value of two floating point numbers
2.6
1.7
the addition of both integers is : 9
the addition of both floats is : 4.3
the addition of one integer and one float is: 6.6
the addition of one integer and one float is: 6.7
 */    
     
     
       
