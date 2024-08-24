
    public class recipt{

    public static void main (String [] args) {

        product p1 = new product();

        p1.setProductName("smart phone");
        p1.setProductCode(556846);
        p1.setPrice(7550.63);

        p1.ApplyDiscount(30);

        System.out.println ("product name: " + p1.getProductName()) ;    
        System.out.println ("product code: " + p1.getProducode()) ;    
        System.out.println ("producr price $" + p1.getPrice()) ;    
    
    }

}