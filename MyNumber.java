
package liczby;


public class MyNumber {
    
    private double value;

    public MyNumber(double value) {
        this.value = value;
    }
    
    public boolean isOdd(){
        return ! isEven();
    
    }
    public boolean isEven() {
        return value % 2 == 0;
    }

    public double sqrt() {
        return Math.sqrt(value);
    }

    public MyNumber pow(MyNumber x) {
        return new MyNumber(Math.pow(value,x.value));
    }

    public MyNumber add(MyNumber x) {
        return new MyNumber(value + x.value);
    }

    public MyNumber subract(MyNumber x) {
        return new MyNumber(value - x.value);
    }
    @Override
    public String toString() {
       return String.valueOf(value);
    }
   
    
}
