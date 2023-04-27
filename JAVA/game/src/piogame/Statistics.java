package piogame;

import java.util.HashMap;
import java.util.Map;

public class Statistics {
    private Map<String, Integer> stats = new HashMap<>();
    
    public void print(){
        System.out.println("---------------------");
        System.out.println("Tabela wyników");
        for(Map.Entry<String, Integer> entry : stats.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    
    public void winner(Player player){
        Integer s = stats.getOrDefault(player.getName(),0);
        s =s+1;
        stats.put(player.getName(),s);
        
    }
    
    public void clear(){
        stats.clear();
    }

}
