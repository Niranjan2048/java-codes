class SI
{  public static void main(String args[])
         { int p,t;
           float si,r;
           SI ocj=new SI();
            p=10000;
             r=3.5f;
             t=2;
             si=ocj.Si(p,r,t);
               System.out.println("simple interest ="+si);
             }
    float Si(int p,float r,int t)
          { return ((p*r*t)/100);
          }
}  
 
