package piogame;

import stats.WinStatistics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * Gra w odgadywanie wylosowanej liczby.
 *
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracz (też komputer) stara się odgadnąć liczbę (też losuje)
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class PioGame {

    public static void main(String[] args) {
        Game game = new Game(new WinStatistics());
        
        game.addPlayer(new PlayerComp("Janusz"));
        game.addPlayer(new PlayerComp("Stefan"));
        game.addPlayer(new PlayerComp("Zocha"));
        game.addPlayer(new PlayerComp("Zocha"));
   
        game.printPlayers();
        
        
        for(int i=0; i<10; i++)
            game.play();
        
        
        //game.removePlayer("Zocha");
        game.printPlayers();
        game.printStatistics();
        
    }

}