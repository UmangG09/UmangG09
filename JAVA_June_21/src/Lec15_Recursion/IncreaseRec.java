package Lec15_Recursion;

public class IncreaseRec {

	public static int givenNo=5;
	public static int n=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PI(n);
		

	}
	
	public static void PI(int n)
	{
		
		if(n>givenNo)
		{
			return;
		}
		else
		{
			System.out.println(n+" ");
			PI(n+1);
		}
	}

}
