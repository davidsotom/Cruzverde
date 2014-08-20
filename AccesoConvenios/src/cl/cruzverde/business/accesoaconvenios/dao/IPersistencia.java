package cl.cruzverde.business.accesoaconvenios.dao;

import cl.cruzverde.business.accesoaconvenios.exceptions.DAOException;

interface IPersistencia {
	
      public boolean create(Object obj) throws DAOException;
      
      public boolean update(Object obj) throws DAOException;
      
 
}
