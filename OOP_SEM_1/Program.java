

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product("ООО Источник", "_", -100);
        //product1.brand = "ООО Источник";
        //product1.name = "_";
        //product1.price = -100;
        product1.setName("43");
        System.out.println(product1.displayInfo());


        Product product2 = new Product();
        System.out.println(product2.displayInfo());


        Product product3 = new Product("Бутылка с водой (3)", 50);
        System.out.println(product3.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 150, 2, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Источник", "Бутылка с водой (5)", 150, 2, 15);
        System.out.println(bottleOfWater1.displayInfo());


        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 110, 1, 15);
        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 160, 2, 25);
        Product bottleOfMilk4 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 170, 3, 35);

        Product bottleOfCola1 = new BottleOfCola("ООО Нева", "Бутылка лимонада (1)", 130, 2, 200, "Вишня");
        System.out.println(bottleOfCola1.displayInfo());

        Product bottleOfCola2 = new BottleOfCola("ООО Нева", "Бутылка лимонада (2)", 150, 1, 100, "Кола");
        Product bottleOfCola3 = new BottleOfCola("ООО Нева", "Бутылка лимонада (3)", 180, 2, 200, "Лимон");
        Product bottleOfCola4 = new BottleOfCola("ООО Нева", "Бутылка лимонада (4)", 230, 3, 300, "Апельсин");

        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(bottleOfMilk1);
        arrayList.add(bottleOfWater1);
        arrayList.add(bottleOfMilk2);
        arrayList.add(bottleOfMilk3);
        arrayList.add(bottleOfMilk4);
        arrayList.add(bottleOfCola1);
        arrayList.add(bottleOfCola2);
        arrayList.add(bottleOfCola3);
        arrayList.add(bottleOfCola4);

        VendingMachine vendingMachine = new VendingMachine(arrayList);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком (3)", 2);
        if (bottleOfMilk != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }

        BottleOfCola bottleOfCola = vendingMachine.getBottleOfCola("Бутылка лимонада (2)", 1);
        if (bottleOfMilk != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfCola.displayInfo());
        }
        else {
            System.out.println("Такой бутылки лимонада нет в автомате.");
        }

    }

}
