package com.stackroute.JavaPracticeThree;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
 class AnotherClass extends Book{
	void setTitle(String s) {
		s=" here Title is set in anotherclass";
		System.out.println(s);
		
	}
}

public class Abstract { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnotherClass anotherClass=new AnotherClass();
		String s="initial title";
		System.out.println(s);
		anotherClass.setTitle(s);
	}

}
