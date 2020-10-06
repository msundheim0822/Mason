public class forByFor {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != 1) {
                        if((j == 0) || (j == 2))
                            System.out.print("*");
                        if(j == 1) {
                            System.out.print("$");
                        }
                    } else {
                       if((j == 0) || (j == 2))
                            System.out.print("@");
                        if(j == 1) {
                            System.out.print("#");
                        } 
                    }
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}