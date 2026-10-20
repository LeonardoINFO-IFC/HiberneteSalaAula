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
import jakarta.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "tatuViatura")
public class StatusBombeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stb_id")
    private Integer id;
    @Column(name = "stb_descricao", length = 45, unique = false, nullable = false)
    private String descricao;
    @Column(name = "stb_sigla", length = 5, unique = false, nullable = false)
    private String sigla;

    public StatusBombeiro() {
        return;
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
    public boolean equals(Object obj) {
        if (obj instanceof StatusViatura) {
            StatusViatura aux = (StatusViatura) obj;
            if ((aux.getId() != null)) {
                if (aux.getId().equals(this.id)) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
