import java.util.*;

class Main
{  
    
    static boolean isPrime(int n)
    {
 

        if (n <= 1)
            return false;
 
        else if (n == 2)
            return true;
 
        else if (n % 2 == 0)
            return false;
 
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    static int power(int x, long y)
    {
        if( y == 0)
            return 1;
        if (y%2 == 0)
            return power(x, y/2)*power(x, y/2);
        return x*power(x, y/2)*power(x, y/2);
    }
 
    static int order(int x)
    {
        int n = 0;
        while (x != 0)
        {
            n++;
            x = x/10;
        }
        return n;
    }
 
 
    static boolean isArmstrong (int x)
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
 
    
    static int factorial(int n)
    {
        if (n == 0)
          return 1;
          
        return n*factorial(n-1);
    }
    
public static void main(String args[]){  

int n=args.length;  
if(n%2!=0){
    //odd 
    boolean isprime=false;
    for(int i=1;i<n;i++){
        if(isPrime(Integer.parseInt(args[i]))){
            isprime=true;
            break;
        }
    }
    if(isprime){
        int sum=0;
        for(int i=1;i<n;i++){
            sum+= Integer.parseInt(args[i]);
        }
        System.out.println(sum);
        
    }else{
        for(int i=1;i<n;i++){
        if(isArmstrong(Integer.parseInt(args[i]))){
            System.out.println(Integer.parseInt(args[i])+"is arrmstrong number");
        }
    }
    }
    
}else{
    try{
        for(int i=1;i<n;i++){
            int temp = factorial(Integer.parseInt(args[i]));
            if(temp>32767){
                 throw new ArithmeticException("Arithmetic exception : factorial value too large");    
            }else{
                System.out.println(temp);
            }
        }
    }catch(ArithmeticException e){
        System.out.println(e);
    }
}
}
}
