/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Zafrul Hasan Nasim
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static Connection con=null;
public static Connection getConnection(){
	try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/image_upload","root","");
	}catch(Exception e) {
		System.out.println(e);
	}
	return con;
}
}