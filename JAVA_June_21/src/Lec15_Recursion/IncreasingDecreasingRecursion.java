package Lec15_Recursion;

public class IncreasingDecreasingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PI(5);

	}
	
	public static void PI(int n)
	{
		if(n<=0)
		{
			return;
		}
		else
		{
			System.out.println(n);
			PI(n-1);
			System.out.println(n);
		}
	}

}
