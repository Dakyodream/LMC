package BDD;

import java.util.ArrayList;
import java.util.Arrays;

import TypeOfBDD.Style;

public class TraksAlbum extends SpiritOfBDD {
	private int miKeyOfTrack;
	private int miTracksNum;

	public TraksAlbum(int iKey, int iKeyOfTrack, int iNumOfTrack) {
		super.setKey(iKey);
		this.setKeyOfTrack(iKeyOfTrack);
		this.setTracksNum(iNumOfTrack);
	}

	public int getKeyOfTrack() {
		return this.miKeyOfTrack;
	}

	private void setKeyOfTrack(int iKeyOfTrack) {
		this.miKeyOfTrack = iKeyOfTrack;
	}

	public int getTracksNum() {
		return this.miTracksNum;
	}

	private void setTracksNum(int iTracksNum) {
		this.miTracksNum = iTracksNum;
	}

}
