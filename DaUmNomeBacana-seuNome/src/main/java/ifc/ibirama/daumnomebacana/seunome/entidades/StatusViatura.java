/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.daumnomebacana.seunome.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.util.Objects;

@PrimaryKeyJoinColumn (name = "id")
public class StatusViatura extends Viatura{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stv_id")
    private Integer id;
    @Column(name = "stv_descricao", length = 45, unique = false, nullable = false)
    private String descricao;
    @Column(name = "stv_sigla", length = 5, unique = false, nullable = false)
    private String sigla;

    public StatusViatura() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final StatusViatura other = (StatusViatura) obj;
        return Objects.equals(this.id, other.id);
    }

    
}
