

public class Fathi extends Ahmed  {
    
    public void overloading(String x , double y) {    /// diffrent signature
        System.out.println( x + y);
    }
    
    @Override
    public void overriding() {  
        String z = "F-";
        int a = 15 ;
        System.out.println("this is " + z + a);
    }

}
