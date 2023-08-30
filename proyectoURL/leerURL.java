import java.io.*;
import java.net.*;

class leerURL {

  public static void main(String[] args)
    throws IOException, MalformedURLException {
    String inputLine;

    URL obj = new URL("https://www.giraldojorge.com/jorge/index.html");
    URLConnection urlc = obj.openConnection();

    BufferedReader in = new BufferedReader(
      new InputStreamReader(urlc.getInputStream())
    );

    while ((inputLine = in.readLine()) != null) {
      System.out.println(inputLine);
    }
    in.close();
  }
}
