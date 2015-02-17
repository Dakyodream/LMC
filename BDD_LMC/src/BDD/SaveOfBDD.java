package BDD;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class SaveOfBDD {
	final String sAdrFileOfUser = "./Data/User";
	
	
	public SaveOfBDD(){
		
		
	}
	
	ArrayList<DirOfPlaylist> mListOfPref = new ArrayList<DirOfPlaylist>();
	ArrayList<Integer> mListOfDir = new ArrayList<Integer>();
	ArrayList<Album> mListOfAlbum = new ArrayList<Album>();
	ArrayList<Track> mListOfTrack = new ArrayList<Track>();
	
	
	
	public boolean savUser(ArrayList<User> ListOfUser){
		boolean bRet = false;
		boolean bTest = false;
		String sSav;
		File fileOfUserData = new File(sAdrFileOfUser);
		
		try{
			//création d'un nouveau fichier
			fileOfUserData.createNewFile();
			
			FileWriter fwMyFile = new FileWriter(fileOfUserData);
			
			try{
				for(User UserSave: ListOfUser){
					sSav = "User:"+UserSave.getName()+"/*/"+"Key:"+UserSave.getKey()+"/*/";
					sSav += "Config:"+UserSave.getConfig()+"/*/"+"PaswAct:"+UserSave.PasswordisActivate()+"/*/";
					if(UserSave.PasswordisActivate() == true){
						sSav += "Passwrd:" + UserSave.getPassword() + "/*/";
					}
					
					bTest = false;
					sSav += "PrefKey:";
					for(int iUserPrefKey : UserSave.getUserPref()){
						if(bTest == false){
							bTest = true;
							sSav += iUserPrefKey; //sSav += Integer.toString(iUserPrefKey) ???								
						}else{
							sSav += "," + iUserPrefKey;
						}
						
					}
					sSav += "/*/";
					
					bTest = false;
					sSav += "DirKey:";
					for(int iUserDirKey : UserSave.getUserDir()){
						if(bTest == false){
							bTest = true;
							sSav += iUserDirKey; //sSav += Integer.toString(iUserPrefKey) ???								
						}else{
							sSav += "," + iUserDirKey;
						}
						
					}
					sSav += "/*/\n";
					
					fwMyFile.write(sSav);
				}				
				
				bRet = true;
			} finally{
				fwMyFile.close();
			}				
		} catch(Exception e){
			javax.swing.JOptionPane.showMessageDialog(null,
					"Erreur de sauvegarde du profil user :" + e.toString(), "BDD LMC Error",  javax.swing.JOptionPane.ERROR_MESSAGE); 
		} 	
		
		return bRet;
	}
	

}
