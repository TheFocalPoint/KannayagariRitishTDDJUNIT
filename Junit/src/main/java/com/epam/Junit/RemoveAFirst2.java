package com.epam.Junit;

public class RemoveAFirst2 {

	public Object remove(String string) {
		if(string.length()<=1)
		{
			if(string.contains("A") || string.length()==0)
				return "";
			return string;
		}
		
		StringBuffer sb = new StringBuffer(string);
		if(sb.substring(0, 2).indexOf("A")!=-1)
		{
		    if(sb.substring(0, 2).equals("AA"))
		    	sb.delete(0, 2);
		    else if(sb.charAt(0)=='A')
		    	sb.deleteCharAt(0);
		    else if(sb.charAt(1)=='A')
		    	sb.deleteCharAt(1);
		}
		
		return sb.toString();
	}

}
