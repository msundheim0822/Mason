public class Fruits {
    
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        for (int i = 0; i < fruitBasket.length; i++) {
            
            if (fruitBasket[i].equals("Orange")){
                numOranges++;
            } else if (fruitBasket[i].equals("Apple")) {
                numApples++;
            } else {
                numOtherFruit++;
            }
        }
        
        int totalFruits = numOranges + numApples + numOtherFruit;
        
        System.out.println("Total# of Fruit in Basket: " + totalFruits);
        System.out.println("Number of Apples: " + numOranges);
        System.out.println("Number of Oranges: " + numApples);
        System.out.println("Number of Other Fruit: " + numOtherFruit);
    }
}
