import java.io.*;
class NONRESTORING
{
public static int[] lshift(int s1[],int s2)
{
int s[]=new int [4];
for(int i=0;i<3;i++)
{
s[i]=s1[i+1];
}
s[3]=s2;
return(s);
}
 
public static int[] add(int A[],int B[])
{
int s[]=new int [4];
int c=0;
for(int i=3;i>=0;i--)
{
s[i]=((A[i]+B[i]+c)%2);
c=(A[i]+B[i]+c)/2;
}
return(s);
}
 
public static void display(int a[],int q[],int m[])
{
for(int i=0;i<4;i++)
System.out.print(a[i]);
System.out.print(" ");
for(int i=0;i<4;i++)
System.out.print(q[i]);
System.out.print(" ");
for(int i=0;i<4;i++)
System.out.print(m[i]);
System.out.print(" ");
}
 
public static void main(String args[])throws Exception
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int ac[]={0,0,0,0};
int M[]={0,0,0,0};
int Q[]={0,0,0,0};
int K[]={0,0,0,1};
int M1[]=new int[4];
int i;
int count=4;
System.out.print("ENTER THE DIVIDEND :");
for(i=0;i<4;i++)
Q[i]=Integer.parseInt(br.readLine());
System.out.print("ENTER THE DIVISOR :");
for(i=0;i<4;i++)
M[i]=Integer.parseInt(br.readLine());
System.out.println(" A    	Q      M");
display(ac,Q,M);
System.out.println();
while(count>0)
{
if(ac[0]==0)
{
int q1=Q[0];
ac=lshift(ac,q1);
Q=lshift(Q,0);
display(ac,Q,M);
System.out.println("LEFT SHIFT");
for(int j=0;j<4;j++)
{
if(M[j]==0)
M1[j]=1;
else
M1[j]=0;
}
M1=add(M1,K);
ac=add(ac,M1);
display(ac,Q,M);
System.out.println("SUBTRACTION");
}
else
{
int q1=Q[0];
ac=lshift(ac,q1);
Q=lshift(Q,0);
display(ac,Q,M);
System.out.println("LEFT SHIFT");
ac=add(ac,M);
display(ac,Q,M);
System.out.println("ADDITION");
}
if(ac[0]==0)
{
Q[3]=1;
display(ac,Q,M);
System.out.println("AFTER Q[3]=1");
}
else
{
Q[3]=0;
display(ac,Q,M);
System.out.println(" AFTER Q[3]=0");
}
count--;
}
if(count==0)
{
if(ac[0]==0)
{
}
else
{
ac=add(ac,M);
display(ac,Q,M);
System.out.println("ADDITION");
}
}
}
}
