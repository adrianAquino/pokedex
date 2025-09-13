/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Tipo {
    int indice;
    String nome;
    int fraqueza;
    int resistencia;
    
    public Tipo(int indice,String nome){
        this.indice = indice;
        this.nome = nome;
    }
    
    public Tipo (int indice, String nome, int fraqueza, int resistencia){
        this.indice = indice;
        this.nome = nome;
        this.fraqueza = fraqueza;
        this.resistencia = resistencia;
    }
    
    public void setFraqueza(int fraqueza){
        this.fraqueza = fraqueza;
    }
    
    public void setResistencia(int Resistencia){
        this.resistencia = resistencia;
    }
    public String getNome(){
        return this.nome;
    }
    
    
}
