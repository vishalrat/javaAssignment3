package com.stackroute.JavaPracticeThree;

import org.junit.Test;


import junit.framework.*;

import static org.junit.Assert.*;

public class VowelsRemoveTest {
	
	
	@Test
	  public void testValid() {
	      //Arrange
		VowelsRemove vowelsRemove=new VowelsRemove();
	      //Act
		String[] stuGradesBefore = new String[]{ "India","United States" }; 
		String[] stuGradesAfter = new String[]{ "nd","Untd Stts" }; 

	      //Assert
		
	      assertEquals(stuGradesBefore,vowelsRemove.vowelsRemoveCountries(stuGradesBefore));
	   }
	
	@Test
	  public void testValid1() {
	      //Arrange
		VowelsRemove vowelsRemove=new VowelsRemove();
	      //Act
		String[] stuGradesBefore = new String[]{ "germany","egypt","czechoslovakia" }; 
		String[] stuGradesAfter = new String[]{ "grmny","gypt" ,"czchslvk" }; 

	      //Assert
		
	      assertEquals(stuGradesBefore,vowelsRemove.vowelsRemoveCountries(stuGradesBefore));
	   }

}
