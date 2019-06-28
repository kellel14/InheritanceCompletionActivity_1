public class Software extends  Product {

    private String programmer;
    private String platform; //linux, mac, or pc
    private String os; //operating system
//created a constructor
    public Software(){

    }
    // created overloaded constructor
    public Software(String programmer, String platform, String os){
        this.programmer = programmer;
        this.platform = platform;
        this.os = os;
    }
}
