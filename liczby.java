
package liczby;


public class liczby {
    public static void main(String[] args) {
    
        MyNumber ob1 = new MyNumber(2.42);
        MyNumber ob2 = new MyNumber(1.2);
        
        System.out.println(ob1.isEven());
        System.out.println(ob1.isOdd());
        System.out.println(ob1.sqrt());
        System.out.println("pierwiastek " + ob1.pow(ob2));
        System.out.println(ob1.add(ob2));
        System.out.println(ob1.subract(ob2));        
    }
  }
