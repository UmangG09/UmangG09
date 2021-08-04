package Lec12_2DArray;

public class SprialArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{10,11,12,13}
				
		};
		
		int minrow=0;
		int maxrow=arr.length-1;
		int mincol=0;
		int maxcol=arr.length-1;
		
		int te=arr[0].length*arr[1].length;
		int count=0;
		
		while(count<te)
		{
			for(int i=mincol;i<=maxcol;i++)
			{
				System.out.println(arr[minrow][i]+" ");
				count++;
				
			}
			minrow++;
			
			for(int i=minrow;i<=maxrow;i++)
			{
				System.out.println(arr[i][maxcol]+" ");
				count++;
				
			}
			maxcol--;
			
			
			for(int i=maxcol;i>=mincol;i--)
			{
				System.out.println(arr[maxrow][maxcol]+" ");
				count++;
				
			}
			
		}

	}

}
