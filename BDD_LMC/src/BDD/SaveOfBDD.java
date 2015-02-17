package BDD;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class SaveOfBDD {
	final String msAdrFileOfUser = "User";
	final String msAdrOfDirData = "Data";
	
	
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
		
		File fileOfDirData = new File(this.msAdrOfDirData);
		File fileOfUserData = new File(this.msAdrOfDirData+"/"+this.msAdrFileOfUser);

		//test de l'existnace du dossier
		if(!fileOfDirData.exists()){
			try{
				fileOfDirData.mkdirs();
			}catch(Exception e){
				javax.swing.JOptionPane.showMessageDialog(null,
						"Erreur de création du dossier " + this.msAdrOfDirData + " :"
						+ e.toString(), "BDD LMC Error",  javax.swing.JOptionPane.ERROR_MESSAGE); 
				System.exit(-1);
			} 	
		}
		
		try{
			//création d'un nouveau fichier
			//On recréera le fichier pour faire une MAJ
			fileOfUserData.createNewFile();
			
			FileWriter fwMyFile = new FileWriter(fileOfUserData);
			
			try{
				for(User UserSave: ListOfUser){
					sSav = "User:"+UserSave.getName()+"/*/"+"Key:"+UserSave.getKey()+"/*/";
					sSav += "Config:"+UserSave.getConfig()+"/*/"+"PaswAct:"+UserSave.PasswordIsActivate()+"/*/";
					if(UserSave.PasswordIsActivate() == true){
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
			System.exit(-1);
		} 	
		
		return bRet;
	}	

}
