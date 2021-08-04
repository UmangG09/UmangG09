package Lec10;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		int n=3;
		int index=binarySearch(arr,n);
		System.out.println(index);

	}
	
	public static int binarySearch(int [] arr,int ele)
	{
		int low=0;
		int high=arr.length-1;
		
		
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(ele==arr[mid])
			{
				return mid;
			}
			else if(ele>arr[mid])
			{
				low=mid+1;
			}
			else if(ele<arr[mid])
			{
				high=mid-1;
			}
		}
		return -1;
		
	}

}
