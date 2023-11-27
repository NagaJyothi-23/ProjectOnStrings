package com.feuji24nov;

public class ReverseAString 
{
	// reverse character in a given String
	public void reverse(String name)
	{
		for(int index=name.length()-1;index>=0;index--)
		{
			char ch=name.charAt(index);
			System.out.print(ch);
		}
		System.out.println();
	}
	
	//reverse words in a string
	public void reverseWord(String name)
	{
		//String reverse="";
		String result[]=name.split(" ");
		for(int index=result.length-1;index>=0;index--)
		{
			//reverse=reverse+
			System.out.print(result[index]+" ");
		}
		System.out.println();
		
	}
	
	//wap to split a string and display tokenized strings
	
	public void tokenizedString(String name)
	{
		String result[]=name.split(" ");
		for(int index=0;index<=result.length-1;index++)
		{
			System.out.println(result[index]+" ");
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		ReverseAString result=new ReverseAString();
		result.reverse("NagaJyothi");
		result.reverseWord("CoreNuts technologies pvt ltd");
		result.tokenizedString("My name is Naga Jyothi");
	}

}
