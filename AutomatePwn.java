import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutomatePwn  {
	
	public void connect() throws InterruptedException, AWTException {
		Runtime r = Runtime.getRuntime();
		Process p;
		
		String comPort = "COM3";
		String baud = "115200";
		String bits = "8";
		String stopBits = "n";
		String parity = "1";
		String flowControl = "N";
		String s = "F:\\putty.exe -serial "+ comPort + " -sercfg "+ baud+","+bits+","+stopBits+","+
					parity+","+flowControl;         //putty commandline
		
		try
		{
			
			p = r.exec(s);                  //open the putty session
			Thread.sleep(3000);

		} catch (Exception e)
		{
			System.out.println(e);
			e.printStackTrace();

		}
		Thread.sleep(2000);
		
		Robot robot = new Robot();            // Robot class takes temporary control of the keyboard and mouse
		robot.keyPress(KeyEvent.VK_M);        //presses m
		Thread.sleep(150);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(150);

		
		robot.keyPress(KeyEvent.VK_3);
		Thread.sleep(150);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(150);

		
		robot.keyPress(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_1);
		Thread.sleep(150);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(150);

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(150);

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(150);

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(150);

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(150);

		robot.keyPress(16);               //presses shift key
		robot.keyPress(KeyEvent.VK_W);    //presses W
		robot.keyRelease(16);             //releases shift key
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(150);
		
		robot.keyPress(16);
		robot.keyPress(KeyEvent.VK_9);
		robot.keyRelease(16);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyPress(16);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(16);
		Thread.sleep(150);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_Y);
		Thread.sleep(150);

	}
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException
	{
	    AutomateGetShell auto = new AutomateGetShell();
	    //Calling the methods
	    auto.connect();
	}

}
