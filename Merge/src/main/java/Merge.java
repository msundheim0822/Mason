public class Merge {
    
    public static void main(String[] args) {
      int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49};
      int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100};
      int[] wholeNumbers = new int[24];
      int count = 0;
      
      for(int i = 0; i < firstHalf.length; i++) { 
         wholeNumbers[i] = firstHalf[i];
         count++;
      } 
      for(int i = 0; i < secondHalf.length;i++) { 
         wholeNumbers[count++] = secondHalf[i];
      } 
      for(int i = 0;i < wholeNumbers.length;i++) 
          System.out.println(wholeNumbers[i]);
   } 
}
