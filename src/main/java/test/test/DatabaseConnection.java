/*
 * 7 Steps for database connectivity 
 1.)import package 						 --->java.sql
 2.)Load and register driver			 --->com.mysql.jdbc.Driver		
 3.)Create a connection 
 4.)Create a statement
 5.)Execute the query
 6.)Process the result
 7.)Close
 */
package test.test;
import java.sql.*;
import java.util.LinkedHashMap;

public class DatabaseConnection 
{
	static LinkedHashMap<String, String> map1 = new LinkedHashMap<String, String>();


public static void main(String args[]) throws ClassNotFoundException, SQLException, InterruptedException
{
	
	
	String url="jdbc:sqlserver://CINQENTSQL01;databaseName=PartyCentral_QA";
	String uname="akhilesh";
	String password="$ecure@1";
	String query="select * from masterdata.Country";
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	
	Connection con=DriverManager.getConnection(url,uname,password);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	Thread.sleep(5000);
	//String name=rs.getString("CountryName");
	System.out.println(rs);
	
	
	ResultSetMetaData rsmd = rs.getMetaData();
    Thread.sleep(10000);
    try {
    	while (rs.next()) {

   		for (int colnum = 1; colnum <= rsmd.getColumnCount(); colnum++) {
    			String colName = rsmd.getColumnName(colnum);
    			String value = rs.getString(colName);
    			map1.put(colName.toLowerCase(), value);
    		}



    	}
    	System.out.println(map1);
	
	
	
	
	st.close();
	con.close();
    }
    
    catch(Exception e)
	{
		
	}
	
	
	
	
}
}
