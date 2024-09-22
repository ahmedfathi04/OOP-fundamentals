public class circle extends Shape {
    
    double radius;
    double area;

    public circle(double r ){
        radius = r;
        
    }

    public double calculateArea(){
        area = 3.14 * radius * radius;
        System.out.println("circle area is: " + area);
        return area;
    }


}
