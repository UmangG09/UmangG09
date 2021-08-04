package Lec11_Array;

public class MaxSingleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-2,-10,4,5,-7,10};
		int maxsum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		   sum=sum+arr[i];
		   maxsum=Math.max(sum, maxsum);
		   if(sum<0)
		   {
			   sum=0;
		   }
		  
		}
		
		System.out.println(maxsum);

	}

}
