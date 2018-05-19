import java.util.Scanner;
import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class clientfortime{
	public static void main(String[] args) throws 
UnknownHostException, IOException
	{
		Socket s = new Socket("192.168.232.135",7778);

		Date datee = new Date();
		String dformat = "HH";
		DateFormat dateformat = new SimpleDateFormat(dformat);
		String fdate = dateformat.format(datee);
			
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(fdate);
		
		Scanner s1 = new Scanner(s.getInputStream());
		String server_reply = s1.nextLine();

		System.out.println(server_reply);			

	}
}
