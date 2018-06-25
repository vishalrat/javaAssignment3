package com.stackroute.JavaPracticeThree;


import org.junit.Test;


import junit.framework.*;

import static org.junit.Assert.*;

public class StudentMarksTest {
	
	
	@Test
	  public void testValid() {
	      //Arrange
		StudentMarks studentMarks=new StudentMarks();
	      //Act
		int[] stuGrades = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	      //Assert
		
	      assertEquals("Valid grades",studentMarks.studentGradesCheck(stuGrades));
	   }
	
	@Test
	  public void testInvalid() {
	      //Arrange
		StudentMarks studentMarks=new StudentMarks();
	      //Act
		int[] stuGrades = new int[]{ 1,2,3,4,5,601,7,8,9,10 }; 
	      //Assert
		
	      assertEquals("not valid",studentMarks.studentGradesCheck(stuGrades));
	   }
	
	@Test
	  public void testInvalidNegative() {
	      //Arrange
		StudentMarks studentMarks=new StudentMarks();
	      //Act
		int[] stuGrades = new int[]{ 1,-22,3,4,5,601,7,8,9,10 }; 
	      //Assert
		
	      assertEquals("not valid",studentMarks.studentGradesCheck(stuGrades));
	   }

}
