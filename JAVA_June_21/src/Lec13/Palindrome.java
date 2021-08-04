package Lec13;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="ABCD";
		
		
		System.out.println(isPalindrome(st,reverse(st)));

	}

	
	public static String reverse(String st)
	{
		String rev = "";
		for(int i=st.length()-1;i>=0;i--)
		{
          rev=rev+(st.charAt(i));
		}
		return rev;
	}
	
	public static boolean isPalindrome(String st,String revString)
	{
		
		if(st.equals(revString))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
