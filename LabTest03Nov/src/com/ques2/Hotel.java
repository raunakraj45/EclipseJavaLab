/*
 * Program: WAP to create a hotel having rooms .It should have following 
-> datatype: room no, room type, acfacility, room area., room price
-> default constructor
-> parameterized constructor where room area is fixed 150sqm
-> parameterised constructor with all field
-> pay the price method will be overloaded
  one method will be without discount
  with discount"
 * @Name: Raunak Raj
 * @Date: 03/11/2022
 * */

package com.ques2;

//Declaring class
public class Hotel {
	
	//Declaring Variables
	private int roomNo;
	private String roomType;
	private boolean acFacility;
	private float roomArea;
	private float roomPrice;
	
	
	// Default Constructor
	public Hotel() {
		super();
		this.roomNo=0;
		this.roomType="Standard";
		this.acFacility=true;
		this.roomArea=180.0f;
		this.roomPrice=900;
		
	}
	
	


	//Parametrized Constructor
	public Hotel(float roomArea) {
		super();
		this.roomArea = 150;
	}





	//Parametrized Constructor
	public Hotel(int roomNo, String roomType, boolean acFacility, float roomArea, float roomPrice) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.acFacility = acFacility;
		this.roomArea = roomArea;
		this.roomPrice = roomPrice;
	}




	public int getRoomNo() {
		return roomNo;
	}




	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}




	public String getRoomType() {
		return roomType;
	}




	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}




	public boolean isAcFacility() {
		return acFacility;
	}




	public void setAcFacility(boolean acFacility) {
		this.acFacility = acFacility;
	}




	public float getRoomArea() {
		return roomArea;
	}




	public void setRoomArea(float roomArea) {
		this.roomArea = roomArea;
	}




	public float getRoomPrice() {
		return roomPrice;
	}




	public void setRoomPrice(float roomPrice) {
		this.roomPrice = roomPrice;
	}




	@Override
	public String toString() {
		return "Hotel [roomNo=" + roomNo + ", roomType=" + roomType + ", acFacility=" + acFacility + ", roomArea="
				+ roomArea + ", roomPrice=" + roomPrice + "]";
	}
	
	
	
	
	
	

}
