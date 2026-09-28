/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.daumnomebacana.seunome.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author aluno
 */
public class HibernateUtil {
    private static final SessionFactory factory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory(){
        try {
        return new Configuration().configure().buildSessionFactory();
        } catch (Throwable erro) {
            throw new ExceptionInInitializerError(erro);
        }
    }
    public static SessionFactory getSessionFactory(){
        return factory;
    }
    public static void shutdown(){
        factory.close();
    }
    
}
