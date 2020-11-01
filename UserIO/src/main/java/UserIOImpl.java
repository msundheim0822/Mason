import java.util.Scanner;
        
public class UserIOImpl implements UserIO{
    
    Scanner input = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public int readString(String prompt) {
        int num = Integer.parseInt(prompt);
        return num;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        int number = Integer.parseInt(input.nextLine());
        return number;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
       
        int between = 0;
        
        boolean notBetween = false;
        
        while(!notBetween) {
            between = Integer.parseInt(input.nextLine());
            if ((between < min) || between > max) {
                System.out.println("Not valid! Give me a number between " + min + " and " + max);
            } else 
                notBetween = true;
        }
        return between;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double number = Double.parseDouble(input.nextLine());
        return number;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
       
        double between = 0;
        
        boolean notBetween = false;
        
        while(!notBetween) {
            between = Double.parseDouble(input.nextLine());
            if ((between < min) || between > max) {
                System.out.println("Not valid! Give me a number between " + min + " and " + max);
            } else 
                notBetween = true;
        }
        return between;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float number = Float.parseFloat(input.nextLine());
        return number;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println(prompt);
       
        float between = 0;
        
        boolean notBetween = false;
        
        while(!notBetween) {
            between = Float.parseFloat(input.nextLine());
            if ((between < min) || between > max) {
                System.out.println("Not valid! Give me a number between " + min + " and " + max);
            } else 
                notBetween = true;
        }
        return between;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long number = Long.parseLong(input.nextLine());
        return number;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
       
        long between = 0;
        
        boolean notBetween = false;
        
        while(!notBetween) {
            between = Long.parseLong(input.nextLine());
            if ((between < min) || between > max) {
                System.out.println("Not valid! Give me a number between " + min + " and " + max);
            } else 
                notBetween = true;
        }
        return between;
    }
}