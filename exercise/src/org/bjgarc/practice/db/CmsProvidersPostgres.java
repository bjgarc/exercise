package org.bjgarc.practice.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Properties;

public class CmsProvidersPostgres {
	
	static Connection conn;
	
	public static void main(String[] args) {
		//MacBook @ home Postgres instance
		//String url = "jdbc:postgresql://192.168.1.162:5433/cms";
		
		String url = "jdbc:postgresql://127.0.0.1:5433/cms";

		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "tech01");
		
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
		
		try {
			System.out.println("Working....");
			long start = System.currentTimeMillis();
			st = conn.createStatement();
			rs = st.executeQuery("SELECT npi, nppes_provider_last_org_name FROM providers;");
			
			HashMap<String, String> map = new HashMap<String, String>();
			String npi = null;
			String last_name = null;
			
			// PROBLEM:  Find the same NPI used for more than 1 unique last name.			
			int i = 0;
			while (rs.next()) {
				npi = rs.getString("npi");
				last_name = rs.getString("nppes_provider_last_org_name");
				
				if(map.containsKey(npi)) {
					if (!map.get(npi).equalsIgnoreCase(last_name)) {
						System.out.println("MISMATCH FOUND FOR: " + npi + " : " + last_name);
						// Though though key is duplicate, the last_name is not - add to list
						map.put(npi, last_name);
					}
				} else {
					map.put(npi, last_name);
				}
				i++;
			}
			long end = ((System.currentTimeMillis() - start));
			System.out.println("Complete in " + end + " over " + i + " records");
			System.out.println("Map size: " + map.size());
			
			/*		
			String last_name = null;
			String first_name = null;
			String state = null;
			String type = null;
			
			while (rs.next()) {
				last_name = rs.getString("nppes_provider_last_org_name");
				first_name = rs.getString("nppes_provider_first_name");
				state = rs.getString("nppes_provider_state");
				type = rs.getString("provider_type");
				
				System.out.println("Provider name: " + last_name + ", " + first_name);
				System.out.println("State: " + state);
				System.out.println("Type: " + type);
				System.out.println("------------------------------------------------------");				
			}
			*/
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
