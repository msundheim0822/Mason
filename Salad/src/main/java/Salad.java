public class Salad {
    
     public static void main(String[] args) {
         
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", 
                          "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", 
                          "Braeburn Apple", "Blueberry", "Strawberry", 
                          "Navel Orange", "Pink Pearl Apple",  "Raspberry", 
                          "Blood Orange", "Sungold Tomato", "Fuji Apple", 
                          "Blackberry", "Banana", "Pineapple", "Florida Orange", 
                          "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", 
                          "Snozzberry"};
        
        String[] fruitSalad = new String[12];
        
        int fruitCounter = 0;
        int appleCount = 0;
        int orangeCount = 0;

        for (int i = 0; i < fruit.length; i++) {
            if((fruit[i].contains("Apple")) && (appleCount < 3)) {
                fruitSalad[fruitCounter] = fruit[i];
                appleCount++;
                fruitCounter++;
            } else if ((fruit[i].contains("Orange")) && (orangeCount < 2)) {
                fruitSalad[fruitCounter] = fruit[i];
                orangeCount++;
                fruitCounter++;
            } else if ((fruit[i].contains("berry")) && (fruitCounter < 12)) {
                fruitSalad[fruitCounter] = fruit[i];
                fruitCounter++;
            } else if ((!fruit[i].contains("Tomato")) && (fruitCounter < 12) 
                        && (!fruit[i].contains("Apple")) && (!fruit[i].contains("Orange"))) {
                fruitSalad[fruitCounter] = fruit[i];
                fruitCounter++;
            }
        }
        
        for (int i =0; i < fruitSalad.length; i++) {
            System.out.println(fruitSalad[i]);
        }
    }
}
