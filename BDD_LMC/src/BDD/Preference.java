package BDD;

import java.util.ArrayList;

public class Preference extends SpiritOfBDD {
	private ArrayList<Integer> mListOfPrefsTrack = new ArrayList<Integer>();

	public ArrayList<Integer> getPrefTracks() {
		return this.mListOfPrefsTrack;
	}

	public void setPrefTracks(ArrayList<Integer> ListOfTracks) {
		this.mListOfPrefsTrack = ListOfTracks;
	}

	public void addPrefTracks(int iKeyOfTrack) {
		this.mListOfPrefsTrack.add(iKeyOfTrack);
	}

	public void rmPrefTracks(int iKeyOfTrack) {
		this.mListOfPrefsTrack.remove(iKeyOfTrack);
	}

	public Preference(int iKey, String sNamesPref) {
		super.setKey(iKey);
		super.setName(sNamesPref);
	}

	public Preference(int iKey) {
		super.setKey(iKey);
	}
}
