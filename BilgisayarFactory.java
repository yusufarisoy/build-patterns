package FactoryDesignPattern;

import FactoryDesignPattern.Bilgisayar;
import FactoryDesignPattern.PC;
import FactoryDesignPattern.Server;

public class BilgisayarFactory
{
	public static Bilgisayar Get_Bilgisayar(String tip, String ram, String hdd, String cpu)
	{
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);
		
		return null;
	}
}