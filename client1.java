import java.util.Scanner;
import java.net.*;
import java.io.*;

public class client{
	public static void main(String[] args) throws 
UnknownHostException, IOException
	{
		String chara,temp;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("192.168.232.135",36808);
		Scanner s1 = new Scanner(s.getInputStream());
		System.out.println("Enter");
		chara = sc.next();
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(chara);
		temp = s1.nextLine();
		System.out.println(temp);
		
	}



}
