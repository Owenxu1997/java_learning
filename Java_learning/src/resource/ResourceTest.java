package resource;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class ResourceTest 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Eunnable()
				{
					public void run()
					{
						JFrame frame = new ResourceTestFrame();
						frame.setTitle("ResourceTest");
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				});
	}

}

/**
 * a frame that loads image and text resources
 */
class ResourceTestFrame extends JFrame
{
	private static final int DEAFAULT_WIDTH = 300;
	private static final int DEAFAULT_HEIGHT = 300;
	
	public ResourceTestFrame()
	{
		setSize(DEAFAULT_WIDTH, DEAFAULT_HEIGHT);
		URL aboutURL = getClass().getResource(about.gif)
	}
}
