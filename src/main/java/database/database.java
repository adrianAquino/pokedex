/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import classes.Pokemon;
import classes.Tipo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Database {

    //Model Pokemon
    private List<Pokemon> pokemons;
    private List<Tipo> tipos;

    public Database() {
        this.pokemons = new ArrayList();
        this.tipos = new ArrayList();
        this.seederTipos();
    }

    public void seederTipos() {
        Tipo aco = new Tipo("Aco");
         tipos.add(aco);
        Tipo agua = new Tipo("Agua");
         tipos.add(agua);
        Tipo dragao = new Tipo("Dragao");
        tipos.add(dragao);
        Tipo eletrico = new Tipo("Eletrico");
         tipos.add(eletrico);
        Tipo fada = new Tipo("Fada");
        tipos.add(fada);
        Tipo fantasma = new Tipo("Fantasma");
        tipos.add(fantasma);
        Tipo fogo = new Tipo("Fogo");
        tipos.add(fogo);
        Tipo gelo = new Tipo("Gelo");
         tipos.add(gelo);
        Tipo inseto = new Tipo("Inseto");
        tipos.add(inseto);
        Tipo lutador = new Tipo("Lutador");
        tipos.add(lutador);
        Tipo normal = new Tipo("Normal");
         tipos.add(normal);
        Tipo pedra = new Tipo("Pedra");
         tipos.add(pedra);
        Tipo planta = new Tipo("Planta");
        tipos.add(planta);
        Tipo psiquico = new Tipo("Psiquico");
        tipos.add(psiquico);
        Tipo sombrio = new Tipo("Sombrio");
        tipos.add(sombrio);
        Tipo terrestre = new Tipo("Terrestre");
        tipos.add(terrestre);
        Tipo venenoso = new Tipo("Venenoso");
        tipos.add(venenoso);
        Tipo voador = new Tipo("Voador");
        tipos.add(voador);

        

        /// AÇO
        List fraquezas = new ArrayList<>(List.of(fogo, terrestre, lutador));
        aco.setFraquezas(fraquezas);

        List resistencias = new ArrayList<>(List.of(normal, planta, gelo, voador, pedra, inseto, aco, psiquico, fada));
        aco.setResistencias(resistencias);

        // === ÁGUA ===
        fraquezas = new ArrayList<>(List.of(eletrico, planta));
        agua.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(fogo, agua, gelo, aco));
        agua.setResistencias(resistencias);

        // === DRAGÃO ===
        fraquezas = new ArrayList<>(List.of(gelo, fada, dragao));
        dragao.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(fogo, agua, eletrico, planta));
        dragao.setResistencias(resistencias);

        // === ELÉTRICO ===
        fraquezas = new ArrayList<>(List.of(terrestre));
        eletrico.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(eletrico, voador, aco));
        eletrico.setResistencias(resistencias);

        // === FADA ===
        fraquezas = new ArrayList<>(List.of(venenoso, aco));
        fada.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(lutador, inseto, sombrio));
        fada.setResistencias(resistencias);

        // === FANTASMA ===
        fraquezas = new ArrayList<>(List.of(fantasma, sombrio));
        fantasma.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(venenoso, inseto));
        fantasma.setResistencias(resistencias);

        // === FOGO ===
        fraquezas = new ArrayList<>(List.of(agua, pedra, terrestre));
        fogo.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(fogo, planta, gelo, inseto, aco, fada));
        fogo.setResistencias(resistencias);

        // === GELO ===
        fraquezas = new ArrayList<>(List.of(fogo, lutador, pedra, aco));
        gelo.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(gelo));
        gelo.setResistencias(resistencias);

        // === INSETO ===
        fraquezas = new ArrayList<>(List.of(fogo, voador, pedra));
        inseto.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(planta, lutador, terrestre));
        inseto.setResistencias(resistencias);

        // === LUTADOR ===
        fraquezas = new ArrayList<>(List.of(voador, psiquico, fada));
        lutador.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(inseto, pedra, sombrio));
        lutador.setResistencias(resistencias);

        // === NORMAL ===
        fraquezas = new ArrayList<>(List.of(lutador));
        normal.setFraquezas(fraquezas);

        // Nenhuma resistência (exceto imunidade a Fantasma, tratada separadamente)
        // === PEDRA ===
        fraquezas = new ArrayList<>(List.of(agua, planta, lutador, terrestre, aco));
        pedra.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(normal, fogo, venenoso, voador));
        pedra.setResistencias(resistencias);

        // === PLANTA ===
        fraquezas = new ArrayList<>(List.of(fogo, gelo, venenoso, inseto, voador));
        planta.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(agua, eletrico, planta, terrestre));
        planta.setResistencias(resistencias);

        // === PSÍQUICO ===
        fraquezas = new ArrayList<>(List.of(inseto, fantasma, sombrio));
        psiquico.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(lutador, psiquico));
        psiquico.setResistencias(resistencias);

        // === SOMBRIO ===
        fraquezas = new ArrayList<>(List.of(lutador, inseto, fada));
        sombrio.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(fantasma, sombrio));
        sombrio.setResistencias(resistencias);

        // === TERRESTRE ===
        fraquezas = new ArrayList<>(List.of(agua, gelo, planta));
        terrestre.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(venenoso, pedra));
        terrestre.setResistencias(resistencias);

        // === VENENOSO ===
        fraquezas = new ArrayList<>(List.of(terrestre, psiquico));
        venenoso.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(planta, lutador, venenoso, inseto, fada));
        venenoso.setResistencias(resistencias);

        // === VOADOR ===
        fraquezas = new ArrayList<>(List.of(eletrico, gelo, pedra));
        voador.setFraquezas(fraquezas);

        resistencias = new ArrayList<>(List.of(planta, lutador, inseto));
        voador.setResistencias(resistencias);
        /*
       -------------------------------------------------------------------------------------------------------
        //originalmente os métodos addFraqueza e addResistencias só aceitam uma List<Tipo> como argumento
        //e não um único tipo, sendo feito talvez dessa forma abaixo
        //List<Tipo> fraquezasAco = new ArrayList<>();
        //fraquezasAco.add(fogo);
        /// para o caso de não querer cirar uma lista, foi adicionado uma sobrecarga de método para aceitar um tipo único
        //dessa forma posso fazer assim,
      
        aco.addFraqueza(fogo);
        aco.addFraqueza(terrestre);
        aco.addFraqueza(lutador);

        aco.addResistencia(normal);
        aco.addResistencia(planta);
        aco.addResistencia(gelo);
        aco.addResistencia(voador);
        aco.addResistencia(pedra);
        aco.addResistencia(inseto);
        aco.addResistencia(aco);
        aco.addResistencia(psiquico);
        aco.addResistencia(fada); 
        
        
        
        // === ÁGUA ===
        agua.addFraqueza(eletrico);
        agua.addFraqueza(planta);

        agua.addResistencia(fogo);
        agua.addResistencia(agua);
        agua.addResistencia(gelo);
        agua.addResistencia(aco);
        
       --------------------------------------------------------------------------------------------------------
         */

    }

    public void seederPokemon() {
        /*pokemons.add(new Pokemon(546, "Cottonee", "Planta", "Fada", 50,0.6f, 30, true)); //Adrian Kauan Aquino de Melo
    pokemons.add(new Pokemon(572, "Minccino","Normal", 50,5,4,true));//Ana Louise Lima Silva
    pokemons.add(new Pokemon(103, "Exeggutor", "Planta", 140, 120, 200, true));//Ana Paula de O. de Freitas
    pokemons.add(new Pokemon(696, "Clauncher", "Aquático", 60, 8, 50, true));//André Lucas Silva de Oliveira
    pokemons.add(new Pokemon(109, "koffing","poison",null, 40, 1, 6, true));//Bruno Garcia Souza
    pokemons.add(new Pokemon(194, "Wooper", "Água", "Ground", 55, 8.5f, 40, true));//Bruno Monteiro
    pokemons.add(new Pokemon(215, "Sneseal","Dark", 60, 28,90,true));//Felipe Jazon Lima
    pokemons.add(new Pokemon(50,  "Diglett", "Terra", 40, 0.8f, 20, true));//Gabriel Costa
    pokemons.add(new Pokemon(86,  "Seel", "Agua", 80, 90, 110, true));//Gabriel Pelizari
    pokemons.add(new Pokemon(412, "Burmy", "Bug", 40, 3.4f, 20, true));//Guilherme Yuiti Rufino Okamoto
    pokemons.add(new Pokemon(155, "Cyndaquil", "Fogo", 60, 7.9f, 50, true)); //Heitor Felipe
    pokemons.add(new Pokemon(193, "Yanma","Bug","Flying",70,38.0f,120,true));//Jhimy Kenedy S. Ferrari
    pokemons.add(new Pokemon(599, "Klink", "Aço", 60,  0.3f, 21,true));//João Felipe do Nascimento Lopes
    pokemons.add(new Pokemon(39,  "Jigglypuff", "Normal", "Fada", 70, 5.5f, 50, true));//João Victor Codato Cuculo
    pokemons.add(new Pokemon(515, "Panpour", "Agua", 60, 13, 60, false));//Lívia Maria dos Santos
    pokemons.add(new Pokemon(636, "Larvesta", "inseto", "fogo", 70, 28.8f, 110, true));//Luiz Gustavo Cardoso
    pokemons.add(new Pokemon(77,  "Ponyta", "Fogo", 60, 30, 1, true));//Maria Eduarda Buchweitz Trovilho
    pokemons.add(new Pokemon(391, "Monferno ","Fogo", "Lutador", 64, 22.0f, 90, true));//Matheus Pereira Garcia
    pokemons.add(new Pokemon(21,  "Spearow", "Voador", 60, 2, 30,true));//Murilo Augusto
    pokemons.add(new Pokemon(53,  "Persian", "Normal", 90, 32, 100, false));//Orlando Cabrera
    pokemons.add(new Pokemon(179, "Mareep", "Eletrico", 60, 7.8f, 60, true));//Renan Pacheco Cavalcanti
    pokemons.add(new Pokemon(712, "Bergmite","Gelo",null, 70, 99.5f, 1,true));//Ryan Rigoto
    pokemons.add(new Pokemon(226, "Mantine","Água","Voador",85, 220f, 2,false));//WILLIAN WITTIENZO
    pokemons.add(new Pokemon(25, "Pikachu","Eletrico", 35, 6.0f, 40,true));//Pedro Baleroni
         */
    }

    public Pokemon buscaPokemon(int id) {

        for (Pokemon p : pokemons) {
            if (p.getNumero() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Tipo> getTipos() {
        return this.tipos;
    }
    
    public Tipo buscaTipo(String nome){
        for (Tipo t : tipos){
            if(t.getNome() == nome){
                return t;
            }
        }
        return null;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }
}
