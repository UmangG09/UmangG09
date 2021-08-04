package Lec10;

import java.util.Arrays;

public class ArraysProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,2,3,4,5};
		
		int [] leftProduct=new int[5];
		int [] rightProduct=new int[5];
		int [] ans=new int[5];
		
		int prod=1;
		for(int i=0;i<ans.length;i++)
		{
			leftProduct[i]=prod;
			prod=prod*arr[i];
		}
      System.out.println(Arrays.toString(leftProduct));
      
          prod=1;
		for(int i=arr.length-1;i>=0;i--)
		{
			ans[i]=ans[i]*prod;
			prod=prod*arr[i];
		}
		
		System.out.println(Arrays.toString(ans));
      
	}

}
