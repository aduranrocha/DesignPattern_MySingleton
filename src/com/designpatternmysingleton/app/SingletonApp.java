package com.designpatternmysingleton.app;

import com.designpatternmysingleton.model.mySingleton;

public class SingletonApp {

	public static void main(String[] args) {
		String urlServer = "jdbc:mysql://localhost:3306/store";
		String userName = "root1";
		String password = "root1";
		
		String urlServer2 = "jdbc:mysql://localhost:3306/store";
		String userName2 = "root2";
		String password2 = "root2";
		
		String urlServer3 = "jdbc:mysql://localhost:3306/store";
		String userName3 = "root3";
		String password3 = "root3";
		// Create
		mySingleton objMySingleton = mySingleton.getInstance(urlServer,userName,password);
		mySingleton objMySingleton2 = mySingleton.getInstance(urlServer2,userName2,password2);
		mySingleton objMySingleton3 = mySingleton.getInstance(urlServer3,userName3,password3);
		
		
	}

}
