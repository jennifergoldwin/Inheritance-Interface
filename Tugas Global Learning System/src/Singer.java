import interfacepack.IArtist;
import interfacepack.IChef;
import interfacepack.IDriver;
import interfacepack.IWorker;

public class Singer extends BaseCharacter implements IChef,IArtist,IDriver,IWorker{

	public Singer() {
		// TODO Auto-generated constructor stub
		name = "Singer";
		cook= true;
		paint = true;
		drive= true;
		work = true;
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name + " bekerja");
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " menyetir");
	}

	@Override
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(name + " melukis");
	}

	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(name + " memasak");
	}

}
