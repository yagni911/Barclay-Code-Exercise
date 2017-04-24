import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ServerStatus extends TimerTask
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			System.out.println("Press Ctrl+C anytime to terminate the program.");
			System.out.print("Enter the time interval in minutes to check server status: ");
			int interval = scanner.nextInt();
			
			Timer timer = new Timer();
			timer.schedule(new ServerStatus(), 0, interval * 60 * 1000);
			scanner.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only integer value");
		}		
	}
	
	public void run() 
	{
		String line;
		
		try 
		{
			File file = new File("SERVER_STATUS.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
						
			while((line = br.readLine()) != null)
			{
				String[] columns = line.split(" ");
				String appName = columns[0];
				String serversOffline = columns[1];
				
				String[] noOfServers = serversOffline.split("/"); 
				int serversDown = Integer.parseInt(noOfServers[0]);
				int totalServers = Integer.parseInt(noOfServers[1]);
				
				int serversUp = totalServers - serversDown;
				
				if(serversUp == 0 || serversUp == 1)
				{
					System.out.println("RED Alert for " +appName);
				}
				else if(serversUp == totalServers)
				{
					System.out.println("GREEN Alert for " +appName);
				}
				else
				{
					System.out.println("AMBER Alert for " +appName);
				}
			}
			
			br.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("SERVER_STATUS.txt file not found");
			System.exit(0);
		}
		catch (IOException e) 
		{
			System.out.println("IO Exception occurred");
			System.exit(0);
		}
		
	}
}
