package Lec12_2DArray;

public class Array2D {
	
	public static void main(String[] args)
	{
		
		int [][] arr= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
				
		};
		
		int i, j,k;
	     
	    // accessing element column wise
	    for (i = 0; i < 4; i++)
	    {
	        for (j = 0; j < 3; j++)
	        {
	        System.out.print(arr[j][i]+" ");
	        }
	        
	        for(k=j-1;k>0;k--)
	        {
	        	System.out.print(arr[k][i]+" ");
	        }
	        System.out.println();
	    }
	    
	    
	}

}
