package Lec6;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {8,5,2,3,4,8};
		int max=findMax(arr);
		System.out.println(max);

	}
	public static int findMax(int [] arr)
	{
		int max=arr[0];
		int min=Integer.MIN_VALUE;
		System.out.println(min);
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}

}
