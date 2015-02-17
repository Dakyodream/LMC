package BDD;

import java.util.ArrayList;

public class BDD {

	/**
	 * Cette classe contiendra des liste d'utilisateur avec des liste de pref,
	 * playlist, dossiers, tracks, album, ...
	 * 
	 * C'est dans cette classe que sera géré la sauvegarde de la bdd
	 */

	
	
	ArrayList<User> mListOfUser = new ArrayList<User>();
	ArrayList<DirOfPlaylist> mListOfPref = new ArrayList<DirOfPlaylist>();
	ArrayList<Integer> mListOfDir = new ArrayList<Integer>();
	ArrayList<Album> mListOfAlbum = new ArrayList<Album>();
	ArrayList<Track> mListOfTrack = new ArrayList<Track>();

	/*
	 * Soit le fichier de conf des track est commun a tous, soit l'emplacement
	 * est specifié dans le fichier de configuration de l'user
	 */
	
	public BDD(){
		
		//init system 
		
	}
	
	
	  
	public void saveBDD(){
		SaveOfBDD mySavBDD;
		
	}

}
