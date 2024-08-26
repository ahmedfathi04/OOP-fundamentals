

public class Fathi extends Ahmed  {
    
    public static void main(String[] args) {

    }

    public void overloading(String x , double y) {    /// diffrent signature
        x = "F-";
        y = 16 ;
        System.out.println( x + y);
    }
    
    @Override
    public void overriding() {  
        String z = "F-";
        int a = 15 ;
        System.out.println("this is " + z + a);
    }

}
