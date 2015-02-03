package BDD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import TypeOfBDD.FormatOfPiste;
import TypeOfBDD.Style;

public class Artiste extends SpiritOfBDD {

	ArrayList<Integer> mListOfTrack = new ArrayList<Integer>();
	private ArrayList<Style> mListOfArtistStyle = new ArrayList<Style>(Arrays.asList(Style.values()));

	public ArrayList<Style> getStyles() {
		return this.mListOfArtistStyle;
	}

	public void setStyles(ArrayList<Style> ListOfArtistStyle) {
		this.mListOfArtistStyle = ListOfArtistStyle;
	}

	public void addStyle(Style trackStyle) {
		this.mListOfArtistStyle.add(trackStyle);
	}

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

	public Artiste(int iArtistsKey, String sArtistsName) {
		/* Mettre des exception si un des champs est vide */
		super.setKey(iArtistsKey);
		/*
		 * A modifier pour les artiste tel que Celine Dion, -M-, ... ou pour les
		 * groupe
		 */
		super.setName(sArtistsName.toLowerCase());
	}

	/* A completer (surtout pour géré le cas -M- ou autre */
	public String toString() {
		return this.msName;
	}

}
