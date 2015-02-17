import java.util.ArrayList;

import BDD.SaveOfBDD;
import BDD.User;


public class TestUserSav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> mListOfUser = new ArrayList<User>();
		SaveOfBDD mySav = new SaveOfBDD();
		
		System.out.println("Test de le sauvegarde de User : Start \n");
		
		
		mListOfUser.add(new User(10, "Dakyo", "MyPassword", "@OfDir"));
		mListOfUser.add(new User(11, "Dakyo2", "@OfDir2"));
		mListOfUser.add(new User(12, "William", "shakespear", "@BankOfEngland"));
		mListOfUser.add(new User(13, "Sherlock", "DetectiveConsultant", "@221B Baker Street"));
		
		System.out.println("Retour save : " + mySav.savUser(mListOfUser) + "\n");
		
		System.out.println("Test de le sauvegarde de User : Fin \n");
	}
}
