import interfacepack.IWorker;

public class Cashier extends BaseCharacter implements IWorker {

	public Cashier() {
		// TODO Auto-generated constructor stub
		name = "Cashier";
		work = true;
	}
	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name + " bekerja");
	}
}
