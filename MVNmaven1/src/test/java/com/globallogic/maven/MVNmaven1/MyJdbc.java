package com.globallogic.maven.MVNmaven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJdbc {
	public static void main(String args[]) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/employee";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			
		/* insertQuery="insert into employees(emp_id,emp_name,job_name,manager_id) values (69903,'POOJA','PRESIDENT',50000)";
			st.execute(insertQuery);  */

			//update query starts
			
			//delete query starts
		/*	String deleteQuery="delete from employees where emp_id=69903";
			st.executeUpdate(deleteQuery); */
			
			//delete query ends
			
			
	/*	 String updateQuery="update employees set job_name='Trainee' where emp_id=65446";
			st.executeUpdate(updateQuery);  */
			
			//update query ends
			
			
			// Select using executeQuery
						String query = "select * from employees";
						
						ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				//rs.getint() 
				    //pass the index 
				    //pass the columnname
				System.out.println("emp_id : "+" "+rs.getInt("emp_id") +" emp_name : "+rs.getString(2) +" job_name :  "+rs.getString(3) +" manager_id: "+rs.getInt(4));
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}


