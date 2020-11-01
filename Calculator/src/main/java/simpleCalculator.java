
public class simpleCalculator {
    
    private double n1;
    private double n2;
    private String operand;
    
    public simpleCalculator() {
        
    }
    
    public void setNum1(double num) {
        this.n1 = num;
    }
    
    public void setNum2 (double num) {
        this.n2 = num;
    }
    
    public void setOperand(String op) {
        this.operand = op;
    }
    
    public double getResult() {
        
        double total = 0;
        
        if (operand.equals("+")) {
            total = n1 + n2;
        } else if (operand.equals("-")) {
            total = n1 - n2;
        } else if (operand.equals("*")) {
            total = n1 * n2;
        } else if (operand.equals("/")) {
            total = n1 / n2;
        }
        
        return total;
    }
}
