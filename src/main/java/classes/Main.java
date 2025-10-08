/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classes;
import database.Database;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Main {

    public static void main(String[] args) {
        //Pokemon(Numero, Nome, Tipo1, Tipo2?, vida, peso, altura, evolui)
          Database bd = new Database();
          bd.seederTipos();
          
          
        Tipo fogo = null;
        Tipo agua = null;
        Tipo aco = null;

        
        for (Tipo t : bd.getTipos()) {
            if (t.getNome().equals("Fogo")) fogo = t;
            if (t.getNome().equals("Agua") || t.getNome().equals("Agua")) agua = t;
            if (t.getNome().equals("Aco")) aco = t;
        }

        // Testar se as fraquezas e resistências foram adicionadas corretamente
        System.out.println(" Tipo: " + fogo.getNome());
        System.out.println("Fraquezas: " + fogo.getFraquezas());
        System.out.println("Resistências: " + fogo.getResistencias());
        System.out.println("------------------------");

        System.out.println("Tipo: " + agua.getNome());
        System.out.println("Fraquezas: " + agua.getFraquezas());
        System.out.println("Resistências: " + agua.getResistencias());
        System.out.println("------------------------");

        System.out.println("️ Tipo: " + aco.getNome());
        System.out.println("Fraquezas: " + aco.getFraquezas());
        System.out.println("Resistências: " + aco.getResistencias());
           
            
            
            
           
        }
}
