package cl.cruzverde.business.accesoaconvenios.model;


import java.io.Serializable;
/**
 * cp:campo tp:tipo
E:CgRefCodes
---------------------------------
cp:rvDomain :tp:String
cp:rvLowValue :tp:String
cp:rvHighValue :tp:String
cp:rvAbbreviation :tp:String
cp:rvMeaning :tp:String
 * 
 */
public class CgRefCodes implements Serializable{
  /**
    * Variables
	*/
	private static final long serialVersionUID = 8799656478674716638L;
	private String rvDomain;
	private String rvLowValue;
	private String rvHighValue;
	private String rvAbbreviation;
	private String rvMeaning;
	
	public CgRefCodes(){
		
	}
	
	public CgRefCodes(String rvDomain, String rvLowValue, String rvHighValue,
			String rvAbbreviation, String rvMeaning) {
		super();
		this.rvDomain = rvDomain;
		this.rvLowValue = rvLowValue;
		this.rvHighValue = rvHighValue;
		this.rvAbbreviation = rvAbbreviation;
		this.rvMeaning = rvMeaning;
	}

	/**
    * get / set 
    */
	
	public String getRvDomain() {
		return rvDomain;
	}

	public void setRvDomain(String rvDomain) {
		this.rvDomain = rvDomain;
	}

	public String getRvLowValue() {
		return rvLowValue;
	}

	public void setRvLowValue(String rvLowValue) {
		this.rvLowValue = rvLowValue;
	}

	public String getRvHighValue() {
		return rvHighValue;
	}

	public void setRvHighValue(String rvHighValue) {
		this.rvHighValue = rvHighValue;
	}

	public String getRvAbbreviation() {
		return rvAbbreviation;
	}

	public void setRvAbbreviation(String rvAbbreviation) {
		this.rvAbbreviation = rvAbbreviation;
	}

	public String getRvMeaning() {
		return rvMeaning;
	}

	public void setRvMeaning(String rvMeaning) {
		this.rvMeaning = rvMeaning;
		
	}
	
	  @Override
	    public boolean equals(Object object) {
	        
	        if (!(object instanceof CgRefCodes)) {
	            return false;
	        }
	        CgRefCodes other = (CgRefCodes) object;
	        if ((this.rvHighValue == null && other.rvHighValue != null) || (this.rvHighValue != null && !this.rvHighValue.equals(other.rvHighValue))) {
	            return false;
	        }
	        return true;
	    }

	

}
