package Lec3;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int nst1=n/2+1;
		int nst2=n/2+1;
		int nsp=-1;
		
		while(row<=n) 
		{
			int cst1=1;
			
			while(cst1<=nst1) {
				System.out.print("*\t");
				cst1++;
			}
			
           int csp=1;
			
			while(csp<=nsp) {
				System.out.print("\t");
				csp++;
			}
			
          int cst2=1;
			
			while(cst2<=nst2) {
				if((row==1 || row==n) && cst2==nst2) {
					System.out.print("\t");
				}
				else
				{
					System.out.print("*\t");
				}
				
				cst2++;
			}
			
			if(row<=n/2) {
				nst1--;
				nst2--;
				nsp=nsp+2;
			}
			else
			{
				nst1++;
				nst2++;
				nsp=nsp-2;
			}
			
			System.out.println();
			row++;
			
			
		}

	}

}
