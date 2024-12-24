package com.Practice;

public class UserdefinedException extends Exception {
	
	
	public UserdefinedException(String s) {
		super(s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance =0;
		
		try
		{
			UserdefinedException m = new UserdefinedException("Insuffiecnt funds");
			if (balance<=0)
			{
				throw m;
			}
			
		}catch(UserdefinedException ex)
		{
			ex.printStackTrace();
			//System.out.println(ex.getMessage());
			
		}

	}

}
