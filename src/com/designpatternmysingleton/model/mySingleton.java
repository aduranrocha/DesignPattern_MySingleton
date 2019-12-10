package com.designpatternmysingleton.model;

public class mySingleton {

	// 2. Create my class instance
	private static mySingleton mySingletonInstance = null;
	
	// 4. Create connection
	private static String urlServer;
	private static String userName;
	private static String password;
	// 1. Create private Constructor
	private mySingleton() {}
	// 3. Method get Instance
	public static mySingleton getInstance(String url, String user, String pass) {
		if(mySingletonInstance == null) {
			urlServer = url;
			userName = user;
			password = pass;
			mySingletonInstance = new mySingleton();
		}
		else {
			System.out.println("The object already exist");
			System.out.println("Server url: " + urlServer);
			System.out.println("User Name " + userName);
			System.out.println("User Password " + password);
		}
		return mySingletonInstance;
	}
}
