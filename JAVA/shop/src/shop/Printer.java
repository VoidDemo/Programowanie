package shop;

import java.util.List;

public class Printer implements CartPrinter{

    @Override
    public void printCart(List<Product> items) {
        if(items.size()==0)
        {
            System.out.println("Koszyk jest pusty :<");
            return;
        }
        for (Product item:items ){
            System.out.println(item.getName()+"-"+item.getCode()+"-"+item.getPrice());
        }
    }
}
