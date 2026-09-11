package RSA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.File;
import java.io.IOException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonToJava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, StreamWriteException, DatabindException, IOException {
		// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "test", "test");
			
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia';");
			
			
			ArrayList<CustomerDetails> a=new ArrayList<CustomerDetails>();
			
			while(rs.next() ) {
				CustomerDetails c=new CustomerDetails();
				c.setCourseName(rs.getString(1));
				c.setPurchasedDate(rs.getString(2));
				c.setAmount(rs.getInt(3));
				c.setLocation(rs.getString(4));	
				
				
				System.out.println(c.getCourseName());
				System.out.println(c.getPurchasedDate());
				System.out.println(c.getAmount());
				System.out.println(c.getLocation());
				
				a.add(c);
			}
			
			
			for(int i=0;i<a.size();i++) {
				ObjectMapper o=new ObjectMapper();
				o.writeValue(new File("/home/sheela/QATARolePractice/DbRowsToJSonFiles/customerInfo"+i+".json"),a.get(i));
			}
			
			conn.close();		
			
	}

}
