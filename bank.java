/*                                          EXPERIMENT-4

   NAME:NIRANJAN MANGESH KHEDKAR
  ROLL NO:26
  DIV:B
 * AIM :Define a class to record the bank details of a customer (name, account_no, balance) 
 * and define methods getData(), displayData() appropriately. Also define constructors to initialize the object.
 *  Demonstrate the methods in Bank class by defining an object in main().
*/


import java.util.Scanner;
class customer
{
  String name;
  int accno;
  double bal;
  
      customer(){}
      customer(String n)
      { name=n;
      }
      customer(String n,int a)
      { name=n;
        accno=a;
      }
      customer(String n,int a,double b)
      { name=n;
        accno=a;
        bal=b;
       }
       void getdata()
       {Scanner sc=new Scanner(System.in);
       System.out.println("Enter the customer data i.e Name,accounto and balance");
       name=sc.nextLine();
       accno=sc.nextInt();
       bal=sc.nextDouble();
       }
       void displdata()
       { System.out.println("Name-->"+name);
         System.out.println("account no-->"+accno);
         System.out.println("balance-->"+bal);
       }
}//end of customer class
class bank
{
  public static void main(String args[])
   { customer c1=new customer();
   System.out.println("Customer 1 data");
     c1.displdata();
     customer c2=new customer("Niranjan",7864);
     System.out.println("Customer 2 data");
    c2.displdata();
     customer c3=new customer("Niranjan");
     System.out.println("Customer 3 data");
     c3.displdata();
     customer c4=new customer("Niranjan",4567,10540978);
     System.out.println("Customer 4 data");
    c4.displdata();
    System.out.println("Customer 1 data user input");
      c1.getdata();
     c1.displdata();
   }
} 
/*Customer 1 data
Name-->null
account no-->0
balance-->0.0
Customer 2 data
Name-->Niranjan
account no-->7864
balance-->0.0
Customer 3 data
Name-->Niranjan
account no-->0
balance-->0.0
Customer 4 data
Name-->Niranjan
account no-->4567
balance-->1.0540978E7
Customer 1 data user input
Enter the customer data i.e Name,accounto and balance
aryan
500046
456879
Name-->aryan
account no-->500046
balance-->456879.0
*/  
     
    
     
                  
      
