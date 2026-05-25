package com.wipro.Day_eight;

public class Dbconnection {
	static Dbconnection obj;
	
	public static Dbconnection getConnection() {
		
		if(obj==null){
			obj=new Dbconnection();
		}
		return obj;
	}
}
