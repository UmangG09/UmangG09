package Lec4;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1010100;
		int mul=1;
		int ans=0;
		while(n!=0)
		{
			int rem=n%2;
			ans=rem*mul+ans;
			n=n/10;
			mul=mul*2;
		}
		
		System.out.println(ans);

	}

}
