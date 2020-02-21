package timer;
/**
 * this program demonstrates interfaces and callback
 * @version 1.00 2020-2-19
 * @author owenxu
 *
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
//区分util里面的Timer

public class TimeTest 
{
	public static void main(String[] args)
	{
		ActionListener listener = new TimePrinter();
		
		Timer t = new Timer(10000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "qiut program?");
		System.exit(0);
	}

}

class TimePrinter implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		Date now = new Date();
		System.out.println("At the tone, the time is " + now);
		Toolkit.getDefaultToolkit().beep();
	}
}
