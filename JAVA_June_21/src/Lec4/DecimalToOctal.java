package Lec4;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=544;
		int mul=1;
		int ans=0;
		while(n!=0)
		{
			int rem=n%8;
			ans=rem*mul+ans;
			n=n/8;
			mul=mul*10;
		}
		System.out.println(ans);

	}

}
