package Lec4;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=84;
		int mul=1;
		int ans=0;
		while(n!=0)
		{
			int rem=n%2;
			ans=rem*mul+ans;
			n=n/2;
			mul=mul*10;
		}
		System.out.println(ans);

	}

}
