package cl.cruzverde.business.accesoaconvenios.model;

import java.io.Serializable;

/**
 * cp:campo tp:tipo
E:ScfrLocalesStock
--------------------------------------
cp:stockLocal :tp:int
cp:latitudLocal :tp:double
cp:longitudLocal :tp:double
cp:nombreLocal :tp:String
cp:direccionLocal :tp:String
cp:region :tp:String
cp:comuna :tp:String
cp:horarioDeAtencion :tp:String
cp:telefono :tp:String
cp:medicamentoRestringuido :tp:String
 * 
 */
public class ScfrLocalesStock implements Serializable{

	private static final long serialVersionUID = 8799656478674716638L;
	private int stockLocal;
	private double latitudLocal;
	private double longitudLocal;
	private String nombreLocal;
	private String direccionLocal;
	private String region;
	private String comuna;
	private String horarioDeAtencion;
	private String telefono;
	private String medicamentoRestringuido;
	
	public ScfrLocalesStock(){
		
	}

	public int getStockLocal() {
		return stockLocal;
	}

	public void setStockLocal(int stockLocal) {
		this.stockLocal = stockLocal;
	}

	public double getLatitudLocal() {
		return latitudLocal;
	}

	public void setLatitudLocal(double latitudLocal) {
		this.latitudLocal = latitudLocal;
	}

	public double getLongitudLocal() {
		return longitudLocal;
	}

	public void setLongitudLocal(double longitudLocal) {
		this.longitudLocal = longitudLocal;
	}

	public String getNombreLocal() {
		return nombreLocal;
	}

	public void setNombreLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}

	public String getDireccionLocal() {
		return direccionLocal;
	}

	public void setDireccionLocal(String direccionLocal) {
		this.direccionLocal = direccionLocal;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getHorarioDeAtencion() {
		return horarioDeAtencion;
	}

	public void setHorarioDeAtencion(String horarioDeAtencion) {
		this.horarioDeAtencion = horarioDeAtencion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMedicamentoRestringuido() {
		return medicamentoRestringuido;
	}

	public void setMedicamentoRestringuido(String medicamentoRestringuido) {
		this.medicamentoRestringuido = medicamentoRestringuido;
	}
	
	 @Override
	    public boolean equals(Object object) {
	        
	        if (!(object instanceof ScfrLocalesStock)) {
	            return false;
	        }
	        return true;
	    }
	
}
