import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

public class audio {

	
	public static void iniciar() throws MalformedURLException, InterruptedException {
						
		URL url = new URL("http://www.mp3item.com/soundeffects/racing01.wav");
		AudioClip clip = Applet.newAudioClip(url);
		
		for (int i = 0; i < 10; i++) {
			
		clip.play();
		Thread.sleep(6000);
		}
	}

}
