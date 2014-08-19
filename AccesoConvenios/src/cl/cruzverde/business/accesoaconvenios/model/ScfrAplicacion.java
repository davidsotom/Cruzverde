package cl.cruzverde.business.accesoaconvenios.model;

import java.io.Serializable;


/**
 * cp:campo tp:tipo
E:ScfrAplicacion <extends> CgRefCodes
-------------------------------------
cp:rvHighValue :tp:String
cp:rvDomain :tp:String
cp:rvMeaning :tp:String
 *
 */
public class ScfrAplicacion extends CgRefCodes implements Serializable{

	/**
	 * variables
	 */
	private static final long serialVersionUID = 8799656478674716638L;

    public ScfrAplicacion() {
		super();
	}
    
    public ScfrAplicacion(String rvDomain, String rvLowValue, String rvHighValue,
			String rvAbbreviation, String rvMeaning) {
		super(rvDomain,rvLowValue,rvHighValue,rvAbbreviation,rvMeaning);
		
	}
    
    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof ScfrAplicacion)) {
            return false;
        }
        return true;
    }

}
