

public class HotDrinkVendigMacine extends VendingMacine {

    public HotDrinkVendigMacine(){
        System.out.println("Выбрано меню горячих напитков");
    }

    public void getProduct(){
        System.out.println("Горячий напиток выдан");
    }
    public void getProduct(String name){
        System.out.printf("Горячий напиток: %s", name);
    }
}
