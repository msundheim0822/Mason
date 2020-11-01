import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {
    
    public static void main (String[] args) {
        
        Map<String, Integer> populations = new HashMap<>();
        
        populations.put("USA", 313000000);
        populations.put("Canada", 340000000);
        
        Set<String> keys = populations.keySet();
       
        Collection<Integer> popValues = populations.values();
        
        for (Integer p : popValues)
            System.out.println(p);
       }
}