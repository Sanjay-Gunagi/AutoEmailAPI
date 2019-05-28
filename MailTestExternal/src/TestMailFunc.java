import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestMailFunc {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		char ch = '"';
		String newline = "\n";
		Properties properties = new Properties();
		InputStream input = null;
		input = new FileInputStream("C:\\Sanjay\\config.properties");
		properties.load(input);
		
		String email1 = properties.getProperty("email1");
		String email2 = properties.getProperty("email2");
		
		System.out.println(email1+" "+email2);
		//String password = properties.getProperty("password");
		
		
			String subject = "AutomatedMail:F&R-System";
//			String body1 = ch+"\n Hi, "+newline+newline;
//			String body2 = ch+"\n This is automated mail from Flights and Routing (F&R) System."+newline+newline;
//			String body3 = ch+"\n Thanks,\nSanjay\n"+ch;
			
		  	Process p = Runtime.getRuntime().exec("wscript C:\\Sanjay\\AutoEmail.vbs "+email1+" "+email2);
		  	p.waitFor();
	      
		  	System.out.println("Email has been Sent Successfully.");
	}

}
