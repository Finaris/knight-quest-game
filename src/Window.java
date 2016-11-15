import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import sun.audio.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Window extends JFrame
{
	
	AudioInputStream inputStream;
	Clip clip;
	
	public void music()
	{
		try{
			inputStream = AudioSystem.getAudioInputStream(new File("bgm.wav"));
			clip = AudioSystem.getClip();
	        clip.open(inputStream);
	        clip.loop(clip.LOOP_CONTINUOUSLY);
	        Thread.sleep(1000); // looping as long as this thread is alive
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void stopMusic()
	{
		clip.close();
	}
	
	public void creditsMusic()
	{
		try{
			inputStream = AudioSystem.getAudioInputStream(new File("creditMusic.wav"));
			clip = AudioSystem.getClip();
	        clip.open(inputStream);
	        clip.loop(0);
	        Thread.sleep(1000); // looping as long as this thread is alive
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void battleMusic()
	{
		try{
			inputStream = AudioSystem.getAudioInputStream(new File("battleMusic.wav"));
			clip = AudioSystem.getClip();
	        clip.open(inputStream);
	        clip.loop(clip.LOOP_CONTINUOUSLY);
	        Thread.sleep(1000); // looping as long as this thread is alive
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void finalMusic()
	{
		try{
			inputStream = AudioSystem.getAudioInputStream(new File("finalMusic.wav"));
			clip = AudioSystem.getClip();
	        clip.open(inputStream);
	        clip.loop(clip.LOOP_CONTINUOUSLY);
	        Thread.sleep(1000); // looping as long as this thread is alive
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Window(final JPanel panel)
	{
	    super("Knight Quest");
	    //loading screen
	    final JWindow window = new JWindow();
	    window.getContentPane().add(new JLabel("Loading..."));
	    window.getContentPane().add(
	            new JLabel("", new ImageIcon(getClass().getResource("loading.gif")), SwingConstants.CENTER));
	    window.setBounds(600, 300, 400, 300);
	    window.setVisible(true);
	    javax.swing.Timer timer = new javax.swing.Timer(3500,
	        new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                window.setVisible(false);
	                setLayout(new BorderLayout());
	                add(panel, BorderLayout.CENTER);
	                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                setSize(650,550);
	                setLocation(525, 225);
	                music();
	                setVisible(true);
	            }
	        }
	    );
	    timer.setRepeats(false);
	    timer.start();
	}
	
	public void setPanel(final JPanel panel) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				getContentPane().removeAll();
				add(panel, BorderLayout.CENTER);
				if(Panels.sizeCheck == 2)
				{
					setSize(600, 550);
					setLocation(525, 225);
				}
				else if(Panels.sizeCheck == 3)
				{
					setSize(650, 550);
					setLocation(525, 225);
				}
				else
				{
					setSize(1000, 600);
					setLocation(300, 100);
				}
				revalidate();
				repaint();
			}
		});
	}
	
	
}
