package Jdbc_practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample
{
 public static void main(String[] args) throws ClassNotFoundException,SQLException 
 {
	 
	 		// ************ load and register the drivers ************
Class.forName("com.mysql.cj.jdbc.Driver");


			//*************** Establish the connection  *************
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcfirst","root","root");

	
			// ******** create the statement or create a database**********
//CallableStatement p=c.prepareCall("create database jdbcfirst");


			// ************* create a table ************
//CallableStatement p=c.prepareCall("create table shankar(sid int primary key,sname varchar(20) not null)");
//System.out.println("Table created scuessfully");


			//  **************  insert the values ***************
//CallableStatement p =c.prepareCall("insert into shankar values(105,'Bharath')");
//System.out.println("1 row inserted scuessfully");

			// ********* update the values *************
//CallableStatement p =c.prepareCall("update shankar set sname='yash' where sid=105");
//System.out.println("1 row updated scuessfully");

			// ********** delete the data *************
//CallableStatement p =c.prepareCall("delete  from shankar where sid=105");
//System.out.println("data deleted  scuessfully");

			// ************** fetch the records **********
CallableStatement p =c.prepareCall("select * from shankar");
//CallableStatement p =c.prepareCall("select * from shankar where sid=103;");


			// ************ execcute methods *************[DDL,DML,DQL]
//boolean e =p.execute();		-------------DDL
//int e=p.executeUpdate();		-------------DML
ResultSet e=p.executeQuery();

while(e.next()) {
	
	System.out.println(e.getInt(1));
	System.out.println(e.getString(2));
	System.out.println("****************");
}






			// *********** close the connection *********
c.close();
//System.out.println("Database created scuessfully");
}


}
