//Debug this class/code to make it run
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;

//    //protected static variable
//    protected static int count = 0;
    //created constructor
    public Product(){
        code ="";
        description = "";
        price = 0.0;

    }

    //Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString(){
        return "Code:               " + code + "\n" +
                "Description:       " + description + "\n" +
                "Price:             " + this.getFormattedPrice(price) + "\n";

    }

    private String getFormattedPrice(){
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        nf.setRoundingMode(RoundingMode.HALF_UP);
        return nf.format(price);
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
