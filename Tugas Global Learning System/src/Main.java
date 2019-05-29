
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<BaseCharacter> character = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	String action,actionNum;
	
	public Main() {
		
		BaseCharacter characters = new Chef();
		character.add(characters);
		
		characters = new Driver();
		character.add(characters);
		
		characters = new Doctor();
		character.add(characters);
		
		characters = new Artist();
		character.add(characters);
		
		characters = new Cashier();
		character.add(characters);
		
		characters = new Singer();
		character.add(characters);
		
		while(true)
		{
			for (int i=0;i<10;i++)
			{
				System.out.println();
			}
			System.out.println("Simulasi kelompok kemampuan");
			
			for (int i=0;i<character.size();i++)
			{
				System.out.println(i + ":" + character.get(i).getname());
			}
			System.out.print("Input: ");
			
			action = scan.next();
			actionNum = scan.nextLine();
			
			ArrayList<Integer> indexAction = new ArrayList<>();
			for (int i=0;i<actionNum.length();i++)
			{
				int index = (int)(actionNum.charAt(i)-'0');
				//System.out.println(index);
				if (index>=0 && index<=5)
				{
					//System.out.println("hi");
					indexAction.add(index);
				}
			}
			
			for (int i=0;i<indexAction.size();i++)
			{
				switch(action.toLowerCase())
				{
					case "info":
						character.get(indexAction.get(i)).getinfo();
						break;
					case "cook":
						character.get(indexAction.get(i)).Cook();
						break;
					case "drive":
						character.get(indexAction.get(i)).Drive();
						break;
					case "paint":
						character.get(indexAction.get(i)).Paint();
						break;
					case "work":
						character.get(indexAction.get(i)).Work();
						break;
				}
			}
			System.out.println("Press Enter...");
			scan.nextLine();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
