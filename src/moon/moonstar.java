package moon;

import java.util.Scanner;

import model.mop;
import javax.swing.JOptionPane;

public class moonstar
{
	// data member section
	// Declaration section
	private mop myMonster;
	private mop userMonster;
	private Scanner inputScanner;

	// constructors initialize data members
	public moonstar()
	{

		myMonster = new mop("bulaug", 1.5, 4, true, 2);
		userMonster = new mop();
		inputScanner = new Scanner(System.in);
	}

	public void start()
     {
  JOptionPane.showMessageDialog(null,myMonster);
  System.out.println(myMonster);
    String name = inputScanner.nextLine();
    userMonster.setName();
    questions();
    String userInput = JOptionPane.showInputDialog(null, "how many arms for your Monster");
    {
     arms = Integer.parseInt(userInput);
     }

	private void questions()
	{
		Scanner textScanner;
		// System.out.println("what is your monsters name");
		System.out.println(myMonster);
		JOptionPane.showMessageDialog(null, myMonster);
		Scanner inputScanner = new

		// System.out.println("what is your monsters eye amount");
		JOptionPane.showMessageDialog(null, "how \nmany \narms?");

		boolean answer = Boolean.parseBoolean(userInput);

		int arms = inputScanner.nextInt();
		userMonster.setarmCount(arms);
		// System.out.println("what! your Monster has" + userMonster.getArmCount(); +
		// "arms!"();

		double legs = inputScanner.nextInt();
		userMonster.setlegCount(legs);

		JOptionPane.showMessageDialog("how \nmany \nlegs");
		JOptionPane.showmessageDialog("how \nmany \neyes");
		JOptionPane.showmessageDialog("how \nmany \nnoses");

	}

	public boolean validInt(String maybeInt)
    	{
    	
    	boolean isValid = false;
    	
    	try 
    	{
    		Integer.parseInt(maybeInt);
    	}
    	
    	catch (NumberFormatExeption error)
    	{
    		JOptionPane.showMessageDialog(null, "you need to type in a whole nuber");
    	}

	public boolean validDouble(String mightBeDouble)
	{
		
	}
    	return isValid;
  
    		}
