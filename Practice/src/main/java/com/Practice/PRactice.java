package com.Practice;

public  class PRactice {
	public boolean isContainsNumbers(String s)
	{
		for(int i=0;i<=s.length();i++)
		{
			char ch = s.charAt(i);
			System.out.println();
			 if (!((ch>='A')&& (ch<='Z')) && !((ch>='a')&& ch<='z'))
					 {
				 return false;
					 }
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		PRactice p = new PRactice();
		
		String s = "1234";
		String s2= "1243GH";
		String s3 ="1Test";
		char[] c = s3.toCharArray();
		 System.out.println(c);
		for (char ch:c)
		{    
		boolean value	= Character.isDigit(ch);
			
		if(value)
		{
			System.out.println("it contains number "+ch);
			break;
			
		}
		}
	
	}

}
