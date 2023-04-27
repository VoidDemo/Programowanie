package shop;

public class Product {
    private String name;
    private String code;
    private int price;

    public Product(String name, String code, int price){
        this.name=name;
        if(code.matches("^([A-Z\s]){3}[-][B]{1}[0-9]{4}")){
            this.code = code;
        }else{
            throw new IllegalArgumentException("Błędny kod towaru");
        }
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
