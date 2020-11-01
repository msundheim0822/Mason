package com.mycompany.statesandcapitals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class StateCapitalsApp {
    
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        String filePath = "MoreStateCapitals.txt";
        HashMap<String, Capital> state = new HashMap<String, Capital>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("::", 4);
            if (parts.length >= 4) {
                String key = parts[0];
                String name = parts[1];
                String population = parts[2];
                String miles = parts[3];
                
                int pop = Integer.parseInt(population);
                double sqml = Double.parseDouble(miles);
                
                state.put(key, new Capital());
                state.get(key).setName(name);
                state.get(key).setPopulation(pop);
                state.get(key).setMiles(sqml);
            } else {
                System.out.println("ignoring line: " + line);
            }   
        }
        
        System.out.println(state.size());
        
        for (String s : state.keySet()) {
            System.out.println(s + " - " + state.get(s).getName() + " | Pop: " + 
                    state.get(s).getPopulation() + " | Area: " + 
                    state.get(s).getMiles() + " sq mi");
        }
        
        System.out.println();
        
        System.out.println("Please enter the lower limit for capital city population: ");
        int population = Integer.parseInt(input.nextLine());
        
        for (String s : state.keySet()) {
            if (state.get(s).getPopulation() > population) {
                System.out.println(s + " - " + state.get(s).getName() + " | Pop: " + 
                    state.get(s).getPopulation() + " | Area: " + 
                    state.get(s).getMiles() + " sq mi");
            }
        }
        
        System.out.println();
        
        System.out.println("Please enter the lower limit for capital city population: ");
        double miles = Integer.parseInt(input.nextLine());
        
        for (String s : state.keySet()) {
            if (state.get(s).getMiles() < miles) {
                System.out.println(s + " - " + state.get(s).getName() + " | Pop: " + 
                    state.get(s).getPopulation() + " | Area: " + 
                    state.get(s).getMiles() + " sq mi");
            }
        }
    }
    
}
