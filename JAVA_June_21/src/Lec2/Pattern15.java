package Lec2;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int row=1;
		int nst=n;
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
				nst--;
				nsp-=1;
			}
			else {
				nst++;
				nsp+=1;
			}
			row++;
			
			System.out.println();
		}

	}

}
