package Lec2;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int row=1;
		int nst=1;
		int nsp=n-1;
		
		while(row<=2*n-1) {
			
			//Work
			int csp=1;
			
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
				
			}
			
            int cst=1;
			
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
				
			}
			
			//Update
			if(row<=n-1) {
				nst++;
				nsp--;;
			}
			else {
				nst--;
				nsp++;
			}
			row++;
			
			System.out.println();
		}

	}

}
