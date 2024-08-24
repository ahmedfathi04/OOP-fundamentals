public class product {

    private String productName ;
    private int productCode ;
    private double price ;

    public void setProductName (String productName) {
        this.productName = productName ;
    }

    public void setPrice (double price) {
        this.price = price ;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }


    public String getProductName () {
        return productName ;
    }

    public int getProducode () {
        return productCode ;
    }

    public double getPrice () {
        return price ;
    }
    

    public double  ApplyDiscount(int discount) {
        
        if (discount > 0 && discount < 100){

            price = price - ( price * (discount/100) ) ;
        
        }

        return price;
    }



}