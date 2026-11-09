/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.daumnomebacana.seunome;

import ifc.ibirama.daumnomebacana.seunome.entidades.Bombeiro;
import ifc.ibirama.daumnomebacana.seunome.entidades.Usuario;
import ifc.ibirama.daumnomebacana.seunome.util.HibernateUtil;
import java.time.LocalDate;
import java.time.Month;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GerenciarBombeiro {

    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();

        System.out.println("Sesão estabelecida");

        sessao.close();

        Transaction tranacao = null;

        Bombeiro bombeiro01 = new Bombeiro();
        bombeiro01.setCpf("12345678901");
        bombeiro01.setNome("Leonardo Henrique de Andrade");
        bombeiro01.setGuerra("Andrade");
        bombeiro01.setDataNacimento(LocalDate.of(2010, Month.FEBRUARY, 5));
        
        Usuario usuario01 = new Usuario();
        usuario01.setLogin("teuPai");
        usuario01.setSenha("707070seNaoDer70deNovo");

        bombeiro01.setUsuario(usuario01);
        usuario01.setBombeiro(bombeiro01);
        
        try {
            tranacao = sessao.beginTransaction();

            sessao.persist(bombeiro01);
            sessao.persist(usuario01);
            
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
