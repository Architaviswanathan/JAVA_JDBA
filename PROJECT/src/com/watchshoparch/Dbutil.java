package com.watchshoparch;
import java.sql.Connection;

import java.sql.DriverManager;

import java.util.*;

public class Dbutil {

	public Connection getDBConnection()

	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/watchshop","arch","");
            }
    catch(Exception ex)

		{

			System.out.println(ex);

		}

		return con;

	}



}