import java.net.ServerSocket;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintStream;
import java.net.Socket;

public class server{
	public static void main(String[] args) throws IOException
	{
		String chara,temp;
		String lai = "assalamualaikum";
		ServerSocket s1 = new ServerSocket(36808);
		Socket ss = s1.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		chara = sc.next();
		if(chara.equalsIgnoreCase(lai)) 
		temp = "Waalaikumslam";
		else
		temp = "Are you a muslim?";

		PrintStream p = new PrintStream(ss.getOutputStream());
		p.println(temp);
		
	}







}
