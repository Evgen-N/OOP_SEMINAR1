

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfMilk getBottleOfMilk(String name, int volume) {
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume)
                    return bottleOfMilk;
            }
        }
        return null;
    }

    public BottleOfCola getBottleOfCola(String name, int volume) {
        for (Product product : products){
            if (product instanceof BottleOfCola){
                BottleOfCola bottleOfCola = (BottleOfCola)product;
                if (bottleOfCola.getName().equals(name) && bottleOfCola.getVolume() == volume)
                    return bottleOfCola;
            }
        }
        return null;
    }


}
