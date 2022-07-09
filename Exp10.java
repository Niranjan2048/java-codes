/*                               EXPERIMENT-10

   NAME:NIRANJAN MANGESH KHEDKAR
  ROLL NO:26
  DIV:B
 * 
 * AIM:Write a java program to create an abstract class named Shape that contains an
 *  empty method named numberofSides( ) and a non-abstract method display(). 
 * Provide three classes named Trapezoid, Triangle and Hexagon such that each one of the 
 * classes extends the class Shape. Each one of the classes contains only the method numberofSides ( ) 
 * that shows the number of sides in the given geometrical figures.
*/
abstract class shape
{   
    abstract void numberofsides();
    void display()
    {System.out.println("This is a non-abstarct method of abstract class shape");
		 
	}
	
}
class Trapezoid extends shape
{   int n;
	Trapezoid()
	{ n=5;
	}
   void numberofsides()
   {
	   System.out.println("Trapezoid has "+n+" sides");
   }   	
}
class Triangle extends shape
{   int n;
	Triangle()
	{ n=3;
	}
	 void numberofsides()
   {
	   System.out.println("Triangle has "+n+ " sides");
   } 
}
class Hexagon extends shape
{ int n;
	Hexagon()
	{ n=6;
	}
	 void numberofsides()
   {
	   System.out.println("Hexagon has "+n+" sides");
   } 
}



class Exp10
{
   public static void main(String args[])
    { /*Trapezoid t=new Trapezoid();
		t.numberofsides();
		Triangle tr=new Triangle();
		tr.numberofsides();
		Hexagon h=new Hexagon();
		h.numberofsides();
		*/
		shape s;
		s=new Trapezoid();
		s.numberofsides();
		s=new Triangle();
		s.numberofsides();
		s=new Hexagon();
		s.numberofsides();
        s.display();   
    
    }



}
/*OUTPUT
 * Trapezoid has 5 sides
Triangle has 3 sides
Hexagon has 6 sides
This is a non-abstarct method of abstract class shape
* */
