package com.stackroute.JavaPracticeThree;

public class ConsecutiveNumbers {
    String checkConsecutivity(String num) {
        String[] numbers=num.split(" ");
        int[] nums=new int[numbers.length];
        int[] revnums=new int[numbers.length];
        try {
        for(int i=0;i<numbers.length;i++)
        {
            nums[i]=Integer.parseInt(numbers[i]);
        }
        int flag1=0;int flag2=0;
        int i=0;
        for(i=0;i<revnums.length-1;i++)
        {
            revnums[i]=revnums[i]-revnums[i+1];
        }
        revnums[i]=1;
        for(i=nums.length-1;i>0;i--)
        {
            nums[i]=nums[i]-nums[i-1];
        }
        nums[i]=1;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=1) {flag1=1;break;}
        }
        for(i=0;i<revnums.length;i++)
        {
            if(revnums[i]!=1) {flag2=1;break;}
        }
        
        if(flag1!=1 || flag2!=1) {return "consecutive";}
        else {return "non consecutive";}}
        catch(Exception e) {return "invalid";}
    }
}
