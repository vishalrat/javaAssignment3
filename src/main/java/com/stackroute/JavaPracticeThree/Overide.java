package com.stackroute.JavaPracticeThree;

class Parent
{
	public void show (int p)
    {
     System.out.print(p);
    }
	
	
	public void print (int p)
    {
     System.out.print(p);
    }
}
 
// Inherited class
class Child extends Parent
{
	@Override
	public void show (int p)
    {
     System.out.print(p);
    }
	
	@Override
	public void print (int p)
    {
     System.out.print(p*p);
    }
}
 
// Driver class
class Overide
{
    public static void main(String[] args)
    {
    	int p=1;
    	int q=2;
        Parent obj1 = new Parent();
        obj1.show(p);
        obj1.print(q);
 
       
       Parent obj2 = new Child();
        obj2.show(p);
        obj2.print(q);
    }
}
