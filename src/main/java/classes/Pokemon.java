/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.List;
import java.util.ArrayList;



/**
 *
 * @author pedro
 */
public class Pokemon {

    public Pokemon() {
    }
    private int numero;
    private String nome;
    private List<Tipo> tipos;
    private int vida;
    private float peso;
    private int altura; //altura em centimetros
    private boolean evolui;
    
    public Pokemon(int numero, String nome,
            List<Tipo> tipos, 
            int vida, float peso, 
            int altura, boolean evolui){
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList();
        for(Tipo t:tipos){
            this.tipos.add(t);
        }
        this.vida = vida;
        this.peso = peso;
        this.altura = altura;
        this.evolui = evolui;
        
    }

    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setTipos(List<Tipo> tipos){
        this.tipos = new ArrayList();
        for(Tipo tipo: tipos){
            this.tipos.add(tipo);
        }
    }
    
    public String getTipoFraquezas(){
        String aux= "";
        for(Tipo t: this.tipos){
            aux += t.getFraquezas();
        }
        return aux;
    }
    public String getTipoResistencias(){
        String tipos = "";
        for(Tipo t:this.tipos){
            tipos += t.getResistencias();
        }
        return tipos;
    }
    
    public List<Tipo> getTipos(){
         return this.tipos;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return this.nome + " - " + this.numero;
    }

    
}



