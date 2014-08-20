package cl.cruzverde.business.accesoaconvenios.dao;



import org.apache.log4j.Logger;
import org.hibernate.Session;

import cl.cruzverde.business.accesoaconvenios.exceptions.DAOException;
import cl.cruzverde.business.accesoaconvenios.model.ScfrBitacoraServicio;
import cl.cruzverde.business.accesoaconvenios.utils.HibernateSession;



public class ScfrBitacoraServicioDAO implements IPersistencia{
    
	private static Logger logger = Logger.getLogger(ScfrBitacoraServicioDAO.class);
	
	public ScfrBitacoraServicioDAO(){
    	
    }
	
	@Override
	public boolean create(Object obj) throws DAOException{ 
	ScfrBitacoraServicio bitacora = (ScfrBitacoraServicio) obj;
	Session ses = HibernateSession.getSessionFactory().openSession();
	try{ 
	  ses.beginTransaction(); 
	  ses.save(bitacora); 
	  ses.getTransaction().commit(); 
	  return true;
	}
	catch (Throwable ex) { 
	if (ses.getTransaction()!=null) {ses.getTransaction().rollback();return false;}
 	    logger.error("create() -> Error: Fallo al registrar la bitácora de servicios." + ex.getMessage());
        throw new DAOException("["+ScfrBitacoraServicioDAO.class.getSimpleName()+"] "+
 	    "Error: Fallo al registrar la bitácora de servicios."); 
	}
	
	finally { 
	   ses.close(); 
	  }
	} 
	
	
	@Override
	public boolean update(Object obj) throws DAOException{ 
	ScfrBitacoraServicio bitacora = (ScfrBitacoraServicio) obj;
	Session ses = HibernateSession.getSessionFactory().openSession();
	try{ 
	  ses.beginTransaction(); 
	  ses.update(bitacora); 
	  ses.getTransaction().commit(); 
	  return true;
	}
	catch (Throwable ex) { 
		if (ses.getTransaction()!=null) {ses.getTransaction().rollback();return false;}
	 	    logger.error("update() -> Error: Fallo al actualizar los registros de la bitácora de servicios." + ex.getMessage());
	        throw new DAOException("["+ScfrBitacoraServicioDAO.class.getSimpleName()+"] "+
	 	    "Error: Fallo al actualizar los registros de la bitácora de servicios."); 
		}
	
	finally { 
	   ses.close(); 
	  }
	} 
}
