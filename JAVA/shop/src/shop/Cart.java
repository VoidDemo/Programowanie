package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Cart {
    private List<Product> items = new ArrayList<>();
    private int cartCapacity = 5;
    private Printer printer;
    public void addItem(Product item){
        if (items.size()>=cartCapacity){
            throw new IllegalArgumentException("Koszyk jest pełny");
        }
        if (item==null){
            throw new IllegalArgumentException("Produkt nie może być nullem");
        }else{
            items.add(item);
        }
    }
//    public void printItems(){
//        int totalCost=0;
//        for (Product item:items ){
//            System.out.println(item.getName()+"-"+item.getCode()+"-"+item.getPrice());
//            totalCost+= item.getPrice();
//        }
//        System.out.println("Wartość koszyka "+totalCost+"gr");
//    }
    public void removeAllItems(){
        items.clear();
    }
    public void searchItem(String code){
        boolean found = false;
        for (Product item:items ){
            if (code== item.getCode()){
                found=true;
                System.out.println(item.getName()+"-"+item.getCode()+"-"+item.getPrice());
                break;
            }
        }
        if(!found){
            throw new NoSuchElementException("Brak produktu o podanym kodzie");
        }
    }

    public void removeItem(String code) {

        for (Product item:items ){
            if (code.equals(item.getCode())){
                items.remove(item);
                return;
            }

        }
        throw new IllegalArgumentException("Brak podanego produktu w koszyku");
    }
    public int TotalCost(){
        int totalCost=0;
        for (Product item:items ){
            totalCost+= item.getPrice();
        }
       return totalCost;
    }

    public void setPrinter(Printer printer)
    {
        this.printer = printer;
    }
    public void printItems()
    {
        this.printer.printCart(items);
    }
}
