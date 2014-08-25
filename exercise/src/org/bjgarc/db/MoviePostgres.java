package org.bjgarc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MoviePostgres {
	
	static Connection conn;
	
	public static void main(String[] args) {
		String url = "jdbc:postgresql://192.168.56.101/dvdrental";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "");
		
		try {
			conn = DriverManager.getConnection(url, props);
			query();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void query() {
		Statement st;
		ResultSet rs;
		Statement st2;
		ResultSet rs2;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM actor");
			
			st2 = conn.createStatement();
			
			String actor_name = null;
			String actor_id = null;
			String film_id = null;
			String film_title = null;
			
			while (rs.next()) {		
				actor_name = rs.getString("first_name") + " " + rs.getString("last_name");
				actor_id = rs.getString("actor_id");
								
				rs2 = st2.executeQuery("SELECT film_id FROM film_actor WHERE actor_id=" + actor_id);
				rs2.next();
				film_id = rs2.getString("film_id");
				
				rs2 = st2.executeQuery("SELECT title FROM film WHERE film_id=" + film_id);
				rs2.next();
				film_title = rs2.getString("title");
				
				System.out.println("Film: " + film_title);
				System.out.println("Actor: " + actor_name);
				System.out.println("__________________________________");
				
				rs2.close();
			}
			rs.close();
			st.close();
			st2.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
