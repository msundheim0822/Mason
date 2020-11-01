import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Daily {
    
    public static void main(String args[]) {
    
        ArrayList<Integer> aList = new ArrayList<>();
      
      aList.add(1);
      aList.add(1);
      aList.add(1);
      aList.add(2);
      aList.add(1);

      
      System.out.println(equal(aList));
    }
    
    public static boolean equal(ArrayList<Integer> list) {
        
        int size2 = 0;
        int size1 = 0;
        
        if (list.size() % 2 == 0) {
            size1 = list.size() / 2;
            size2 = size1;
        } else {
            size1 =list.size() / 2 + 1;
            size2 = list.size() / 2;
        }
        
        System.out.println(size1);
        System.out.println(size2);
        
        int sum1 = 0;
        int sum2 = 0;
        
        int i = 0;
        
        for (int nums: list) {  
            if (i < size1) {
                sum1+= nums;
            } else {
                sum2 += nums;
            }   
            i++;
        }
        
        if (sum1 == sum2)
            return true;
        else
            return false;
    }
}
