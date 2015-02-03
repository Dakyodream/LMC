package BDD;

public class PrefOfTrack extends SpiritOfBDD {
	private int miKeyOfTrack;
	private int miPref;

	public PrefOfTrack(int iKey, int iKeyOfTrack, int iPref) {
		super.setKey(iKey);
		this.setKeyOfTrack(iKeyOfTrack);
		this.setPref(iPref);
	}

	public int getKeyOfTrack() {
		return this.miKeyOfTrack;
	}

	private void setKeyOfTrack(int iKeyOfTrack) {
		this.miKeyOfTrack = iKeyOfTrack;
	}

	public int getPref() {
		return this.miPref;
	}

	public void setPref(int iPref) {
		this.miPref = iPref;
	}
}
