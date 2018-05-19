import java.net.ServerSocket;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.*;
import java.net.Socket;
import java.net.InetAddress;
import java.util.Date;
import java.net.UnknownHostException;

public class serverfortime{
	public static void main(String[] args) throws IOException
	{
		ServerSocket s1 = new ServerSocket(7778);
		System.out.println("Socket created");
		Socket ss = s1.accept();
				
		Scanner sc = new Scanner(ss.getInputStream());

		int datee = Integer.parseInt(sc.nextLine());
		System.out.println(datee);
				
		PrintStream p = new PrintStream(ss.getOutputStream());
		
		if(datee <= 11)
		p.println("Good Morning");

		if(datee == 12)
		p.println("Good Afternoon");

		if(datee >= 13 && datee <= 19)
		p.println("Good Evening");
		
		if(datee >= 20)
		p.println("Good Night");
	
	}
}
