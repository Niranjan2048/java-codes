import java.util.*;
import com.google.common.math.IntMath; 


class Numeric
{  
public static void main(String args[]){  


int n=args.length; 
int order(int x)
    {
        int n = 0;
        while (x != 0)
        {
            n++;
            x = x/10;
        }
        return n;
    }
 boolean isArmstrong (int x)
    {
        // Calling order function
        int n = order(x);
        int temp=x, sum=0;
        while (temp!=0)
        {
            int r = temp%10;
            sum = sum + power(r,n);
            temp = temp/10;
        }
 
        // If satisfies Armstrong condition
        return (sum == x);
    }
try{
	for(int i=0;i<n;i++)
{  
System.out.println(args[i]);  
int j = Integer.parseInt(args[i]);

	
	if(j % 2==0)
	{   
	Factorial f=new Factorial();
	long num=f.factorial(j);
	
	
	
	     if(num<32767)
	     {System.out.println(num);
	       
	      }
       else{ 
		 throw ArithmeticException;
	   }
     }
     else
       { //odd 
    boolean isprime=false;
    for(int i=1;i<n;i++){
        if(IntMath.isPrime(args[i])){
            isprime=true;
            break;
        }
    }
    if(isprime()){
        int sum=0;
        for(int i=1;i<n;i++){
            sum+= args[i];
        }
        System.out.println(sum);
        
    }else{
        for(int i=1;i<n;i++){
        if(armstrong(args[i])){
            System.out.println(args[i]+"is arrmstrong number");
        }
    }
       }
    
 }}

} catch(ArithmeticException e){
        System.out.println("Arithmetic exception : factorial value too large + "+ e);
    } 
}  


 class Factorial {
    public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}

