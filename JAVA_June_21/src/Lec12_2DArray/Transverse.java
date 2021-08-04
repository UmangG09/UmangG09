package Lec12_2DArray;

public class Transverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				
		};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr[0].length;j++) {
				
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		for(int [] arr1 :arr)
		{
			for(int arr2:arr1)
			{
				System.out.print(arr2+" ");
			}
			System.out.println();
			
		}

	}

}
