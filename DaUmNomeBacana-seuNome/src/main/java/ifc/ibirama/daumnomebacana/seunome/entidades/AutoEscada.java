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
public class AutoEscada extends Viatura{
    @Id
    @Column (name="aue_id")
    private Integer id;
    @Column (name="aue_altura_max", unique = false, nullable = false)
    private Integer maxAltura;
    
    public AutoEscada(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaxAltura() {
        return maxAltura;
    }

    public void setMaxAltura(Integer maxAltura) {
        this.maxAltura = maxAltura;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final AutoEscada other = (AutoEscada) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
}
