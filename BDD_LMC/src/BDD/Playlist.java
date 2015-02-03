package BDD;

import java.util.ArrayList;

public class Playlist extends SpiritOfBDD {

	ArrayList<Integer> mListOfTrack = new ArrayList<Integer>();

	public ArrayList<Integer> getTracks() {
		return this.mListOfTrack;
	}

	public void setTracks(ArrayList<Integer> ListOfTracks) {
		this.mListOfTrack = ListOfTracks;
	}

	public void addTrack(int iKeyOfTrack) {
		this.mListOfTrack.add(iKeyOfTrack);
	}

	public void rmTrack(int iKeyOfTrack) {
		this.mListOfTrack.remove(iKeyOfTrack);
	}

	public Playlist(int iKey, String sName) {
		/* Mettre des exception si un des champs est vide */
		super.setKey(iKey);
		super.setName(sName);
	}

}
