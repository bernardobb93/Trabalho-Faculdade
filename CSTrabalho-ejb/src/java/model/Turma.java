/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author bernardo
 */
@Entity
@Table(name = "TURMA")
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t")})
public class Turma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO")
    private Integer numero;
    @Size(max = 100)
    @Column(name = "ALUNO")
    private String aluno;
    @Column(name = "PROVA1")
    private Integer prova1;
    @Column(name = "PROVA2")
    private Integer prova2;
    @Column(name = "PROVA3")
    private Integer prova3;
    @Column(name = "MEDIA")
    private Integer media;
    @Size(max = 10)
    @Column(name = "STATUS")
    private String status;

    public Turma() {
    }

    public Turma(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Integer getProva1() {
        return prova1;
    }

    public void setProva1(Integer prova1) {
        this.prova1 = prova1;
    }

    public Integer getProva2() {
        return prova2;
    }

    public void setProva2(Integer prova2) {
        this.prova2 = prova2;
    }

    public Integer getProva3() {
        return prova3;
    }

    public void setProva3(Integer prova3) {
        this.prova3 = prova3;
    }

    public Integer getMedia() {
        return media;
    }

    public void setMedia(Integer media) {
        this.media = media;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Turma[ numero=" + numero + " ]";
    }
    
}
