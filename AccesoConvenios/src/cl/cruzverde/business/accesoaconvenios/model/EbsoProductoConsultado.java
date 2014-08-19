package cl.cruzverde.business.accesoaconvenios.model;

import java.io.Serializable;

/**
 * cp:campo tp:tipo
 * E:EbsoProductoConsultado 
-------------------------------------
cp:codInterno :tp:int
cp:descriptorLargo :tp:String
cp:nombreProducto :tp:String
cp:presentacion :tp:String
cp:concentracion :tp:String
cp:formaFarmaceutica :tp:String
cp:contenido :tp:String
cp:unidadContenido :tp:String
cp:codigoBarra :tp:String
cp:laboratorioDescripcion :tp:String
cp:precio :tp:int
 */

public class EbsoProductoConsultado implements Serializable{
	
  /**
	* Variables
	*/
	private static final long serialVersionUID = 8799656478674716638L;
	private int codInterno;
	private String descriptorLargo;
	private String nombreProducto;
	private String presentacion;
	private String concentracion;
	private String formaFarmaceutica;
	private String contenido;
	private String unidadContenido;
	private String codigoBarra;
	private String laboratorioDescripcion;
	private int precio;
	
	public EbsoProductoConsultado(){
		
	}
	
	/**
	* Get/Set
	*/
	
	public int getCodInterno() {
		return codInterno;
	}

	public void setCodInterno(int codInterno) {
		this.codInterno = codInterno;
	}

	public String getDescriptorLargo() {
		return descriptorLargo;
	}

	public void setDescriptorLargo(String descriptorLargo) {
		this.descriptorLargo = descriptorLargo;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}

	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}

	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getUnidadContenido() {
		return unidadContenido;
	}

	public void setUnidadContenido(String unidadContenido) {
		this.unidadContenido = unidadContenido;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getLaboratorioDescripcion() {
		return laboratorioDescripcion;
	}

	public void setLaboratorioDescripcion(String laboratorioDescripcion) {
		this.laboratorioDescripcion = laboratorioDescripcion;
	}

	public int getPrecio() {
		return precio;
		
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	 @Override
	    public boolean equals(Object object) {
	        
	        if (!(object instanceof EbsoProductoConsultado)) {
	            return false;
	        }
	        EbsoProductoConsultado other = (EbsoProductoConsultado) object;
	        if (this.codInterno != other.codInterno) {
	            return false;
	        }
	        return true;
	    }
}
