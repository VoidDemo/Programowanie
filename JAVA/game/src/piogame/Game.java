package piogame;

import stats.NullStatistics;
import stats.Statistics;
import stats.WinStatistics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

public class Game {
    
    private Statistics statistics;
    public Game(){
        this(null);
    }
    public Game(Statistics statistics){
        if(statistics==null){
            this.statistics=new NullStatistics();
        }else{
            this.statistics=statistics;
        }
    }
    
    private List<Player> players = new ArrayList(); //list przechwoująca graczy
    private Random rand = new Random();     //obiekt losujący

    public void addPlayer(Player player) {
        if (!nameExists(player.getName())) {
            players.add(player);
        } else {
            player.setName(player.getName() + rand.nextInt(10));
            addPlayer(player);
        }
    }

    private boolean nameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void play() {
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza
        boolean repeat=true;

        do {
            System.out.println("---------------------");
            repeat = true;
            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : players) {
                guess = player.guess(); // odgadywanie zlecamy obiektowi klasy Player
                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("PUDŁO!");
                } else {
                    System.out.println("BRAWO!");
                    statistics.winner(player);
                    repeat = false;
                }
            }
        } while (repeat);
    }
    

    
    public void printPlayers() {
        System.out.println("-----GRACZE-----");
        players.forEach(player->{
            System.out.println(player.getName());
        });
    }

    public void removePlayer(String name) {
        /*
        for (Player player:players){
            if(player.getName().equals(name))
                players.remove(player);
                break;
        }
        */
        /*
        for (Iterator<Player> it = players.iterator(); it.hasNext();){
            if(it.next().getName().equals(name)){
                it.remove();
                break;
            }
        
        }*/
        
        players.removeIf(player -> player.getName().equals(name));  //dobre do odsiewania
    }
    
    public void printStatistics(){
        statistics.print();
    }
    
    public void clearStatistics(){
        statistics.clear();
    }

}
