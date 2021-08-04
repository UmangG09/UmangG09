package Lec15_Recursion;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fibo(5));
		System.out.println(fiboTail(5,0,1));

	}

	
	public static int fibo(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		else
		{
			int t=fibo(n-1)+fibo(n-2);
			
			return t ;
		}
	}
	
	
	public static int fiboTail(int n,int a,int b)
	{
		if(n==1)
		{
			return b;
		}
		else
		{
			
			
			return fiboTail(n-1,b,a+b);
					
		}
	}
}
