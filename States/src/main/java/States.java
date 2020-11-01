import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

public class States {
    
    public static void main( String[] args ) throws IOException{
        
        Scanner input = new Scanner(System.in);
        String filePath = "StateCapitals.txt";
        HashMap<String, String> map = new HashMap<String, String>();
        Random rand = new Random();
        int quest = rand.nextInt(50);
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("::", 2);
            if (parts.length >= 2) {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            } 
        }
        System.out.println(map.size());

        for (String key : map.keySet()){
            System.out.println(key + ", " + map.get(key));
        }
        
        Collection<String> values = map.values();
        Set<String> keySet = map.keySet();
        
        String[] state = keySet.toArray(new String[keySet.size()]);
        String[] capital = values.toArray(new String[values.size()]);
        
        System.out.println("What is the capital of " + state[quest] +"?");
        String answer = input.nextLine();
        
        if(answer.equals(capital[quest])) {
            System.out.println("You are correct!");
        } else 
            System.out.println("Wrong!, it's " + capital[quest]);
    }
}
