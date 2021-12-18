package javaapplication2;
 
 
public class MainClass {
 
 
    public static void main(String[] args) {
        NewClass ob1 = new NewClass(12,56,143,"jan",true);
        System.out.println(ob1.getImie());
        System.out.println(ob1.getWaga());
        System.out.println(ob1.getWiek());
        System.out.println(ob1.getWzrost());
        System.out.println(ob1.isPlec());
    }
    
}
