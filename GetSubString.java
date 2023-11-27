package com.feuji24nov;

public class GetSubString 
{
	public void getSubString(String companyName)
	{
		String subString=companyName.substring(0, companyName.indexOf(" "));
		System.out.println(subString);
	}
	public static void main(String[] args) 
	{
		GetSubString result=new GetSubString();
		result.getSubString("CoreNutsTechnologies Pvtltd");
		
	}

}
