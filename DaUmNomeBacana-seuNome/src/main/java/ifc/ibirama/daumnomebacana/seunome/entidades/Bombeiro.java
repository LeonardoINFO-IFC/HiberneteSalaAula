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
import java.time.LocalDate;


@Entity
@Table (name="Bombeiro")
public class Bombeiro {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="bom_id")
    private Integer id;
    @Column (name="bom_cpf", length = 11, unique = true, nullable = false)
    private String cpf;
    @Column (name="bom_data_nascimento", nullable = false)
    private LocalDate dataNacimento;
    @Column (name="bom_nome_completo", nullable = false, length = 45)    
    private String nome;
    @Column (name="bom_nome_guerra", unique = true, nullable = false, length = 45)
    private String guerra;

    public Bombeiro() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGuerra() {
        return guerra;
    }

    public void setGuerra(String guerra) {
        this.guerra = guerra;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;
            if ((aux.getId() != null) || (aux.getCpf() != null)) {
                if (aux.getId().equals(this.id) && (aux.getCpf().equals(this.cpf))) {
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
