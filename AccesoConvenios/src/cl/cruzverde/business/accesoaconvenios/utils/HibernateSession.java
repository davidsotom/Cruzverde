package cl.cruzverde.business.accesoaconvenios.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {

    private static final SessionFactory sessionFactory;
    private static final Configuration conf;
    
static {
       try{
              conf = new Configuration();
              conf.configure("hibernate.cfg.xml");
              sessionFactory = conf.buildSessionFactory();
          } catch (Throwable ex) {
             
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
          return sessionFactory;
    }
}