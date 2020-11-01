import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        
        UserIO userIO = new UserIOInput();
        Map<String, Student> students = new HashMap();
        
        boolean done = false;
        
        while(!done) {
           
            String action = userIO.readString("What would you like to do?");
            if(action.equals("add student")) {
                students.put(userIO.readString("Please insert the name of a student"), new Student());
                
            } else if (action.equals("add tests")) {
                String name = userIO.readString("Please insert the name of the student");
                int tests = userIO.readInt("Please enter the amount of tests you want to add");
                for (int i = 0; i < tests; i++) {
                    students.get(name).tests.add(userIO.readInt("Please enter the grade"));
                }
                System.out.println();
                
            } else if (action.equals("view class")) {
                Set<String> names = students.keySet(); 
                for(String n : names) {
                    System.out.println(n);
                }
                System.out.println();
                
            } else if (action.equals("view tests")) {
                String name = userIO.readString("Please insert the name of the student");
                for(Integer s: students.get(name).tests) {
                    System.out.println(s);
                }
                System.out.println();
                
            } else if (action.equals("remove student")) {
                String name = userIO.readString("Please insert the name of the student"
                        + "you want to remove");
                students.remove(name);
                System.out.println();
                
            } else if (action.equals("student average")) {
                String name = userIO.readString("Please insert the name of the student");
                int total = 0;
                int amount = 0;
                for(Integer s: students.get(name).tests) {
                    amount = amount + s;
                    total++;
                }
                int average = amount / total;
                System.out.println(average);
                System.out.println();
                
            } else if (action.equals("class average")) {
                int total = 0; 
                int amount = 0;
                Set<String> names = students.keySet();
                for(String n : names) {
                    for(Integer s: students.get(n).tests) {
                        amount = amount + s;
                        total++;
                    }
                }
                int average = amount / total;
                System.out.println(average);
                
            } else if (action.equals("lowest score")) {
                int lowest = 100;
                String name = null;
                Set<String> names = students.keySet();
                for(String n : names) {
                    for(Integer s: students.get(n).tests) {
                        if (s < lowest){
                            lowest = s;
                            name = n;
                        }
                    }
                }
                System.out.println(name + " " + lowest);
                System.out.println();
                
            } else if (action.equals("highest score")) {
                int highest = 0;
                String name = null;
                Set<String> names = students.keySet();
                for(String n : names) {
                    for(Integer s: students.get(n).tests) {
                        if (s > highest){
                            highest = s;
                            name = n;
                        }
                    }
                }
                System.out.println(name + " " + highest);
                System.out.println();
                
            } else if (action.equals("done")) {
                userIO.print("Have a good day");
                break;
            }
        }
    }
}
