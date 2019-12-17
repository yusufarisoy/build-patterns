package FactoryDesignPattern;

import FactoryDesignPattern.Bilgisayar;
import FactoryDesignPattern.BilgisayarFactory;

public class Main
{
	public static void main(String[] args)
	{
		Bilgisayar bilgisayar = BilgisayarFactory.Get_Bilgisayar("PC", "16 GB", "1 TB", "2.4 GHz");
		Bilgisayar server = BilgisayarFactory.Get_Bilgisayar("Server", "128 GB", "5 TB", "2.9 GHz");
		
		System.out.println("Factory PC Config : " + bilgisayar);
		System.out.println("Factory Server Config : " + server);
	}
}
