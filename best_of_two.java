import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int a1=sc.nextInt();
		    int a2=sc.nextInt();
		    int a3=sc.nextInt();
		    int b1=sc.nextInt();
		    int b2=sc.nextInt();
		    int b3=sc.nextInt();
		    int suma=a1+a2+a3;
		    int sumb=b1+b2+b3;
		    int mina=Math.min(a1,Math.min(a2,a3));
		    int minb=Math.min(b1,Math.min(b2,b3));
		    int A=suma-mina;
		    int B=sumb-minb;
		    if(A>B)System.out.println("ALICE");
		    else if(A<B)System.out.println("BOB");
		    else System.out.println("TIE");
		    
		}

	}
}
