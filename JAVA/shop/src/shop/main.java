package shop;

public class main {
    public static void main(String[] args) {
        Cart koszyk=new Cart();
        Printer p = new Printer();
        koszyk.setPrinter(p);
        koszyk.addItem(new Product("Pomadka","AAA-B1111",30));
        koszyk.addItem(new Product("kapok","FGA-B3111",3000));
        koszyk.addItem(new Product("Ponton","ADA-B1131",60000));
        System.out.println("Przed usunięciem");
        koszyk.printItems();
        System.out.println("Wartość całkowita "+koszyk.TotalCost());
        System.out.println("------------------");
        koszyk.searchItem("ADA-B1131");
        System.out.println("------------------");
        System.out.println("Po usunięciu");
        koszyk.removeItem("FGA-B3111");
        koszyk.printItems();

    }
}
