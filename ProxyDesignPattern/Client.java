package ProxyDesignPattern;

public class Client
{
	public static void main(String[] args)
	{
		Internet internet = new ProxyInternet();
		
		try
		{
			internet.connectTo("aaa.org");
			internet.connectTo("xyz.com");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}