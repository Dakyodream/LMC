package BDD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadOfBDD {
	final String msAdrFileOfUser = "User";
	final String msAdrOfDirData = "Data";

	public LoadOfBDD() {

	}

	ArrayList<DirOfPlaylist> mListOfPref = new ArrayList<DirOfPlaylist>();
	ArrayList<Integer> mListOfDir = new ArrayList<Integer>();
	ArrayList<Album> mListOfAlbum = new ArrayList<Album>();
	ArrayList<Track> mListOfTrack = new ArrayList<Track>();

	public ArrayList<User> loadUser() {
		boolean bRet = false;
		boolean bTest = false;
		String sDonnees;

		File fileOfDirData = new File(this.msAdrOfDirData);
		File fileOfUserData = new File(this.msAdrOfDirData + "/"
				+ this.msAdrFileOfUser);

		// test de l'existnace du dossier
		if (!fileOfDirData.exists() || !fileOfUserData.exists()) {
			try {
				javax.swing.JOptionPane.showMessageDialog(null,
						"Données utilisateur inconnue.", "BDD LMC infor",
						javax.swing.JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e) {
				javax.swing.JOptionPane.showMessageDialog(null,
						"Erreur de création du dossier " + this.msAdrOfDirData
								+ " :" + e.toString(), "BDD LMC Error",
						javax.swing.JOptionPane.ERROR_MESSAGE);
				System.exit(-1);
			}
		}else{
			try{
				FileReader frDataFile = new FileReader(fileOfUserData);
				
				BufferedReader br = new BufferedReader(frDataFile);
				sDonnees = br.readLine();
				
			}catch(Exception e){
				
			}
			
		}
//			FileWriter fwMyFile = new FileReader(fileOfUserData);
//
//			try {
//				for (User UserSave : ListOfUser) {
//					sSav = "User:" + UserSave.getName() + "/*/" + "Key:"
//							+ UserSave.getKey() + "/*/";
//					sSav += "Config:" + UserSave.getConfig() + "/*/"
//							+ "PaswAct:" + UserSave.PasswordIsActivate()
//							+ "/*/";
//					if (UserSave.PasswordIsActivate() == true) {
//						sSav += "Passwrd:" + UserSave.getPassword() + "/*/";
//					}
//
//					bTest = false;
//					sSav += "PrefKey:";
//					for (int iUserPrefKey : UserSave.getUserPref()) {
//						if (bTest == false) {
//							bTest = true;
//							sSav += iUserPrefKey; // sSav +=
//													// Integer.toString(iUserPrefKey)
//													// ???
//						} else {
//							sSav += "," + iUserPrefKey;
//						}
//
//					}
//					sSav += "/*/";
//
//					bTest = false;
//					sSav += "DirKey:";
//					for (int iUserDirKey : UserSave.getUserDir()) {
//						if (bTest == false) {
//							bTest = true;
//							sSav += iUserDirKey; // sSav +=
//													// Integer.toString(iUserPrefKey)
//													// ???
//						} else {
//							sSav += "," + iUserDirKey;
//						}
//
//					}
//					sSav += "/*/\n";
//
//					fwMyFile.write(sSav);
//				}
//
//				bRet = true;
//			} finally {
//				fwMyFile.close();
//			}
//		} catch (Exception e) {
//			javax.swing.JOptionPane.showMessageDialog(null,
//					"Erreur de sauvegarde du profil user :" + e.toString(),
//					"BDD LMC Error", javax.swing.JOptionPane.ERROR_MESSAGE);
//			System.exit(-1);
//		}
		return null;

		//return new User(10, "Dakyo", "MyPassword", "@OfDir");
	}

}
