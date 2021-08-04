package Lec10;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] arr= {2,5,7,8,9,4};
		int [] arr= {2,8,1,3,9,4};
		//insert(arr,arr.length-1);
		insertionArray(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public static void insertionArray(int [] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			insert(arr,i);
		}
	}
	public static void insert(int [] arr,int n)
	{
		int postition=0;
		int temp=arr[n];
		
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]<temp)
			{
				postition=i+1;
				break;
			}
			else
			{
				arr[i+1]=arr[i];
			}
			
		}
		arr[postition]=temp;
	}
}
