package cl.cruzverde.business.accesoaconvenios.model;

import java.io.Serializable;

/**
 * cp:campo tp:tipo
E:Promocion
--------------------------------------
codigoPromocion :tp:int
mensajePromocion :tp:String
 * 
 */
public class Promocion implements Serializable{
	
	private static final long serialVersionUID = 8799656478674716638L;
    private int codigoPromocion;
    private String mensajePromocion;
    
	public Promocion(){
		
	}

	public int getCodigoPromocion() {
		return codigoPromocion;
	}

	public void setCodigoPromocion(int codigoPromocion) {
		this.codigoPromocion = codigoPromocion;
	}

	public String getMensajePromocion() {
		return mensajePromocion;
	}

	public void setMensajePromocion(String mensajePromocion) {
		this.mensajePromocion = mensajePromocion;
		
	}
	
	@Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Promocion)) {
            return false;
        }
        Promocion other = (Promocion) object;
        if (this.codigoPromocion != other.codigoPromocion) {
            return false;
        }
        return true;
    }
}
