package com.feuji24nov;

public class StringCharacters 
{
	public void stringCharacter(String value)
	{
		char[] result=value.toCharArray();
		for(int index=0;index<=result.length-1;index++)
		{
			System.out.println(result[index]);
			
		}
		
	}
	public static void main(String[] args) 
	{
		StringCharacters output=new StringCharacters();
		output.stringCharacter("Jyothi");
		
	}

}
