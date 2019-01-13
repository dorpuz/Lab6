import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionTester {

    public static void main(String[] args) throws MalformedURLException{
        CheckedExceptionTester checkedExceptionTester = new CheckedExceptionTester();
        //checkedExceptionTester.urlTesterByTryCatch("htt://wszib.edu.pl");
        checkedExceptionTester.urlTesterByThrows("htt:google.pl");
    }

    public void urlTesterByTryCatch(String urlString){
        try{
            URL url = new URL(urlString);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException murle){
            murle.printStackTrace();
        }
    }

    public void urlTesterByThrows(String urlString) throws MalformedURLException{

        URL url = new URL(urlString);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }
}
