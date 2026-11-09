/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.daumnomebacana.seunome.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import java.util.Objects;

/**
 *
 * @author aluno
 */
@PrimaryKeyJoinColumn (name = "id")
public class UnidadeResgate {
    @Id
    @Column (name = "unr_id")
    private Integer id;
    @Column (name = "unr_capacidade", unique = false, nullable = false)
    private Integer Capacidade;
    
    public UnidadeResgate(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(Integer Capacidade) {
        this.Capacidade = Capacidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final UnidadeResgate other = (UnidadeResgate) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
}
