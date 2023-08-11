package com.billdesk.jdbc;
import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pass = "system";
		try {
			//establish connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,username,pass);
			
			st= con.createStatement();
			rs = st.executeQuery("select * from customer");
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
				System.out.println();
			}
			con.close();
			st.close();
			rs.close();
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} 
		System.out.println("Connection established");

	}

}
