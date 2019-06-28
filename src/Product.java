//Debug this class/code to make it run

public class Product {

    private String code;
    private String description;
    private String price;

    //protected static variable
    protected static int count = 0;
    //created constructor
    public Product(){
        code ="";
        description = "";
        price = 0;

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

    }

    // Create public access for the count varibale
    public static  int getCount(){
        return count;
    }



}
