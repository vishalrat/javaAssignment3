package com.stackroute.JavaPracticeThree;

public class VowelsRemove {
	public String[] vowelsRemoveCountries(String[] countryName)
	{
		
		
		String[] result=new String[countryName.length];
		for(int i=0;i<countryName.length;i++)
		{
			String countryWord=countryName[i];
			result[i] = countryWord.replaceAll("[aeiou[AEIOU]]", "");
		}
		
		return result;
	}
 
}
 