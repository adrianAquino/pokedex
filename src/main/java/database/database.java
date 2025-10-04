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
public class database {

    //Model Pokemon
    private List<Pokemon> pokemons;
    private List<Tipo> tipos;

    public database() {
        this.pokemons = new ArrayList();
        this.tipos = new ArrayList();
//this.seeder();
    }

    public void seederTipos() {
        Tipo aco = new Tipo(1, "Aço");
        Tipo agua = new Tipo(2, "Agua");
        Tipo dragao = new Tipo(3, "Dragão");
        Tipo eletrico = new Tipo(4, "Elétrico");
        Tipo fada = new Tipo(5, "Fada");
        Tipo fantasma = new Tipo(6, "Fantasma");
        Tipo fogo = new Tipo(7, "Fogo");
        Tipo gelo = new Tipo(8, "Gelo");
        Tipo inseto = new Tipo(9, "Inseto");
        Tipo lutador = new Tipo(10, "Lutador");
        Tipo normal = new Tipo(11, "Normal");
        Tipo pedra = new Tipo(12, "Pedra");
        Tipo planta = new Tipo(13, "Planta");
        Tipo psiquico = new Tipo(14, "Psíquico");
        Tipo sombrio = new Tipo(15, "Sombrio");
        Tipo terrestre = new Tipo(16, "Terrestre");
        Tipo venenoso = new Tipo(17, "Venenoso");
        Tipo voador = new Tipo(18, "Voador");

        this.tipos.add(aco);
        this.tipos.add(agua);
        this.tipos.add(dragao);
        this.tipos.add(eletrico);
        this.tipos.add(fada);
        this.tipos.add(fantasma);
        this.tipos.add(fogo);
        this.tipos.add(gelo);
        this.tipos.add(inseto);
        this.tipos.add(lutador);
        this.tipos.add(normal);
        this.tipos.add(pedra);
        this.tipos.add(planta);
        this.tipos.add(psiquico);
        this.tipos.add(sombrio);
        this.tipos.add(terrestre);
        this.tipos.add(venenoso);
        this.tipos.add(voador);

        //originalmente os métodos addFraqueza e addResistencias só aceitam uma List<Tipo> como argumento
        //e não um único tipo
        ///List<Tipo> fraquezasAco = new ArrayList<>();
        ///fraquezasAco.add(fogo);
        /// pra solucionar isso foi adicionado uma sobrecarga de método para aceitar um tipo único
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

        // === DRAGÃO ===
        dragao.addFraqueza(gelo);
        dragao.addFraqueza(fada);
        dragao.addFraqueza(dragao);

        dragao.addResistencia(fogo);
        dragao.addResistencia(agua);
        dragao.addResistencia(eletrico);
        dragao.addResistencia(planta);

        // === ELÉTRICO ===
        eletrico.addFraqueza(terrestre);

        eletrico.addResistencia(eletrico);
        eletrico.addResistencia(voador);
        eletrico.addResistencia(aco);

        // === FADA ===
        fada.addFraqueza(venenoso);
        fada.addFraqueza(aco);

        fada.addResistencia(lutador);
        fada.addResistencia(inseto);
        fada.addResistencia(sombrio);

        // === FANTASMA ===
        fantasma.addFraqueza(fantasma);
        fantasma.addFraqueza(sombrio);

        fantasma.addResistencia(venenoso);
        fantasma.addResistencia(inseto);

        // === FOGO ===
        fogo.addFraqueza(agua);
        fogo.addFraqueza(pedra);
        fogo.addFraqueza(terrestre);

        fogo.addResistencia(fogo);
        fogo.addResistencia(planta);
        fogo.addResistencia(gelo);
        fogo.addResistencia(inseto);
        fogo.addResistencia(aco);
        fogo.addResistencia(fada);

        // === GELO ===
        gelo.addFraqueza(fogo);
        gelo.addFraqueza(lutador);
        gelo.addFraqueza(pedra);
        gelo.addFraqueza(aco);

        gelo.addResistencia(gelo);

        // === INSETO ===
        inseto.addFraqueza(fogo);
        inseto.addFraqueza(voador);
        inseto.addFraqueza(pedra);

        inseto.addResistencia(planta);
        inseto.addResistencia(lutador);
        inseto.addResistencia(terrestre);

        // === LUTADOR ===
        lutador.addFraqueza(voador);
        lutador.addFraqueza(psiquico);
        lutador.addFraqueza(fada);

        lutador.addResistencia(inseto);
        lutador.addResistencia(pedra);
        lutador.addResistencia(sombrio);

        // === NORMAL ===
        normal.addFraqueza(lutador);

        // Nenhuma resistência (exceto imunidade a Fantasma, que pode ser tratada com outro método)
        // === PEDRA ===
        pedra.addFraqueza(agua);
        pedra.addFraqueza(planta);
        pedra.addFraqueza(lutador);
        pedra.addFraqueza(terrestre);
        pedra.addFraqueza(aco);

        pedra.addResistencia(normal);
        pedra.addResistencia(fogo);
        pedra.addResistencia(venenoso);
        pedra.addResistencia(voador);

        // === PLANTA ===
        planta.addFraqueza(fogo);
        planta.addFraqueza(gelo);
        planta.addFraqueza(venenoso);
        planta.addFraqueza(inseto);
        planta.addFraqueza(voador);

        planta.addResistencia(agua);
        planta.addResistencia(eletrico);
        planta.addResistencia(planta);
        planta.addResistencia(terrestre);

        // === PSÍQUICO ===
        psiquico.addFraqueza(inseto);
        psiquico.addFraqueza(fantasma);
        psiquico.addFraqueza(sombrio);

        psiquico.addResistencia(lutador);
        psiquico.addResistencia(psiquico);

        // === SOMBRIO ===
        sombrio.addFraqueza(lutador);
        sombrio.addFraqueza(inseto);
        sombrio.addFraqueza(fada);

        sombrio.addResistencia(fantasma);
        sombrio.addResistencia(sombrio);

        // === TERRESTRE ===
        terrestre.addFraqueza(agua);
        terrestre.addFraqueza(gelo);
        terrestre.addFraqueza(planta);

        terrestre.addResistencia(venenoso);
        terrestre.addResistencia(pedra);

        // === VENENOSO ===
        venenoso.addFraqueza(terrestre);
        venenoso.addFraqueza(psiquico);

        venenoso.addResistencia(planta);
        venenoso.addResistencia(lutador);
        venenoso.addResistencia(venenoso);
        venenoso.addResistencia(inseto);
        venenoso.addResistencia(fada);

        // === VOADOR ===
        voador.addFraqueza(eletrico);
        voador.addFraqueza(gelo);
        voador.addFraqueza(pedra);

        voador.addResistencia(planta);
        voador.addResistencia(lutador);
        voador.addResistencia(inseto);
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
}
