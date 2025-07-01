package com.customexception;

public class NameException  extends Exception{
	
	public NameException(String name)
	{
		super(name);
	}
	public boolean checkname(String name) throws NameException{
		 String regex = "^(?=.*[A-Z])(?=.*[@#$%^&*!]).{3,}$";
		if(name.matches(regex))
		{
			return true;
		}
		else
		{
		throw new NameException("hey u gave wrong formate name");
		}
		
		
	}

}
