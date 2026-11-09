/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.daumnomebacana.seunome.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Patente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "pat_id")
    private Integer id;
    @Column (name = "pat_sigla", length = 10, nullable = false)
    private String sigla;
    @Column (name = "pat_descricao", length = 45)
    private String descricao;
    @ManyToMany (mappedBy = "patente")
    private Set<Bombeiro> bombeiro = new HashSet<Bombeiro>();
    

    public Patente(){
        
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Bombeiro> getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Set<Bombeiro> bombeiro) {
        this.bombeiro = bombeiro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patente other = (Patente) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
    
}
