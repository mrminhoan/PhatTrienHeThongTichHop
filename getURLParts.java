package getURLParts;
import java.net.URL;
import java.net.MalformedURLException;
public class getURLParts {
	public static void main(String[] args)
	{
		try
		{
			URL u = new URL("https://www.facebook.com/");
			System.out.println("URL is "+u);
			System.out.println("The protocol part is "+u.getProtocol());
			System.out.println("The host part is "+u.getHost());
			System.out.println("The file part is "+u.getFile());
			System.out.println("The reference part is "+u.getRef());
		}
		catch(MalformedURLException e)
		{
			System.err.println(e);
		}
	}
}

