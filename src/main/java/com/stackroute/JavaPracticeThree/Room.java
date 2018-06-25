package com.stackroute.JavaPracticeThree;
class RoomClass {
	
	private int roomNo;
	private String roomType;
	private int roomArea;
	private boolean acMachine;
	public void setData(){
		roomNo=101;
		roomType="deluxe";
		roomArea=10;
		acMachine=true;
		
	}
	
	public void displayData() {
		System.out.println("room no is "+roomNo+" of type "+roomType+" with "+roomArea+"and"+acMachine);
		
	}
	
	
}

public class Room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomClass roomClass=new RoomClass();
		roomClass.setData();
		roomClass.displayData();
		
		
		

	}
	
	

}
