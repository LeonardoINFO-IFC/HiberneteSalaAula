/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.daumnomebacana.seunome;

import ifc.ibirama.daumnomebacana.seunome.entidades.Bombeiro;
import ifc.ibirama.daumnomebacana.seunome.util.HibernateUtil;
import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GerenciarBombeiro {
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        System.out.println("Sesão estabelecida");
        
        sessao.close();
        
        Transaction tranacao = null;
        
        Bombeiro bombeiro = new Bombeiro();
        bombeiro.setCpf("12345678911");
        bombeiro.setDataNacimento(LocalDate.of(2010, 2, 5));
        bombeiro.setNome("Leonardo Henrique de Andrade");
        bombeiro.setGuerra("Andrade");
        
        try {
            tranacao = sessao.beginTransaction();
            
            sessao.persist(bombeiro);
            
            tranacao.commit();
            System.out.println("Bombeiro 'salvo");
            sessao.close();
        } catch (Exception e) {
            if (tranacao != null) {
                tranacao.rollback();
            }
        }
        HibernateUtil.shutdown();
    }
}
