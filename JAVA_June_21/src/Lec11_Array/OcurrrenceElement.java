package Lec11_Array;

public class OcurrrenceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,1,2,2,2,3,3,4,5,5,7};
		//int [] arr= {1,2,3};
		int n=2;
		//int position=firstOccurence(arr,n);
		int position=lastOccurence(arr,n);
		System.out.println(position);

	}

	public static int firstOccurence(int [] arr,int ele) {
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(ele==arr[mid])
			{
				ans=mid;
				high=mid-1;
			  
			}
			else if(ele > arr[mid]) {
				
				low=mid+1;
			}
			else if(ele< arr[mid]) {
				
				high=mid-1;
			}
			
		}
		
		return ans;
				
	}
	
	
	public static int lastOccurence(int [] arr,int ele) {
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(ele==arr[mid])
			{
				ans=mid;
				low=mid+1;
			  
			}
			else if(ele > arr[mid]) {
				
				low=mid+1;
			}
			else if(ele< arr[mid]) {
				
				high=mid-1;
			}
			
		}
		
		return ans;
				
	}

	 
	
	public static int UpperBound(int[] arr,int ele)
	{
		int low = 0;
		int high = arr.length-1;
		int ans = -1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(ele == arr[mid])
			{
				ans = mid;
				low = mid+1;
			}
			else if(ele < arr[mid])
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		return ans;
	}
	
	
}
