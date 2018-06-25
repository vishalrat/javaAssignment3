package com.stackroute.JavaPracticeThree;

public class VowelsRemove {
	public String[] vowelsRemoveCountries(String[] countryName)
	{
		String countryWord;
		String[] splitVowels;
		for(int i=0;i<countryName.length;i++)
		{
			countryWord=countryName[i];
			for(int j=0;j<countryWord.length();j++)
			{
				splitVowels=countryWord.split("a|e|i|o|u");
				countryWord=splitVowels.toString();
			}
			countryName[i]=countryWord;
		}
		return countryName;
	}

}
