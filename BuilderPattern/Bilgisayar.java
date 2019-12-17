package BuilderPattern;

public class Bilgisayar
{
	private String hdd;
	private String ram;
	
	private boolean grafikKartUygunMu;
	private boolean ssdUygunMu;
	
	public String Get_HDD()
	{
		return hdd;
	}
	
	public String Get_Ram()
	{
		return ram;
	}
	
	public boolean grafikKartUygunMu()
	{
		return grafikKartUygunMu;
	}
	
	public boolean ssdUygunMu()
	{
		return ssdUygunMu; 
	}
	
	private Bilgisayar(BilgisayarKurucu kurucu)
	{
		this.hdd = kurucu.hdd;
		this.ram = kurucu.ram;
		this.grafikKartUygunMu = kurucu.grafikKartUygunMu;
		this.ssdUygunMu = kurucu.ssdUygunMu;
	}
	
	
	public static class BilgisayarKurucu
	{
		private String hdd;
		private String ram;

		private boolean grafikKartUygunMu;
		private boolean ssdUygunMu;
			
		public BilgisayarKurucu(String hdd, String ram){
			this.hdd=hdd;
			this.ram=ram;
		}

		public BilgisayarKurucu Set_Grafik_Kart_Uygun(boolean grafikKartUygunMu) {
			this.grafikKartUygunMu = grafikKartUygunMu;
			return this;
		}

		public BilgisayarKurucu Set_SSD_Uygun(boolean ssdUygunMu) {
			this.ssdUygunMu = ssdUygunMu;
			return this;
		}
			
		public Bilgisayar kur(){
			return new Bilgisayar(this);
		}
	}
}