/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.daumnomebacana.seunome.entidades;

import java.time.LocalDate;

/**
 *
 * @author aluno
 */
public class Bombeiro {
    private Integer id;
    private String cpf;
    private LocalDate dataNacimento;
    private String nome;
    private String guerra;
    
    
    public Bombeiro(){
    
    }
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNacimento
     */
    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    /**
     * @param dataNacimento the dataNacimento to set
     */
    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the guerra
     */
    public String getGuerra() {
        return guerra;
    }

    /**
     * @param guerra the guerra to set
     */
    public void setGuerra(String guerra) {
        this.guerra = guerra;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro)obj;
            if (aux.getId().equals(this.id) && (aux.getCpf().equals(this.cpf))) {
                  return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
