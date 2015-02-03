package BDD;

/**
 * Le code n'est pas encors proteger
 * ==> c'est une esquisse du code
 */

import java.util.ArrayList;
import java.util.Arrays;

import TypeOfBDD.FormatOfPiste;
import TypeOfBDD.Style;

public class Track extends SpiritOfBDD {
	

	private String msTrackPictureAddr;
	private String msTrackAddr;
	private FormatOfPiste mTrackFormat;
	
	private int miLength;
	private int miYear;
	
	private int miAlbumKey;
	//ou
	//private ArrayList<Integer> mListOfAlbumKey = new ArrayList<Integer>();
	
	private ArrayList<Integer> mListOfArtistKey = new ArrayList<Integer>();
	private ArrayList<Style> mListOfStyle = new ArrayList<Style>(Arrays.asList(Style.values()));
	
	
	//new ArrayList<MyEnum>(Arrays.asList(MyEnum.values()));
	
	/** remplacer les type int et string pour 
	 * miDuree, msAdrPiste et msAdrImg par des type plus 
	 * adapté.
	 */
	
	
	public String getAddrPicture(){		
		return this.msTrackPictureAddr;
	}
	public void setAddrPicture(String sTrackPictureAddr){
		if(!sTrackPictureAddr.isEmpty()){
			this.msTrackPictureAddr = sTrackPictureAddr;
		}	
	}
		
	public String getTrackAddr(){		
		return this.msTrackAddr;
	}
	public void setTrackAddr(String sTrackAddr){
		if(!sTrackAddr.isEmpty()){
			this.msTrackAddr = sTrackAddr;
		}	
	}
	
	public FormatOfPiste getTrackFormat(){		
		return this.mTrackFormat;
	}
	private void setTrackFormat(FormatOfPiste TrackFormat){
		this.mTrackFormat = TrackFormat;
	}
		
	
	public int getLength(){		
		return this.miLength;
	}
	public void setLength(int iLength){
		this.miLength = iLength;
	}	
	
	public int getYear(){		
		return this.miYear;
	}
	public void setYear (int iYear){
		this.miYear = iYear;
	}	
	
	public ArrayList<Style> getStyles(){		
		return this.mListOfStyle;
	}
	public void setStyles(ArrayList<Style> listOfStyle){
		this.mListOfStyle = listOfStyle;
	}
	public void addStyle(Style trackStyle){
		this.mListOfStyle.add(trackStyle);
	}
	
	public Track(int iKeyOfTrack, String sTracksName, String sTrackAddr, FormatOfPiste TrackFormat, int iLength){
		/*Mettre des exception si un des champs est vide*/
		super.setKey(iKeyOfTrack);
		super.setName(sTracksName);
		this.setTrackAddr(sTrackAddr);
		this.setTrackFormat(TrackFormat);
		this.setLength(iLength);		
	}
	
	public Track(int iKeyOfTrack, String sTracksName, String sTrackAddr, FormatOfPiste TrackFormat, ArrayList<Style> listOfStyle, int iLength){
		super.setKey(iKeyOfTrack);
		super.setName(sTracksName);
		this.setTrackAddr(sTrackAddr);
		this.setTrackFormat(TrackFormat);
		this.setLength(iLength);
		this.setStyles(listOfStyle);
	}
	
	/* A completer */
	public String toString(){
		return this.msName;
		
	}
	

}
