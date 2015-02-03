package BDD;

import java.util.ArrayList;

public class User extends SpiritOfBDD {
	ArrayList<Integer> mListOfPref = new ArrayList<Integer>();
	ArrayList<Integer> mListOfDir = new ArrayList<Integer>();
	/* Il y aura toujours une liste par def (pour toute les piste : ALL) et une
	 * "préférence" par def (preg general : PREF), et un artiste par def (HorseWithNoName),
	 * avec un album par def (Inconnu) , ...
	 * Si supprimer dans def ==> supprimer partout
	 */
	
	
	private String msConfiguration;
	private String msPassword;
	private boolean mbPasswordActivate = false;
	
	
	public String getConfig(){		
		return this.msConfiguration;
	}
	public void setConfig(String sConfiguration){
		if(!sConfiguration.isEmpty()){
			this.msConfiguration = sConfiguration;
		}		
	}

	
	public boolean setPassword(String sLastPassword, String sNewPassword){
		boolean bRet = false;
		
		if(sNewPassword.length() < 6){ /* Test sur le nouveau password*/
			if( !(mbPasswordActivate == true) && (this.msPassword != this.AlgoPassword(sLastPassword)) ){
					this.msPassword = this.AlgoPassword(sNewPassword);
					bRet = true;
					mbPasswordActivate = true;
			}
		}
		
		return bRet;
	}
	private String AlgoPassword(String sPassword){
		/* Mettre ici un algo de conversion du password 
		 * Ci dessous exemple pourri
		 */
		return sPassword.toUpperCase(null);		
	}
	
	public boolean PasswordisActivate(){		
		return this.mbPasswordActivate;
	}
	public boolean ActivatePassword(String sNewPassword){
		return this.setPassword(null, sNewPassword);
	}
	
	
	public User(int iKey, String sName, String sAdrOfConfig){
		/*Mettre des exception si un des champs est vide*/
		super.setKey(iKey);
		super.setName(sName);
		this.setConfig(sAdrOfConfig);
	}
	
	public User(int iKey, String sName, String sPassword, String sAdrOfConfig){
		/*Mettre des exception si un des champs est vide*/
		super.setKey(iKey);
		super.setName(sName);
		this.ActivatePassword(sPassword);
		this.setConfig(sAdrOfConfig);
	}
	
	
}
