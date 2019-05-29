
public class BaseCharacter {

	protected String name;
	protected String description;
	protected boolean drive=false ,cook= false ,paint=false ,work=false;
	
	public void getinfo()
	{
		if (cook)
		{
			System.out.println(name + ", seseorang yang bisa memasak");
		}
		if (drive)
		{
			System.out.println(name + ", seseorang yang bisa menyetir");
		}
		if (paint)
		{
			System.out.println(name + ", seseorang yang bisa melukis");
		}
		if (work)
		{
			System.out.println(name + ", seseorang yang bisa bekerja");
		}
	}
	
	public void Work()
	{
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public void Paint()
	{
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public void Drive()
	{
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public void Cook()
	{
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public String getname()
	{
		return name;
	}
}
