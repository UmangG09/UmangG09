package Lec2;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int row=1;
		int nst=2*n-1;
		int nsp=0;
		
		while(row<=n) {
			
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
			row++;
			nst-=2;
			nsp++;
			System.out.println();
		}

	}

}
