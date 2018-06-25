package com.stackroute.JavaPracticeThree;

public class Chess {
 public String[][] chessMaker()
 {
	 String[][] result=new String[8][8];
	 for(int i=0;i<8;i++)
	 {
		 
		 for(int j=0;j<8;j++)
		 {
			 
			 result[i][j]=((i+j)^1)==0?"WW|":"BB|";
			
		 }
		 
	 }
	  

	 return result;
	
	 
 }
}
