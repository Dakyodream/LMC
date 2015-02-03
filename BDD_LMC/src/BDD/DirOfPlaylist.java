package BDD;

import java.util.ArrayList;

public class DirOfPlaylist extends SpiritOfBDD{

	/* Remarque : comme tous passe par des clés et que
	 * les Playlist et les dir on le "même type de clés"
	 * rien n'empèche de mettre un dir dans un dir
	 */
	ArrayList<Integer> mListOfDir = new ArrayList<Integer>();
	
	
	public ArrayList<Integer> getTracks(){		
		return this.mListOfDir;
	}
	public void setTracks(ArrayList<Integer> ListOfDir){
		this.mListOfDir = ListOfDir;
	}
	public void addTrack(int iKeyOfDir){
		this.mListOfDir.add(iKeyOfDir);
	}
	public void rmTrack(int iKeyOfDir){
		this.mListOfDir.remove(iKeyOfDir);
	}
	
	
	public DirOfPlaylist(int iKey, String sName){
		/*Mettre des exception si un des champs est vide*/
		super.setKey(iKey);
		super.setName(sName);
	}
	
	
	
}
