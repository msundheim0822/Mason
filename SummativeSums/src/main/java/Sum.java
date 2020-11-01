public class Sum {
    
    int[] arr;
    
    public void Sum() {
        
    }
    
    public void setArray(int[] temp) {
        this.arr = temp;
    }
    
    public int getSum() {
        
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        
        return sum;
    }
}
