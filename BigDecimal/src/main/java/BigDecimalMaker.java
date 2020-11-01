
import java.math.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mason
 */
public class BigDecimalMaker {

    public BigDecimalMaker(String string) {
    }
    
    public static void main(String[] args) {
     
        BigDecimal a = new BigDecimal("42.35");
        
        BigDecimal b = a.setScale(1, RoundingMode.HALF_UP);
        System.out.println(b.toString()); // 42.4
   }


}
