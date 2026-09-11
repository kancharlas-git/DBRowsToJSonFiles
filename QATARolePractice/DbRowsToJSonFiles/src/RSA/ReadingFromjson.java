package RSA;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ReadingFromjson {

	public static void main(String[] args) throws IOException {
		ObjectMapper Om=new ObjectMapper();
		
		CustomerDetails cd=Om.readValue(new File("/home/sheela/QATARolePractice/DbRowsToJSonFiles/customerInfo0.json"), CustomerDetails.class);
		System.out.println(cd.getCourseName());
		System.out.println(cd.getPurchasedDate());
		System.out.println(cd.getAmount());
		System.out.println(cd.getLocation());

	}

}
