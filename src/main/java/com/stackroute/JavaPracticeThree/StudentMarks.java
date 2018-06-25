package com.stackroute.JavaPracticeThree;

public class StudentMarks {
	
	public String studentGradesCheck(int[] stuGrades)
	{
	for(int i=0;i<stuGrades.length;i++)
	{
		try {
			if(stuGrades[i]<0||stuGrades[i]>100)
			{
				 throw new ArithmeticException("not valid");  
			}
		}
		catch(Exception e) { return "not valid";}
	}
	return "Valid grades";
	
	}

}
