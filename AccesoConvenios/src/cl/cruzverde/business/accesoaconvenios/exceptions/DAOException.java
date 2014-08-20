package cl.cruzverde.business.accesoaconvenios.exceptions;

public class DAOException extends Exception{
 
	private static final long serialVersionUID = 3954792017153054275L;
	protected Throwable causa;

    public DAOException() {
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
}
