/*                       EXPERIMENT-13

   NAME:NIRANJAN MANGESH KHEDKAR
  ROLL NO:26
  DIV:B
 * 
 * AIM:Write a program to print 1A2B3C4D5E6F7G8H9I10J using two child .
*/
class Digit extends Thread
{
   public void run()
    {  
       for(int i=1;i<10;i++)
       {
           System.out.print(i);
           try 
           { Thread.sleep(500);
           }
           catch(Exception e)
           {
           }
       }
    }      
           
    
}
class Alphabet extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.print((char)(64+i));
			try
			{
				Thread.sleep(550);
			}
			catch(Exception e)
			{
			}
		}
	}
}
	
class Exp13
{
	public static void main(String args[])
	{
		System.out.println("Multi-threading");
		
		Digit d = new Digit();
		d.start();
		
		Alphabet a = new Alphabet();
		a.start();
	}
}	
/*
 * OUTPUT
 * Multi-threading
1A2B3C4D5E6F7G8H9IJ
*/
  
