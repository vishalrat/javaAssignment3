package com.stackroute.JavaPracticeThree;

import org.junit.Test;


import junit.framework.*;

import static org.junit.Assert.*;

public class ChessTest {
	
	@Test
	  public void testValid() {
	      //Arrange
		Chess chess=new Chess();
	      //Act
		String[][] chessString = {{"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,},
				{"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,},

		{"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,},

		{"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,},

		{"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,},

		{"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,},

		{"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,},

		{"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,"WW|" ,"BB|" ,}};


	      //Assert
		
	      assertEquals(chessString,chess.chessMaker());
	   }

}
