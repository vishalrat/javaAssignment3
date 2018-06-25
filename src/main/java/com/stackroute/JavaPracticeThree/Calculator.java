package com.stackroute.JavaPracticeThree;

interface AdvancedArithmetic{
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			if((n%i)==0)
			{
				sum=sum+i;
				System.out.println(sum);
				
			}
		}
		return sum;
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalculator myCalculator=new MyCalculator();
		int divisorSum=myCalculator.divisor_sum(16);
		
		System.out.println(divisorSum);
	}

}
