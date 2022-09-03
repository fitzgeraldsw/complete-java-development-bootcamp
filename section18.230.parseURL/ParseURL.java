import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.util.Scanner;

public class ParseURL {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://www.google.com");
            System.out.println("protocol: " + url.getProtocol());
            System.out.println("host:     " + url.getHost());
            System.out.println("path:     " + url.getPath() + "\n");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

      //Instantiating the URL class
      URL url01 = new URL("http://www.google.com/");
      //Retrieving the contents of the specified page
      Scanner sc = new Scanner(url01.openStream());
      //Instantiating the StringBuffer class to hold the result
      StringBuffer sb = new StringBuffer();
      while(sc.hasNext()) {
         sb.append(sc.next());
         // sb.append("\n");
      }
      //Retrieving the String from the String Buffer object
      String result = sb.toString();
      System.out.println("un-regexed String: " + result + "\n\n\n");
      // Removing the HTML tags
    //   result = result.replaceAll("<[^>]*>", "");
    //   System.out.println("Contents of the web page: " + result);
    }
}