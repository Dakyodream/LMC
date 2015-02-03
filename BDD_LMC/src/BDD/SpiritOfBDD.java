package BDD;

import javax.swing.JApplet;

public abstract class SpiritOfBDD{
	private int miKey;
	protected String msName;

	public int getKey(){		
		return this.miKey;
	}
	protected void setKey(int iKey){
		this.miKey = iKey;
	}
	
	public String getName(){		
		return this.msName;
	}
	public void setName(String sName){
		if(!sName.isEmpty()){
			this.msName = sName;
		}		
	}
	
	public String toString(){
		return this.msName;
	}
	
}
