
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

public class sonido {
    static AudioClip son;
    
    static void iniciar() throws MalformedURLException, InterruptedException{
        URL url = new URL ("http://files.anitalink.com/gamecache/hl/valve/sound/ambience/mgun_burst1.wav");
    	son= Applet.newAudioClip(url);
    }//iniciar
    
    static void play() throws InterruptedException{
        for (int i = 0; i < 10; i++) {
            son.play();
            Thread.sleep(4000);
        }//for
    }
    
}
