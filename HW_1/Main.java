import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // List<VendingMacine> vm = new ArrayList<>();
        // vm.add(new VendingMacine());
        // vm.add(new HotDrink());

        // for (VendingMacine i: vm){
        //     i.restore();
        // }
        
        Product product5 = new HotDrink("Чай", 90, 85);
        //System.out.println(product5);
        HotDrink product6 = new HotDrink("Горячий шоколад", 120, 85);
        //System.out.println(product6);
        Product product7 = new HotDrink("Кофе", 90, 85);
        //System.out.println(product7);

        List<HotDrinkVendigMacine> hotDrinkVM = new ArrayList<>();

        hotDrinkVM.add(new HotDrinkVendigMacine());

        //System.out.println(hotDrinkVM);

        for (HotDrinkVendigMacine drinks: hotDrinkVM){
            drinks.getProduct();
            //System.out.println(drinks);
        }
    }
}
