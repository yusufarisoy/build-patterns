package ProxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet
{
	private Internet internet = new RealInternet();
	private static List<String> bannedSites;
	
	static
	{
		bannedSites = new ArrayList<String>();
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
		bannedSites.add("klm.com");
		bannedSites.add("xyz.com");
	}
	
	@Override
	public void connectTo(String serverhost) throws Exception
	{
		if (bannedSites.contains(serverhost.toLowerCase()))
		{
			throw new Exception("Erişim Engellendi");
		}
		
		internet.connectTo(serverhost);
	}
}