package Lec4;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1040;
		int mul=1;
		int ans=0;
		while(n!=0)
		{
			int rem=n%10;
			ans=rem*mul+ans;
			n=n/10;
			mul=mul*8;
		}
		
		System.out.println(ans);

	}

}
