/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

/**
 *
 * @author SATC
 */
public class Nota {
    private String disciplica;
    private float nota;
    private TipoAvaliacao tipo;    

    public Nota(String disciplica, float nota, TipoAvaliacao tipo) {
        this.disciplica = disciplica;
        this.nota = nota;
        this.tipo = tipo;
    }

    public TipoAvaliacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoAvaliacao tipo) {
        this.tipo = tipo;
    }

   

    

    public String getDisciplica() {
        return disciplica;
    }

    public void setDisciplica(String disciplica) {
        this.disciplica = disciplica;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" + "disciplina=" + disciplica + ", nota=" + nota + ", tipo=" + tipo + "}\n";
    }

    
    
    
}
