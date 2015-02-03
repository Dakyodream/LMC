package BDD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import TypeOfBDD.Style;

public class Album extends SpiritOfBDD{

	
	private String msEditeur;
	private String msAdrImage;
	
	private int miYear;
	
	private ArrayList<Integer> mListOfTracksAlbum = new ArrayList<Integer>();
	private ArrayList<Style> mListOfAlbumsStyle = new ArrayList<Style>(Arrays.asList(Style.values()));

	
	public String getEditeur(){		
		return this.msEditeur;
	}
	public void setEditeur(String sEditeur){
		if(!sEditeur.isEmpty()){
			this.msEditeur = sEditeur;
		}		
	}
	
	public String getAdrImage(){		
		return this.msAdrImage;
	}
	public void setAdrImage(String sAdrImage){
		if(!sAdrImage.isEmpty()){
			this.msAdrImage = sAdrImage;
		}		
	}
	
	public int getYear(){		
		return this.miYear;
	}
	public void setYear(int iYear){
		this.miYear = iYear;
	}	
	

	public ArrayList<Style> getStyles(){		
		return this.mListOfAlbumsStyle;
	}
	public void setStyles(ArrayList<Style> ListOfAlbumsStyle){
		this.mListOfAlbumsStyle = ListOfAlbumsStyle;
	}
	public void addStyle(Style AlbumStyle){
		this.mListOfAlbumsStyle.add(AlbumStyle);
	}
	
	public ArrayList<Integer> getTracks(){		
		return this.mListOfTracksAlbum;
	}
	public void setTracks(ArrayList<Integer> ListOfTracks){
		this.mListOfTracksAlbum = ListOfTracks;
	}
	public void addTrack(int iKeyOfTrack){
		this.mListOfTracksAlbum.add(iKeyOfTrack);
	}
	public void rmTrack(int iKeyOfTrack){
		this.mListOfTracksAlbum.remove(iKeyOfTrack);
	}
	
	
	public Album(int iAlbumsKey, String sAlbumsName){
		/*Mettre des exception si un des champs est vide*/
		super.setKey(iAlbumsKey);
		super.setName(sAlbumsName);
	}
	

}

	
	
	
	
	
	
	
	
	
	
	