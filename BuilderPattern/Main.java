package BuilderPattern;

import BuilderPattern.Bilgisayar;

public class Main
{
	public static void main(String[] args)
	{
		Bilgisayar bilgisayar = new Bilgisayar.BilgisayarKurucu("1 TB", "12 GB").Set_Grafik_Kart_Uygun(true).Set_SSD_Uygun(true).kur();
	}
}
