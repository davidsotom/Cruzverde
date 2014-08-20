package cl.cruzverde.business.accesoaconvenios.delegate;

import cl.cruzverde.business.accesoaconvenios.dao.ScfrBitacoraServicioDAO;
import cl.cruzverde.business.accesoaconvenios.exceptions.DAOException;

public class ScfrBitacoraServicioDelegate {
    
	private ScfrBitacoraServicioDAO bitacoraDao;
    
    public ScfrBitacoraServicioDelegate(){
    	
    }
    
    public boolean registraBitacora(Object obj) throws DAOException{
    	return bitacoraDao.create(obj);
    }
    
    public boolean actualizaRegistroBitacora(Object obj)throws DAOException{
    	return bitacoraDao.update(obj);
    }
}
