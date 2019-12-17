package FactoryDesignPattern;

public class PC implements Bilgisayar
{
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String hdd, String cpu)
	{
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public String Get_Ram()
	{
		return this.ram;
	}
	
	@Override
	public String Get_HDD()
	{
		return this.hdd;
	}
	
	@Override
	public String Get_CPU()
	{
		return this.cpu;
	}
}