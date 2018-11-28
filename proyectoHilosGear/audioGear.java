package pqtGear;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

public class audioGear {
	
	static AudioClip clip;
	static AudioClip clip1;
	
	public static void iniciar() throws MalformedURLException {
		
		URL url = new URL("http://files.anitalink.com/gamecache/hl/valve/sound/ambience/mgun_burst1.wav");
		URL url1 = new URL("http://files.anitalink.com/gamecache/hl/valve/sound/ambience/biggun2.wav");

		clip = Applet.newAudioClip(url);
		clip1 = Applet.newAudioClip(url1);
	}
		
		static void play() throws InterruptedException{
		
		for (int i = 0; i < 12; i++) {
		clip.play();
		Thread.sleep(3000); 
		clip1.play();
		Thread.sleep(2000); 
		}
	}
}
