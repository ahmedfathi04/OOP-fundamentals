public class Area extends Calc {
    
    double lenght ;
    double width ;

    public Area(double l , double w) {
        lenght = l;
        width = w;
    }

    @Override
    public double calculateArea() {
        return lenght * width ;
    }

}
