public class Product {

    //constructor
    public Product(int id, String name, String description, double price, int stockAmount, String colour){
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.colour = colour;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    public Product(){       //overloading

    }

    //attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String colour;
    private String code;

    //getter
    public int getId(){     //encapsulation
        return id;
    }
    //setter
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getcolour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCode() {
        return this.name.substring(0,1) + id;
    }
}
