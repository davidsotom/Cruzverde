package cl.cruzverde.business.accesoaconvenios.model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
/**
 * cp:campo tp:tipo
 * E:ScfrBitacoraServicio
----------------------------------
cp:idBitacoraServicio :tp:Int(pk)
cp:nombreAplicacion :tp:String
cp:nombreWs :tp:String
cp:metodosWs :tp:String
cp:tipoInvocacion :tp:String :val: hasta 10 caracteres
cp:fechaConsulta  :tp:Date 
cp:xmlConsulta   :tp:Sql.Blob
cp:fechaRespuesta :tp:Date 
cp:xmlRespuesta  :tp:Sql.Blob
cp:indentificadorInterno :tp:Int
cp:descripcion:tp:String
 * 
 */
public class ScfrBitacoraServicio implements Serializable{
	
  /**
    * Variables
    */
	private static final long serialVersionUID = 8799656478674716638L;
	private int idBitacoraServicio;
	private String nombreAplicacion;
    private String nombreWs;
    private String metodosWs;
    private String tipoInvocacion;
    private Date fechaConsulta;
    private Blob xmlConsulta ;
    private Date fechaRespuesta;
    private Blob xmlRespuesta;
    private int indentificadorInterno;
    private String descripcion;
    
 
    public ScfrBitacoraServicio(){
		
	}
    
    /**
     * get / set 
     */
	public int getIdBitacoraServicio() {
		return idBitacoraServicio;
	}


	public void setIdBitacoraServicio(int idBitacoraServicio) {
		this.idBitacoraServicio = idBitacoraServicio;
	}


	public String getNombreAplicacion() {
		return nombreAplicacion;
	}


	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}


	public String getNombreWs() {
		return nombreWs;
	}


	public void setNombreWs(String nombreWs) {
		this.nombreWs = nombreWs;
	}


	public String getMetodosWs() {
		return metodosWs;
	}


	public void setMetodosWs(String metodosWs) {
		this.metodosWs = metodosWs;
	}


	public String getTipoInvocacion() {
		return tipoInvocacion;
	}


	public void setTipoInvocacion(String tipoInvocacion) {
		this.tipoInvocacion = tipoInvocacion;
	}


	public Date getFechaConsulta() {
		return fechaConsulta;
	}


	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}


	public Blob getXmlConsulta() {
		return xmlConsulta;
	}


	public void setXmlConsulta(Blob xmlConsulta) {
		this.xmlConsulta = xmlConsulta;
	}


	public Date getFechaRespuesta() {
		return fechaRespuesta;
	}


	public void setFechaRespuesta(Date fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}


	public Blob getXmlRespuesta() {
		return xmlRespuesta;
	}


	public void setXmlRespuesta(Blob xmlRespuesta) {
		this.xmlRespuesta = xmlRespuesta;
	}


	public int getIndentificadorInterno() {
		return indentificadorInterno;
	}


	public void setIndentificadorInterno(int indentificadorInterno) {
		this.indentificadorInterno = indentificadorInterno;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
	@Override
    public boolean equals(Object object) {
        
        if (!(object instanceof ScfrBitacoraServicio)) {
            return false;
        }
        ScfrBitacoraServicio other = (ScfrBitacoraServicio) object;
        if (this.idBitacoraServicio != other.idBitacoraServicio) {
            return false;
        }
        return true;
    }
    
}
