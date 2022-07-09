//Write a program to display largest number from array
import java.util.*;
class largest
{
    public static void main(String args[])
     {
      int i,n,max;
      
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the no of arrays elements");
      n=s.nextInt();
      int a[] = new int[n];
      System.out.println("enter the array elements");
      for(i=0;i<n;i++)
      { a[i]=s.nextInt();
      }
      max=a[0];
      for(i=0;i<n-1;i++)
      { if(a[i]<a[i+1])
         max=a[i+1];
        else
         max=a[i];
      }
      System.out.println("The largest element is "+max);
      }
          
}      
