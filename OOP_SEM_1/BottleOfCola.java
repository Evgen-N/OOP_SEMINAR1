

public class BottleOfCola extends Product{

    private int volume; // объем
    private int sugar; // Содержание сахара
    private String flavor; // вкус

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public BottleOfCola(String brand, String name, double price, int volume, int sugar, String flavor) {
        super(brand, name, price);
        this.volume = volume;
        this.sugar = sugar;
        this.flavor = flavor;
    }

    @Override
    public String displayInfo() {
        return String.format("[ЛИМОНАД] %s - %s - %.2f - объем: %d; сахар: %d; вкус: %s",
                brand, name, price, volume, sugar, flavor);
    }
}
