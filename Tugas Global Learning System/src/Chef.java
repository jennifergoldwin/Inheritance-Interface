import interfacepack.IChef;
import interfacepack.IDriver;

public  class Chef extends BaseCharacter implements IChef,IDriver{

	public Chef() {
		name = "Chef";
		cook = true;
		drive = true;
	}

	@Override
	public void Cook() {
		System.out.println(name + " memasak");
		
	}
	
	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " menyetir");
	}

}
