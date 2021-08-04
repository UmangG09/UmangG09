package Lec11_Array;

import java.util.Scanner;

public class CowArrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int stalls=sc.nextInt();
		int noc=sc.nextInt();
		int [] arr=new int[stalls];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int low=1;
		int high=arr[arr.length-1];
		
		int ans=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(canPlace(arr,mid,noc))
			{
				ans=mid;
				low=mid+1;
				
			}
			else
			{
				high=mid-1;
			}
			
		}
		
		System.out.println(ans);
		
		

	}
	
	public static boolean canPlace(int [] arr,int dist,int noc) {
		int cows=1;
		int place=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]-place>=dist)
			{
				cows++;
				place=arr[i];
			}
			if(cows==noc)
			{
				return true;
			}
		}
		
		return false;
	}

}
