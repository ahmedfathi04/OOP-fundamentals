public class Rectangle extends Shape {
    
    double width;
    double lenght;
    double area;

    public Rectangle(double w , double l ){
        width = w;
        lenght = l;
        
    }

    
    @Override
    public double calculateArea(){
        area = width * lenght;
        System.out.println("rectangle area is: " + area);
        return area;
    }
    
}
