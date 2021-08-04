package Lec13;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="CODE";
		
		for(int i=0;i<st.length();i++)
		{
			
			for(int j=i+1;j<=st.length();j++)
			{
				System.out.println(st.substring(i,j));
				
			}
			
		}

	}

}
