
import java.io.*;
import sun.audio.*;



public class sonido {
    
    static AudioStream audio;
    static InputStream in;
    static File sonido;
    
    static void iniciar() throws FileNotFoundException, IOException{
        File sonido = new File("alarma.wav");//wav
        in = new FileInputStream(sonido);
        audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
    }//sonar
    
}
