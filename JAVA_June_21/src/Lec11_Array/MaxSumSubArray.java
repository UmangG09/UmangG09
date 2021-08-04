package Lec11_Array;

public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {2,-10,4,5,-7,10};
		
		//System.out.println(maxSumSubArray(arr));
		//System.out.println(maxSumSubArray2(arr));
		System.out.println(maxSumSubKadane(arr));

	}
	
	//Way 1 with 3 Loops
	public static int maxSumSubArray(int [] arr)
	{
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum=sum+arr[k];
				}
				
				maxsum=Math.max(sum, maxsum);
				
			}
		}
		
		return maxsum;
	}
	
	//Way2 With loop2
	public static int maxSumSubArray2(int [] arr)
	{
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				
				sum=sum+arr[j];
				
				maxsum=Math.max(sum, maxsum);
				
			}
		}
		
		return maxsum;
	}
	
	//Way3 Kadenes Algo
		public static int maxSumSubKadane(int [] arr)
		{
			int maxsum=Integer.MIN_VALUE;
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				
				//Step 1 Calculate Sum
				sum=sum+arr[i];
				//find Max and assign to maxsum
				maxsum=Math.max(maxsum,sum);
				//Check sum negative then reset to zero
				if(sum<0)
				{
					sum=0;
				}
			}
			
			return maxsum;
		}

}
