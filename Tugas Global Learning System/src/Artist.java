import interfacepack.IArtist;

public class Artist extends BaseCharacter implements IArtist{

	public Artist() {
		// TODO Auto-generated constructor stub
		name = "Artist";
		paint = true;
		
	}

	@Override
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(name + " melukis");
	}
	
	

}
