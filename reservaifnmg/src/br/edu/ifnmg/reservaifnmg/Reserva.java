/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.reservaifnmg;

import java.util.Date;

public class Reserva {
    private int id;
    private Date dataInicio;
    private Date dataFim;
    private Date dataCadastro;
    private Pessoa responsavel;
    private Recurso recurso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
    
    public void abrir(){
        
    }
    
    public void insere(){
        
    }
    
    public void alterar(){
        
    }
    
    public void remove(){
        
    }  
    
}
